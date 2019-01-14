/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.entidades;

/**
 *
 * @author Neto
 */
public class Item {
    private Produto produto;
	private int quantidade;
	
        public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
        
        public Produto getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
