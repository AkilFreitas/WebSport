/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model;

import br.edu.ifpe.websport.model.entidades.Categoria;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.fabricaRepositorios.FabricaRepositorios;
import br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD.CategoriaImplBD;
import java.util.List;

/**
 *
 * @author mayco
 */
public class CategoriaModel {
 
    private RepositorioGenerico<Categoria, Integer> repositorioCategoria = null;

    public CategoriaModel() {
        this.repositorioCategoria = new CategoriaImplBD();
    }

    public void inserir(Categoria categoria) throws Exception {

        if (categoria != null) {
            this.repositorioCategoria.inserir(categoria);
        } else {
            throw new Exception("Categoria invalida!!");
        }
    }

    public void alterar(Categoria categoria) throws Exception {

        if (categoria != null) {
            this.repositorioCategoria.alterar(categoria);
        } else {
            throw new Exception("Categoria invalida!!");
        }
    }

    /*
    Conferir com o prof se esse codigo que eu fiz ta certo
    (Pq na minha logica ta certo mas, tá dando erro na outra classe(CategoriaController)
    
    public Categoria recuperarCategoria(int id, Object obj) throws Exception {
        final Categoria other = (Categoria) obj;
        if (id != other.getId()) {
            return this.repositorioCategoria.recuperar(id);
        } else {
            throw new Exception("Falha na recuperação da categoria!!");
        }

    }
     */
    public Categoria recuperarCategoria(int id) {
        return this.repositorioCategoria.recuperar(id);
    }

    public void deletar(Categoria c) throws Exception {
        if (c != null) {
            this.repositorioCategoria.deletar(c);
        } else {
            throw new Exception("Não foi possivel deletar!!");
        }

    }

    public List<Categoria> recuperarTodos() {
        return this.repositorioCategoria.recuperarTodos();
    }

}
