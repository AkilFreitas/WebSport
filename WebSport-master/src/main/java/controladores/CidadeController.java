/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.CidadeImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Cidade;

/**
 *
 * @author Neto
 */
public class CidadeController {

    private RepositorioGenerico<Cidade, Integer> repositorioCidade = null;
    private Cidade cidadeCadastro;
    private Cidade selectedCidade;

    Cidade cidade = new Cidade();

    public CidadeController() {
        this.repositorioCidade = new CidadeImplBD();
        this.cidadeCadastro = new Cidade();
    }

    public void inserir() {

        this.repositorioCidade.inserir(this.cidadeCadastro);
        this.cidadeCadastro = new Cidade();

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Cidade cadastrada com sucesso!"));
    }

    public void alterar(Cidade c) {
        this.repositorioCidade.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Cidade alterada com sucesso!"));
    }

    public Cidade recuperarCidade(int id) {
        return this.repositorioCidade.recuperar(id);
    }

    public void deletar(Cidade c) {
        this.repositorioCidade.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Cidade deletada com sucesso!"));
    }

    public List<Cidade> recuperarTodasCidade() {
        return this.repositorioCidade.recuperarTodos();
    }

    public Cidade getCidadeCadastro() {
        return cidadeCadastro;
    }

    public void setCidadeCadastro(Cidade cidadeCadastro) {
        this.cidadeCadastro = cidadeCadastro;
    }

    public Cidade getSelectedCidade() {
        return selectedCidade;
    }

    public void setSelectedCidade(Cidade selectedCidade) {
        this.selectedCidade = selectedCidade;
    }

    public RepositorioGenerico<Cidade, Integer> getRepositorioCidade() {
        return repositorioCidade;
    }

    public void setRepositorioCidade(RepositorioGenerico<Cidade, Integer> repositorioCidade) {
        this.repositorioCidade = repositorioCidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
