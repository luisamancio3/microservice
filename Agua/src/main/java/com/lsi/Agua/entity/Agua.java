package com.lsi.Agua.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agua implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String marca;
	private Double precoFornecedor;
	private Double precoCompra;

	public Agua(Long id, String marca, Double precoFornecedor, Double precoCompra) {
		super();
		this.id = id;
		this.marca = marca;
		this.precoFornecedor = precoFornecedor;
		this.precoCompra = precoCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecoFornecedor() {
		return precoFornecedor;
	}

	public void setPrecoFornecedor(Double precoFornecedor) {
		this.precoFornecedor = precoFornecedor;
	}

	public Double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}