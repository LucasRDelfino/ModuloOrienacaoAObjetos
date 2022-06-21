package br.com.fiap.banco;

public class Cliente {
	private String nome;
	private String endereco;
	private int cpf;
	private String email;
	
	public Cliente(String nome, String endereco, int cpf, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}




}
