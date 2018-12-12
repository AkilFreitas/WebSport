/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD;

import br.edu.ifpe.websport.model.dao.PersistenceDao;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.entidades.Tamanho;
import java.util.List;

/**
 *
 * @author mayco
 */
public class TamanhoImplBD implements RepositorioGenerico<Tamanho, Integer> {

    @Override
    public void inserir(Tamanho t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Tamanho t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Tamanho recuperar(Integer id) {
        try {
            return (Tamanho) PersistenceDao.getInstance().read("select a from Tamanho a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Tamanho t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Tamanho> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Tamanho a");
    }
}
