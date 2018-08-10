/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.UsuarioImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Usuario;

/**
 *
 * @author sucesso
 */
@ManagedBean
@SessionScoped
public class UsuarioController {

    private RepositorioGenerico<Usuario, Integer> repositorioUsuario = null;
    private Usuario usuarioCadastro;
    private Usuario selectedCliente;

    Usuario usuario = new Usuario();

    public UsuarioController() {
        this.repositorioUsuario = new UsuarioImplBD();
        this.usuarioCadastro = new Usuario();
    }

    public void inserir() {

        this.repositorioUsuario.inserir(this.usuarioCadastro);
        this.usuarioCadastro = new Usuario();

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O usuario foi cadastrado com sucesso!"));
    }

    public void alterar(Usuario u) {
        this.repositorioUsuario.alterar(u);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O usuario foi alterado com sucesso!"));
    }

    public Usuario recuperarUsuario(int id) {
        return this.repositorioUsuario.recuperar(id);
    }

    public void deletar(Usuario u) {
        this.repositorioUsuario.deletar(u);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O usuario foi deletado com sucesso!"));
    }

    public List<Usuario> recuperarTodosUsuarios() {
        return this.repositorioUsuario.recuperarTodos();
    }

    public RepositorioGenerico<Usuario, Integer> getRepositorioUsuario() {
        return repositorioUsuario;
    }

    public void setRepositorioUsuario(RepositorioGenerico<Usuario, Integer> repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public Usuario getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Usuario selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
