package com.remedios.cta.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pacientes")
public class Paciente {

	private Long id;
	private String nome;
	private String data_nascimento;
	private String cpf;
	private String telefone;
	private String email;
	
	public Paciente() {
	}

	public Paciente(Long id, String nome, String data_nascimento, String cpf, String telefone, String email) {
		
		this.id = id;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
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

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
