package br.edu.ifpr.entidades;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PessoaTest {
	
	
	@Test
	public void deve_criar_pessoa() {
		Pessoa sut = new Pessoa();
		
		assertNotNull(sut);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nome_nao_deve_ser_nulo_ou_vazio() {
		Pessoa sut = new Pessoa();
		
		sut.setNome("");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void pessoa_nao_pode_ser_menor_de_idade() {
		Pessoa sut = new Pessoa();
		
		sut.setIdade(17);
		
	}

}
