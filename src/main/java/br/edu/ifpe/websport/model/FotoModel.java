/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.entidades.Foto;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.FotoImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class FotoModel {
    
    private RepositorioGenerico<Foto, Integer> repositorioFoto = null;

    public FotoModel() {
        this.repositorioFoto = new FotoImplBD();
    }

    public void inserir(Foto produto) throws Exception {

        if (produto != null) {
            this.repositorioFoto.inserir(produto);
        } else {
            throw new Exception("Foto invalida!!");
        }
    }

    public void alterar(Foto produto) throws Exception {

        if (produto != null) {
            this.repositorioFoto.alterar(produto);
        } else {
            throw new Exception("Foto invalida!!");
        }
    }

    public Foto recuperarFoto(int id) {
        return this.repositorioFoto.recuperar(id);
    }

    public void deletar(Foto p) throws Exception {
        if (p != null) {
            this.repositorioFoto.deletar(p);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Foto> recuperarTodos() {
        return this.repositorioFoto.recuperarTodos();
    }
}
    
