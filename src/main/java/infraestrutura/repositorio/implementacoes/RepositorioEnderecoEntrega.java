/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import br.edu.ifpe.websport.model.entidades.EnderecoEntrega;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioEnderecoEntrega implements RepositorioGenerico<EnderecoEntrega, String> {

    private List<EnderecoEntrega> enderecoEntrega = null;

    public RepositorioEnderecoEntrega() {
        this.enderecoEntrega = new ArrayList<>();
    }

    @Override
    public void inserir(EnderecoEntrega t) {
        this.enderecoEntrega.add(t);
    }

    @Override
    public void alterar(EnderecoEntrega t) {
        for (EnderecoEntrega e : this.enderecoEntrega) {
            if (e.getCidade().equals(t.getCidade())) {
                e.setId(t.getId());
                e.setCep(t.getCep());
                e.setNumero(t.getNumero());
                e.setRua(t.getRua());
                e.setBairro(t.getBairro());
                e.setFormaDeEntrega(t.getFormaDeEntrega());
                e.setFrete(t.getFrete());
                return;
            }
        }
    }

    //TIRAR DUVIDAR COM O PROFESSOR
    @Override
    public EnderecoEntrega recuperar(String id) {
        for (EnderecoEntrega e : this.enderecoEntrega) {
            if (e.getCidade().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(EnderecoEntrega t) {
        this.enderecoEntrega.remove(t);
    }

    @Override
    public List<EnderecoEntrega> recuperarTodos() {
        return this.enderecoEntrega;
    }

}
