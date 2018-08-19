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

     
    public Tamanho recuperarTamanho(int id) {
        return this.repositorioTamanho.recuperar(id);
    }

    public void deletar(Tamanho c) throws Exception {
        if (c != null) {
            this.repositorioTamanho.deletar(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Tamanho> recuperarTodos() {
        return this.repositorioTamanho.recuperarTodos();
    }
}