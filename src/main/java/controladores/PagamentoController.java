/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.PagamentoImplBD;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.model.Pagamento;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 20151D12GR0227
 */
@ManagedBean
@SessionScoped
public class PagamentoController {
    
    private RepositorioGenerico<Pagamento, Integer> repositorioPagamento = null; 
            
    private Pagamento pagamentoCadastro;
    private Pagamento selectedPagamento;

    Pagamento pagamento = new Pagamento();

    public PagamentoController() {
        this.repositorioPagamento = new PagamentoImplBD();
        this.pagamentoCadastro = new Pagamento();
    }

    public void inserir() {

        this.repositorioPagamento.inserir(this.pagamentoCadastro);
        this.pagamentoCadastro = new Pagamento();

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O pagamento foi cadastrado com sucesso!"));
    }

    public void alterar(Pagamento p) {
        this.repositorioPagamento.alterar(p);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O pagamento foi alterado com sucesso!"));
    }

    public Pagamento recuperarPagamento(int id) {
        return this.repositorioPagamento.recuperar(id);
    }

    public void deletar(Pagamento p) {
        this.repositorioPagamento.deletar(p);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O pagamento foi deletado com sucesso!"));
    }

    public List<Pagamento> recuperarTodosPagamentos() {
        return this.repositorioPagamento.recuperarTodos();
    }
}
