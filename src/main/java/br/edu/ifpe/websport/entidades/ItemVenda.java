/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.entidades;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")// ignora warning deste tipo
@Entity // serve para dizer que o ItemVenda é uma entidade do hibernate, atraves dele será gerada uma tabela
public class ItemVenda extends Produto{
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(nullable = false)
	private BigDecimal valorParcial;
        
        @Column(nullable = false)
	private BigDecimal preço;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Produto produto;
	

	

	
	
	public Short getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	
	
	public BigDecimal getValorParcial() {
		return valorParcial;
	}
	public void setValorParcial(BigDecimal valorParcial) {
		this.valorParcial = valorParcial;
	}

	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	
	
	
}
