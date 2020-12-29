package br.edu.ifpr.entidades;

public class Pessoa {
	
	private String nome;
	private Integer idade;

	public void setNome(String nome) {
		
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("nome nao pode ser nulo ou vazio");
		}
		
		this.nome = nome;
		
	}

	public void setIdade(Integer idade) {
		
		if(idade < 18) {
			throw new IllegalArgumentException("nao pode ser menor de idade");
		}
		
		this.idade = idade;
		
	}

}
