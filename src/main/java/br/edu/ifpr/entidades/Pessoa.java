package br.edu.ifpr.entidades;

import br.edu.ifpr.exceptions.NomeInvalidoException;

public class Pessoa {
	
	private String nome;
	private String idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws NomeInvalidoException {
		
		if(nome == null || nome.equals("") ) {
			throw new NomeInvalidoException("nome inválido");
		}
		
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
}
