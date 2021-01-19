package br.edu.ifpr.entidades;

import br.edu.ifpr.exceptions.IdadeInvalidaException;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String sexo;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		
		if(nome == null || nome.equals("")) {
			throw new Exception("nome não pode ser vazio");
		}
		
		this.nome = nome;
	} 
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) throws IdadeInvalidaException {
		
		if(idade < 18) {
			throw new IdadeInvalidaException("pessoa não pode ser menor de idade");
		}
		
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
