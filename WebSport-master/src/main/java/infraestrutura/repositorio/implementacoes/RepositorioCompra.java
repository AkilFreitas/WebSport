/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Compra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioCompra implements RepositorioGenerico<Compra, String>{
     private List<Compra> compras = null;

    public RepositorioCompra() {
        this.compras = new ArrayList<>();
    }

    @Override
    public void inserir(Compra t) {
        this.compras.add(t);
    }

    @Override
    public void alterar(Compra t) {
        for (Compra e : this.compras) {
            if (e.getProduto().equals(t.getProduto())) {
                e.setId(t.getId());
                e.setData(t.getData());
                e.setTotal(t.getTotal());
                e.setCliente(t.getCliente());
                e.setFrete(t.getFrete());
                e.setConcluida(t.getConcluida());
                e.setObservacoes(t.getObservacoes());
                e.setTipoDePagamento(t.getTipoDePagamento());
                e.setProduto(t.getProduto());
                e.setPedidoRealizado(t.getPedidoRealizado());
                e.setPagamentoIdentificado(t.getPagamentoIdentificado());
                e.setEmProcessamento(t.getEmProcessamento());
                e.setEnviado(t.getEnviado());
                e.setCloncluido(t.getCloncluido());

                return;
            }
        }
    }

    @Override
    public Compra recuperar(String id) {
        for (Compra e : this.compras) {
            if (e.getProduto().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Compra t) {
        this.compras.remove(t);
    }

    @Override
    public List<Compra> recuperarTodos() {
        return this.compras;
    }
}
