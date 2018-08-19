/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioProduto implements RepositorioGenerico<Produto, String> {

    private List<Produto> produtos = null;

    public RepositorioProduto() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void inserir(Produto t) {
        this.produtos.add(t);
    }

    @Override
    public void alterar(Produto t) {
        for (Produto e : this.produtos) {
            if (e.getNome().equals(t.getNome())) {
                e.setId(t.getId());
                e.setMarca(t.getMarca());
                e.setCategoria(t.getCategoria());
                e.setDescricao(t.getDescricao());
                e.setPreco(t.getPreco());
                e.setImagem(t.getImagem());
                e.setTamanho(t.getTamanho());
                e.setDisponivel(t.isDisponivel());
                e.setPromocao(t.isPromocao());
                e.setFornecedor(t.getFornecedor());
                  return;
            }
        }
    }

    @Override
    public Produto recuperar(String id) {
        for (Produto e : this.produtos) {
            if (e.getNome().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Produto t) {
        this.produtos.remove(t);
    }

    @Override
    public List<Produto> recuperarTodos() {
        return this.produtos;
    }
}