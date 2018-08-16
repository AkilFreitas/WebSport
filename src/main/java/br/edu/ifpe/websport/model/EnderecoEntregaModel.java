/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.EnderecoEntrega;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.EnderecoEntregaImplBD;
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
            throw new Exception("Endereco de entrega invalida!!");
        }
    }

    public void alterar(EnderecoEntrega enderecoEntrega) throws Exception {

        if (enderecoEntrega != null) {
            this.repositorioEnderecoEntrega.alterar(enderecoEntrega);
        } else {
            throw new Exception("Endereco de entrega invalida!!");
        }
    }

    public EnderecoEntrega recuperarEndereco(int id) {
        return this.repositorioEnderecoEntrega.recuperar(id);
    }

    public void deletar(EnderecoEntrega ee) throws Exception {
        if (ee != null) {
            this.repositorioEnderecoEntrega.inserir(ee);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<EnderecoEntrega> recuperarTodos() {
        return this.repositorioEnderecoEntrega.recuperarTodos();
    }

}
