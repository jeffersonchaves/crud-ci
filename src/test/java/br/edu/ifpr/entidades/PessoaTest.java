package br.edu.ifpr.entidades;

import org.junit.Test;

import br.edu.ifpr.exceptions.NomeInvalidoException;

import org.junit.Assert;

public class PessoaTest {
	
	@Test
	public void deve_criar_pessoa() {
		
		Pessoa sut = new Pessoa();
		Assert.assertNotNull(sut);
	}
	
	@Test(expected = NomeInvalidoException.class)
	public void nao_deve_ter_nome_nulo_ou_vazio() throws NomeInvalidoException {
		
		Pessoa sut = new Pessoa();
		
		sut.setNome("");
		
	}

}
