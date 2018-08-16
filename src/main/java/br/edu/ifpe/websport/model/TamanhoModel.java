/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Tamanho;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.TamanhoImplBD;
import java.util.List;

/**
 *
 * @author neto
 */
public class TamanhoModel {

    private RepositorioGenerico<Tamanho, Integer> repositorioTamanho = null;

    public TamanhoModel() {
        this.repositorioTamanho = new TamanhoImplBD();
    }

    public void inserir(Tamanho tamanho) throws Exception {

        if (tamanho != null) {
            this.repositorioTamanho.inserir(tamanho);
        } else {
            throw new Exception("Tamanho invalido!");
        }
    }

    public void alterar(Tamanho tamanho) throws Exception {

        if (tamanho != null) {
            this.repositorioTamanho.alterar(tamanho);
        } else {
            throw new Exception("Tamanho invalido!!");
        }
    }

    
    
    
    public Tamanho recuperarTamanho(int id, Object obj) throws Exception {
        final Tamanho other = (Tamanho) obj;
        if (id != other.getId()) {
            return this.repositorioTamanho.recuperar(id);
        } else {
            throw new Exception("Falha na recuperação do tamanho!!");
        }

    }
     
    public Tamanho recuperarTamanho(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deletar(Tamanho c) throws Exception {
        if (c != null) {
            this.repositorioTamanho.inserir(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Tamanho> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
