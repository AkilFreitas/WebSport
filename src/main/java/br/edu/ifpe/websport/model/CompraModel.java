/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.entidades.Compra;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.CompraImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class CompraModel {

    private RepositorioGenerico<Compra, Integer> repositorioCompra = null;

    public CompraModel() {
        this.repositorioCompra = new CompraImplBD();
    }

    public void inserir(Compra compra) throws Exception {

        if (compra != null) {
            this.repositorioCompra.inserir(compra);
        } else {
            throw new Exception("Compra invalida!!");
        }
    }

    public void alterar(Compra compra) throws Exception {

        if (compra != null) {
            this.repositorioCompra.alterar(compra);
        } else {
            throw new Exception("Compra invalida!!");
        }
    }

    public Compra recuperarCompra(int id) {
        return this.repositorioCompra.recuperar(id);
    }

    public void deletar(Compra c) throws Exception {
        if (c != null) {
            this.repositorioCompra.deletar(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Compra> recuperarTodos() {
        return this.repositorioCompra.recuperarTodos();
    }

}
