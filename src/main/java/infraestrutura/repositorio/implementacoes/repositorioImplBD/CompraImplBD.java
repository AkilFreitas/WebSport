/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

import br.edu.ifpe.websport.model.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Compra;
import java.util.List;

/**
 *
 * @author mayco
 */
public class CompraImplBD implements RepositorioGenerico<Compra, Integer> {

    @Override
    public void inserir(Compra t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Compra t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Compra recuperar(Integer id) {
        try {
            return (Compra) PersistenceDao.getInstance().read("select a from Compra a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Compra t) {
        PersistenceDao.getInstance().delete(t);

    }

    @Override
    public List<Compra> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Compra a");

    }
}
