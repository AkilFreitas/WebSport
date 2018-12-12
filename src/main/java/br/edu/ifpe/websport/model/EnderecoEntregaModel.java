/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.entidades.EnderecoEntrega;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.EnderecoEntregaImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class EnderecoEntregaModel {

    private RepositorioGenerico<EnderecoEntrega, Integer> repositorioEnderecoEntrega = null;

    public EnderecoEntregaModel() {
        this.repositorioEnderecoEntrega = new EnderecoEntregaImplBD();
    }

    public void inserir(EnderecoEntrega enderecoEntrega) throws Exception {

        if (enderecoEntrega != null) {
            this.repositorioEnderecoEntrega.inserir(enderecoEntrega);
        } else {
            throw new Exception("Endereço de entrega invalido!!");
        }
    }

    public void alterar(EnderecoEntrega enderecoEntrega) throws Exception {

        if (enderecoEntrega != null) {
            this.repositorioEnderecoEntrega.alterar(enderecoEntrega);
        } else {
            throw new Exception("Endereço de entrega invalido!!");
        }
    }

    public EnderecoEntrega recuperarEnderecoEntrega(int id) {
        return this.repositorioEnderecoEntrega.recuperar(id);
    }

    public void deletar(EnderecoEntrega ee) throws Exception {
        if (ee != null) {
            this.repositorioEnderecoEntrega.deletar(ee);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<EnderecoEntrega> recuperarTodos() {
        return this.repositorioEnderecoEntrega.recuperarTodos();
    }

}
