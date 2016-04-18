package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

import junit.framework.Assert;

public class ClienteTest {
	
	@Test
	public void testaQueAConexaoComOSErvidorFunciona() {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos").request().get(String.class);
	    System.out.println(conteudo);
		//Assert.assertTrue(conteudo.contains("Rua Vergueiro 3185"));		
	}
}
