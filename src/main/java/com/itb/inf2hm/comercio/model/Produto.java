package com.itb.inf2hm.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String codigoBarras;
	private double preco;
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
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// public : Acesso liberado para todas as classes
	// private : Propriedade (atributo ou método) só pode ser acessando
	//          dentro da própria classe
	

}
