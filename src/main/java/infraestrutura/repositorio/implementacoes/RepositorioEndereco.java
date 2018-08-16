/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioEndereco implements RepositorioGenerico<Endereco, String> {

    private List<Endereco> enderecos = null;

    public RepositorioEndereco() {
        this.enderecos = new ArrayList<>();
    }

    @Override
    public void inserir(Endereco t) {
        this.enderecos.add(t);
    }

    @Override
    public void alterar(Endereco t) {
        for (Endereco e : this.enderecos) {
            if (e.getCep().equals(t.getCep())) {
                e.setId(t.getId());
                e.setNumero(t.getNumero());
                e.setRua(t.getRua());
                e.setBairro(t.getBairro());
                e.setEstado(t.getEstado());
                e.setCidade(t.getCidade());
                return;
            }
        }
    }

    @Override
    public Endereco recuperar(String id) {
        for (Endereco e : this.enderecos) {
            if (e.getCep().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Endereco t) {
        this.enderecos.remove(t);
    }

    @Override
    public List<Endereco> recuperarTodos() {
        return this.enderecos;
    }
}
