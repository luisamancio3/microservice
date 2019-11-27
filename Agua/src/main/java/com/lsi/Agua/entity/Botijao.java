package com.lsi.Agua.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Botijao implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDateTime dataDeVencimento;
	private String condicoes;
	
	public Botijao(Long id, LocalDateTime dataDeVencimento, String condicoes) {
		super();
		this.id = id;
		this.dataDeVencimento = dataDeVencimento;
		this.condicoes = condicoes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDataDeVencimento() {
		return dataDeVencimento;
	}
	public void setDataDeVencimento(LocalDateTime dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
	public String getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
