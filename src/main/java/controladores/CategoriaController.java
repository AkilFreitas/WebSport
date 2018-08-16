/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import br.edu.ifpe.websport.model.CategoriaModel;
import br.edu.ifpe.websport.model.entidades.Categoria;
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
public class CategoriaController {

    CategoriaModel cm = new CategoriaModel();
    private Categoria categoriaCadastro;
    private Categoria selectedCategoria;

    Categoria categoria = new Categoria();

    public CategoriaController() {
        this.categoriaCadastro = new Categoria();
    }

    public void inserirAction() {

        try {
            this.cm.inserir(this.categoriaCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi cadastrada!"));
        }

    }

    public void alterarAction(Categoria c) {
        try {
            this.cm.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi alterado!"));
        }

    }

    public Categoria recuperarCategoria(int id) {
        return this.cm.recuperarCategoria(id);
    }

    public void deletarAction(Categoria c) {
        try {
            this.cm.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi deletado!"));
        }
    }

    public List<Categoria> recuperarTodosCategorias() {
        return this.cm.recuperarTodos();
    }

    public Categoria getCategoriaCadastro() {
        return categoriaCadastro;
    }

    public void setCategoriaCadastro(Categoria categoriaCadastro) {
        this.categoriaCadastro = categoriaCadastro;
    }

    public Categoria getSelectedCategoria() {
        return selectedCategoria;
    }

    public void setSelectedCategoria(Categoria selectedCategoria) {
        this.selectedCategoria = selectedCategoria;
    }

    /*
    TÁ COMENTADO PQ EU(MICHAEL) NÃO SEI SE É NECESSARIO TER GET e SET DO CM
    
    public CategoriaModel getCm() {
        return cm;
    }

    public void setCm(CategoriaModel cm) {
        this.cm = cm;
    }
     */
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
