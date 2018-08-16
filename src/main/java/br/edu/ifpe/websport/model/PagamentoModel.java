/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Pagamento;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.PagamentoImplBD;
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

    
    
    
    public Pagamento recuperarPagamento(int id, Object obj) throws Exception {
        final Pagamento other = (Pagamento) obj;
        if (id != other.getId()) {
            return this.repositorioPagamento.recuperar(id);
        } else {
            throw new Exception("Falha na recuperação do pagamento!!");
        }

    }
     
    public Pagamento recuperarPagamento(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deletar(Pagamento c) throws Exception {
        if (c != null) {
            this.repositorioPagamento.inserir(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Pagamento> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
