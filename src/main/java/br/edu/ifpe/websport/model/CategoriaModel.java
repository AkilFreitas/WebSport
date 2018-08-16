/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Categoria;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.CategoriaImplBD;

/**
 *
 * @author 20151d12gr0316
 */
public class CategoriaModel {
    
    private RepositorioGenerico<Categoria,Integer> repositorioCategoria = null;
    
    
    public CategoriaModel() {
        this.repositorioCategoria = new CategoriaImplBD();
    }
    
    public void inserir(Categoria categoria) throws Exception{
        
        if (categoria != null) {
            this.repositorioCategoria.inserir(categoria);
        } else {
            throw new Exception("Categoria invalida!!");
        }
    }
    
    
}
