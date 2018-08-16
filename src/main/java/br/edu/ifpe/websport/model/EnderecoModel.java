/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Endereco;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.EnderecoImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class EnderecoModel {

    private RepositorioGenerico<Endereco, Integer> repositorioEndereco = null;

    public EnderecoModel() {
        this.repositorioEndereco = new EnderecoImplBD();
    }

    public void inserir(Endereco endereco) throws Exception {

        if (endereco != null) {
            this.repositorioEndereco.inserir(endereco);
        } else {
            throw new Exception("Endereco invalida!!");
        }
    }

    public void alterar(Endereco endereco) throws Exception {

        if (endereco != null) {
            this.repositorioEndereco.alterar(endereco);
        } else {
            throw new Exception("Endereco invalida!!");
        }
    }

    public Endereco recuperarEndereco(int id) {
        return this.repositorioEndereco.recuperar(id);
    }

    public void deletar(Endereco e) throws Exception {
        if (e != null) {
            this.repositorioEndereco.inserir(e);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Endereco> recuperarTodos() {
        return this.repositorioEndereco.recuperarTodos();
    }

}
