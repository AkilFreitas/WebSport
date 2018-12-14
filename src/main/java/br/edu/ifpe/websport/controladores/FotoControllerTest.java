/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.FotoImplBD;
import br.edu.ifpe.websport.entidades.Foto;
import br.edu.ifpe.websport.model.FotoModel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author mayco
 */
@ManagedBean
@SessionScoped
public class FotoControllerTest {

    //private FotoImplBD fotoImplBD = new FotoImplBD();
    private Foto foto = new Foto();
    //private StreamedContent imagem = new DefaultStreamedContent();
    //private List<Foto> fotos = new ArrayList<Foto>();  
    
    FotoModel ftm = new FotoModel();
    private Foto fotoCadastro;
    private Foto selectedFoto;

    public FotoControllerTest() {
        this.fotoCadastro = new Foto();
    }

    public FotoModel getFtm() {
        return ftm;
    }

    public void setFtm(FotoModel ftm) {
        this.ftm = ftm;
    }

    public Foto getFotoCadastro() {
        return fotoCadastro;
    }

    public void setFotoCadastro(Foto fotoCadastro) {
        this.fotoCadastro = fotoCadastro;
    }

    public Foto getSelectedFoto() {
        return selectedFoto;
    }

    public void setSelectedFoto(Foto selectedFoto) {
        this.selectedFoto = selectedFoto;
    }
    
    
/*
    public FotoImplBD getFotoImplBD() {
        return fotoImplBD;
    }

    public void setFotoImplBD(FotoImplBD fotoImplBD) {
        this.fotoImplBD = fotoImplBD;
    }
*/
    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
/*
    public StreamedContent getImagem() {
        return imagem;
    }

    public void setImagem(StreamedContent imagem) {
        this.imagem = imagem;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
*/
    
    public void salvaFotos(){
         try {
            this.ftm.inserir(this.fotoCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O foto foi cadastrado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O foto não foi cadastrado!"));
        }
        this.fotoCadastro = new Foto();
    }
    
    public Foto recuperarProduto(int id) {
        return this.ftm.recuperarFoto(id);
    }

    public List<Foto> recuperarTodosProdutos() {
        return this.ftm.recuperarTodos();
    }
   
    /*
    public void enviaImagem(FileUploadEvent event) {
        try {
            imagem = new DefaultStreamedContent(event.getFile().getInputstream());
            foto.setImagem(event.getFile().getContents());
        } catch (IOException ex) {
            Logger.getLogger(FotoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
    public void criaArquivo(byte[] bytes, String arquivo) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(arquivo);
            fos.write(bytes);
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FotoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FotoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
