/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Fornecedor;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.FornecedorImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class FornecedorModel {
    
    private RepositorioGenerico<Fornecedor,Integer> repositorioFornecedor = null;
    
    public FornecedorModel(){
         this.repositorioFornecedor = new FornecedorImplBD();
    }
    
    public void inserir(Fornecedor fornecedor) throws Exception {

        if (fornecedor != null) {
            this.repositorioFornecedor.inserir(fornecedor);
        } else {
            throw new Exception("Fornecedor invalido!!");
        }
    }

    public void alterar(Fornecedor fornecedor) throws Exception {

        if (fornecedor != null) {
            this.repositorioFornecedor.alterar(fornecedor);
        } else {
            throw new Exception("Fornecedor invalido!!");
        }
    }

 
    public Fornecedor recuperarFornecedor(int id) {
        return this.repositorioFornecedor.recuperar(id);
    }

    public void deletar(Fornecedor f) throws Exception {
        if (f != null) {
            this.repositorioFornecedor.deletar(f);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Fornecedor> recuperarTodos() {
        return this.repositorioFornecedor.recuperarTodos();
    }
    
}
