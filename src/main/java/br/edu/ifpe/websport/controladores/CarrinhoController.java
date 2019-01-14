/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;
import br.edu.ifpe.websport.entidades.Carrinho;
import br.edu.ifpe.websport.entidades.Item;
import br.edu.ifpe.websport.entidades.Produto;


/**
 *
 * @author Neto
 */

public class CarrinhoController {
    
    private Produto produto;
    private int quantidade = 1;
    private int indiceDoItem;
    private Carrinho carrinho;

    public CarrinhoController(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public String adiciona() {
        Item item = new Item(produto, quantidade);
        carrinho.adicionar(item);
        return "carrinho";
    }

    public int quantidade() {
        return carrinho.getRecebeProduto().size();
    }
    
}
