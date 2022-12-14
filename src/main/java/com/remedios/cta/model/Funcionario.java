package com.remedios.cta.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionarios")
public class Funcionario {

	private Long id;
	private String nome;
	private String telefone;
	private String cpf;
	private String email;
	private String senha;
	
	public Funcionario() {
	}

	public Funcionario(Long id, String nome, String telefone, String cpf, String email, String senha) {

		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
