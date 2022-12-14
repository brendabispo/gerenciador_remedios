package com.remedios.cta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_retiradas")
public class Retirada {

	private Long id;
	private Date data_retirada;
	
	public Retirada() {
	}

	public Retirada(Long id, Date data_retirada) {
		this.id = id;
		this.data_retirada = data_retirada;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData_retirada() {
		return data_retirada;
	}

	public void setData_retirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}
	
	
}
