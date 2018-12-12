/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.entidades.Pagamento;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.PagamentoImplBD;
import java.util.List;

/**
 *
 * @author neto
 */
public class PagamentoModel {

    private RepositorioGenerico<Pagamento, Integer> repositorioPagamento = null;

    public PagamentoModel() {
        this.repositorioPagamento = new PagamentoImplBD();
    }

    public void inserir(Pagamento pagamento) throws Exception {

        if (pagamento != null) {
            this.repositorioPagamento.inserir(pagamento);
        } else {
            throw new Exception("Pagamento invalido!");
        }
    }

    public void alterar(Pagamento pagamento) throws Exception {

        if (pagamento != null) {
            this.repositorioPagamento.alterar(pagamento);
        } else {
            throw new Exception("Pagamento invalida!!");
        }
    }

    public Pagamento recuperarPagamento(int id) {
        return this.repositorioPagamento.recuperar(id);
    }

    public void deletar(Pagamento p) throws Exception {
        if (p != null) {
            this.repositorioPagamento.deletar(p);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Pagamento> recuperarTodos() {
        return this.repositorioPagamento.recuperarTodos();
    }

}
