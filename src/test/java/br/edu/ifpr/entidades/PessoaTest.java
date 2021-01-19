package br.edu.ifpr.entidades;

import org.junit.Test;

import br.edu.ifpr.exceptions.IdadeInvalidaException;

import org.junit.Assert;

public class PessoaTest {
	
	
	@Test
	public void deve_criar_entidade_pessoa() {
		
		Pessoa sut = new Pessoa();	
		Assert.assertNotNull(sut);
			
	}
	
	@Test(expected = Exception.class)
	public void nome_nao_pode_ser_nulo_ou_vazio() throws Exception {
		
		//Cenários
		Pessoa sut = new Pessoa();	
		
		//acão
		sut.setNome("");
		
	}
	
	@Test(expected = IdadeInvalidaException.class)
	public void nao_pode_menor_de_idade() throws Exception {
		
		//Cenários
		Pessoa sut = new Pessoa();	
		
		//acão
		sut.setIdade(17);
		
	}
	

}
