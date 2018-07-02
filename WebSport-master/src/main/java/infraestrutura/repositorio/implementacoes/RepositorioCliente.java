/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioCliente implements RepositorioGenerico<Cliente, String> {

    private List<Cliente> clientes = null;

    public RepositorioCliente() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void inserir(Cliente t) {
        this.clientes.add(t);
    }

    @Override
    public void alterar(Cliente t) {
        for (Cliente e : this.clientes) {
            if (e.getNome().equals(t.getNome())) {
                e.setId(t.getId());
                e.setIdade(t.getIdade());
                e.setRg(t.getRg());
                e.setCpf(t.getCpf());
                e.setTelefone(t.getTelefone());
                e.setEmail(t.getEmail());
                e.setSenha(t.getSenha());
                e.setDataDeNascimento(t.getDataDeNascimento());
                e.setSexo(t.getSexo());
                e.setEndereco(t.getEndereco());
                e.setLogin(t.getLogin());

                return;
            }
        }
    }

    @Override
    public Cliente recuperar(String id) {
        for (Cliente e : this.clientes) {
            if (e.getNome().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Cliente t) {
        this.clientes.remove(t);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return this.clientes;
    }
}
