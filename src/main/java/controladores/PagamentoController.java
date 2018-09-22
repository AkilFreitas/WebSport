/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import br.edu.ifpe.websport.model.PagamentoModel;
import br.edu.ifpe.websport.model.entidades.Pagamento;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Val e Michael
 */
@ManagedBean
@SessionScoped
public class PagamentoController {

    PagamentoModel pgtm = new PagamentoModel();
    private Pagamento pagamentoCadastro;
    private Pagamento selectedPagamento;

    Pagamento pagamento = new Pagamento();

    public PagamentoController() {
        this.pagamentoCadastro = new Pagamento();
    }

    public void inserirAction() {

        try {
            this.pgtm.inserir(this.pagamentoCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O pagamento foi concluido com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O pagamento não foi concluido!"));
        }

    }

    public void alterarAction(Pagamento p) {
        try {
            this.pgtm.alterar(p);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O pagamento foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O pagamento não foi alterado!"));
        }

    }

    public Pagamento recuperarPagamento(int id) {
        return this.pgtm.recuperarPagamento(id);
    }

    public void deletarAction(Pagamento p) {
        try {
            this.pgtm.deletar(p);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O pagamento foi cancelado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falfa!", "O pagamento não foi cancelado!"));
        }
    }

    public List<Pagamento> recuperarTodosPagamentos() {
        return this.pgtm.recuperarTodos();
    }

    public Pagamento getPagamentoCadastro() {
        return pagamentoCadastro;
    }

    public void setPagamentoCadastro(Pagamento pagamentoCadastro) {
        this.pagamentoCadastro = pagamentoCadastro;
    }

    public Pagamento getSelectedPagamento() {
        return selectedPagamento;
    }

    public void setSelectedPagamento(Pagamento selectedPagamento) {
        this.selectedPagamento = selectedPagamento;
    }

    public PagamentoModel getCm() {
        return pgtm;
    }

    public void setCm(PagamentoModel pgtm) {
        this.pgtm = pgtm;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}
