package br.edu.ifpr.entidades;

import org.junit.Test;

import org.junit.Assert;

public class PessoaTest {
	
	@Test
	public void deve_criar_pessoa() {
		
		Pessoa sut = new Pessoa();
		Assert.assertNotNull(sut);
	}

}
