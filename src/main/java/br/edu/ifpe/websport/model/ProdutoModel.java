/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Produto;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.ProdutoImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class ProdutoModel {

    private RepositorioGenerico<Produto, Integer> repositorioProduto = null;

    public ProdutoModel() {
        this.repositorioProduto = new ProdutoImplBD();
    }

    public void inserir(Produto produto) throws Exception {

        if (produto != null) {
            this.repositorioProduto.inserir(produto);
        } else {
            throw new Exception("Produto invalida!!");
        }
    }

    public void alterar(Produto produto) throws Exception {

        if (produto != null) {
            this.repositorioProduto.alterar(produto);
        } else {
            throw new Exception("Produto invalida!!");
        }
    }

    public Produto recuperarProduto(int id) {
        return this.repositorioProduto.recuperar(id);
    }

    public void deletar(Produto p) throws Exception {
        if (p != null) {
            this.repositorioProduto.deletar(p);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Produto> recuperarTodos() {
        return this.repositorioProduto.recuperarTodos();
    }
}
