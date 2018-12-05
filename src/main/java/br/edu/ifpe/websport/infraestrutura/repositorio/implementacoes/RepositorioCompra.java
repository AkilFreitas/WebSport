/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes;

import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Compra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akil e Michael
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
                e.setObservacoes(t.getObservacoes());
                e.setTipoDePagamento(t.getTipoDePagamento());
                
                //Eu(Michael) Ps: Falar com o prof para ver se estar certo
                e.setConcluida(t.isConcluida());
                e.setCancelarCompra(t.isCancelarCompra());
                e.setStatus(Compra.STATUS.ENVIADO);
                e.setStatus(Compra.STATUS.CONCLUIDO);
                e.setStatus(Compra.STATUS.EM_PROCESSAMENTO);
                e.setStatus(Compra.STATUS.PAGAMENTO_IDENTIFICADO);
                e.setStatus(Compra.STATUS.PEDIDO_REALIZADO);
 
                return;
            }
        }
    }

    //TIRAR DUVIDA COM O PROF
    @Override
    public Compra recuperar(String id) {
        for (Compra e : this.compras) {
             if (e.getCliente().equals(id)) {
           // if (e.getProduto().equals(id)) {
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
