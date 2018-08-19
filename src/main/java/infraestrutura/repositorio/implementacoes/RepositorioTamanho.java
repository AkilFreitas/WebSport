/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Tamanho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioTamanho implements RepositorioGenerico<Tamanho, String> {

    private List<Tamanho> tamanhos = null;

    public RepositorioTamanho() {
        this.tamanhos = new ArrayList<>();
    }

    @Override
    public void inserir(Tamanho t) {
        this.tamanhos.add(t);
    }

    @Override
    public void alterar(Tamanho t) {
        for (Tamanho e : this.tamanhos) {
            if (e.getDimensao().equals(t.getDimensao())) {
                e.setId(t.getId());
                e.setPeso(t.getPeso());

                return;
            }
        }
    }

    //TIRAR DUVIDA COM O PROF
    @Override
    public Tamanho recuperar(String id) {
        for (Tamanho e : this.tamanhos) {
            if (e.getPeso().equals(id) & e.getDimensao().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Tamanho t) {
        this.tamanhos.remove(t);
    }

    @Override
    public List<Tamanho> recuperarTodos() {
        return this.tamanhos;
    }
}
