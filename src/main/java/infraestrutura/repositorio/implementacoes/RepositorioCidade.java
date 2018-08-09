/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Cidade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioCidade implements RepositorioGenerico<Cidade, String>{
    
     private List<Cidade> cidades = null;

    public RepositorioCidade() {
        this.cidades = new ArrayList<>();
    }

    @Override
    public void inserir(Cidade t) {
        this.cidades.add(t);
    }

    @Override
    public void alterar(Cidade t) {
        for (Cidade e : this.cidades) {
            if (e.getNome().equals(t.getNome())) {
                e.setId(t.getId());

                return;
            }
        }
    }

    @Override
    public Cidade recuperar(String id) {
        for (Cidade e : this.cidades) {
            if (e.getNome().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Cidade t) {
        this.cidades.remove(t);
    }

    @Override
    public List<Cidade> recuperarTodos() {
        return this.cidades;
    }
    
}
