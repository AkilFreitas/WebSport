/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mayco
 */
    
@Entity
@Table(name = "Carrinho")
public class Carrinho extends Produto {

    @Id
    private int id;
    
    @OneToMany
    private List<Produto> recebeProduto;
    
   
    
    public void recebeProduto(){
       recebeProduto = this.getRecebeProduto();
    }

    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public List<Produto> getRecebeProduto() {
        return recebeProduto;
    }

    public void setRecebeProduto(List<Produto> recebeProduto) {
        this.recebeProduto = recebeProduto;
    }   
 
}
