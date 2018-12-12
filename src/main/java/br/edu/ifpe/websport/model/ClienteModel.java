/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Cliente;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.ClienteImplBD;
import java.util.List;

/**
 *
 * @author neto
 */
public class ClienteModel {

    private RepositorioGenerico<Cliente, Integer> repositorioCliente = null;

    public ClienteModel() {
        this.repositorioCliente = new ClienteImplBD();
    }

    public void inserir(Cliente cliente) throws Exception {

        if (cliente != null) {
            this.repositorioCliente.inserir(cliente);
        } else {
            throw new Exception("Cliente invalido!");
        }
    }

    public void alterar(Cliente cliente) throws Exception {

        if (cliente != null) {
            this.repositorioCliente.alterar(cliente);
        } else {
            throw new Exception("Cliente invalido!!");
        }
    }

    public Cliente recuperarCliente(int id) {
        return this.repositorioCliente.recuperar(id);
    }

    public void deletar(Cliente c) throws Exception {
        if (c != null) {
            this.repositorioCliente.deletar(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Cliente> recuperarTodos() {
        return this.repositorioCliente.recuperarTodos();
    }

    public Cliente recuperarClienteLogin(String login) {
        if (login == null) {
            return null;
        }
       return ((ClienteImplBD)this.repositorioCliente).recuperar(login);
    }

}
