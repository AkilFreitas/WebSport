/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

import bancodedados.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Categoria;
import java.util.List;

/**
 *
 * @author mayco
 */
public class CategoriaImplBD implements RepositorioGenerico<Categoria, Integer>{
    
    
    @Override
    public void inserir(Categoria t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Categoria t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Categoria recuperar(Integer id) {
        try {
            return (Categoria) PersistenceDao.getInstance().read("select a from Categoria a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Categoria t) {
        PersistenceDao.getInstance().delete(t);

    }

    @Override
    public List<Categoria> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Categoria a");

    }

    
}
