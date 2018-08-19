/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioCategoria implements RepositorioGenerico<Categoria, String> {

    private List<Categoria> categorias = null;

    public RepositorioCategoria() {
        this.categorias = new ArrayList<>();
    }

    @Override
    public void inserir(Categoria t) {
        this.categorias.add(t);
    }

    @Override
    public void alterar(Categoria t) {
        for (Categoria e : this.categorias) {
            if (e.getNome().equals(t.getNome())) {
                e.setId(t.getId());
                e.setDescricao(t.getDescricao());

                return;
            }
        }
    }

    // TIRAR DUVIDADA COM O PROF
    @Override
    public Categoria recuperar(String id) {
        for (Categoria e : this.categorias) {
           if (e.getNome().equals(id) & e.getDescricao().equals(id)) {
                return e;
            }
            /*
            if (e.getNome().equals(id)) {
                return e;
            } else if (e.getDescricao().equals(id)) {
                return e;
            }
             */
        }
        return null;
    }

    @Override
    public void deletar(Categoria t) {
        this.categorias.remove(t);
    }

    @Override
    public List<Categoria> recuperarTodos() {
        return this.categorias;
    }
}
