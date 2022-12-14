package com.remedios.cta.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_medicamentos")
public class Medicamento {

	
	private Long id;
	private String principio_ativo;
	private String nome_comercial;
	private String lote;
	private String validade;
	private String dosagem;
	private String laboratorio;
	private int quantidade_retirada;
	private String descricao;
	
	public Medicamento() {
	}

	public Medicamento(Long id, String principio_ativo, String nome_comercial, String lote, String validade,
			String dosagem, String laboratorio, int quantidade_retirada, String descricao) {

		this.id = id;
		this.principio_ativo = principio_ativo;
		this.nome_comercial = nome_comercial;
		this.lote = lote;
		this.validade = validade;
		this.dosagem = dosagem;
		this.laboratorio = laboratorio;
		this.quantidade_retirada = quantidade_retirada;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrincipio_ativo() {
		return principio_ativo;
	}

	public void setPrincipio_ativo(String principio_ativo) {
		this.principio_ativo = principio_ativo;
	}

	public String getNome_comercial() {
		return nome_comercial;
	}

	public void setNome_comercial(String nome_comercial) {
		this.nome_comercial = nome_comercial;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getQuantidade_retirada() {
		return quantidade_retirada;
	}

	public void setQuantidade_retirada(int quantidade_retirada) {
		this.quantidade_retirada = quantidade_retirada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
