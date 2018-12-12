/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD;

import br.edu.ifpe.websport.model.dao.PersistenceDao;
import br.edu.ifpe.websport.entidades.Foto;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author mayco
 */
public class FotoImplBD implements RepositorioGenerico<Foto, Integer>{
    
    
    @Override
    public void inserir(Foto t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Foto t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Foto recuperar(Integer id) {
        try {
            return (Foto) PersistenceDao.getInstance().read("select a from Foto a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Foto t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Foto> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Foto a");
    }
    
}
