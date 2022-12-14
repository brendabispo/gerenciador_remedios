package com.remedios.cta.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estoques")
public class Estoque {

	
	private Long id;
	private int quantidade;
	
	public Estoque() {
	}

	public Estoque(Long id, int quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
