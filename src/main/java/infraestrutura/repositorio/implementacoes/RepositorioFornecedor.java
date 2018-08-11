/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akil
 */
public class RepositorioFornecedor implements RepositorioGenerico<Fornecedor, String> {

    private List<Fornecedor> fornecedores = null;

    public RepositorioFornecedor() {
        this.fornecedores = new ArrayList<>();
    }

    @Override
    public void inserir(Fornecedor t) {
        this.fornecedores.add(t);
    }

    @Override
    public void alterar(Fornecedor t) {
        for (Fornecedor e : this.fornecedores) {
            if (e.getNomeFantasia().equals(t.getNomeFantasia())) {
                e.setId(t.getId());
                e.setTelefone(t.getTelefone());
                e.setEmail(t.getEmail());
                e.setCnpj(t.getCnpj());
                return;
            }
        }
    }

    @Override
    public Fornecedor recuperar(String id) {
        for (Fornecedor e : this.fornecedores) {
            if (e.getNomeFantasia().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Fornecedor t) {
        this.fornecedores.remove(t);
    }

    @Override
    public List<Fornecedor> recuperarTodos() {
        return this.fornecedores;
    }
}
