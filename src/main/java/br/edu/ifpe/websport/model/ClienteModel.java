/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Cliente;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.ClienteImplBD;
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
            throw new Exception("Cliente invalida!!");
        }
    }

    
    
    
    public Cliente recuperarCliente(int id, Object obj) throws Exception {
        final Cliente other = (Cliente) obj;
        if (id != other.getId()) {
            return this.repositorioCliente.recuperar(id);
        } else {
            throw new Exception("Falha na recuperação do cliente!!");
        }

    }
     
    public Cliente recuperarCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deletar(Cliente c) throws Exception {
        if (c != null) {
            this.repositorioCliente.inserir(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Cliente> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
