/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

/**
 *
 * @author Akil
 */
import bancodedados.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Produto;
import java.util.List;

public class ProdutoImplBD implements RepositorioGenerico<Produto, Integer> {

    @Override
    public void inserir(Produto t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Produto t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Produto recuperar(Integer id) {
        try {
            return (Produto) PersistenceDao.getInstance().read("select a from produto a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Produto t) {
        PersistenceDao.getInstance().delete(t);

    }

    @Override
    public List<Produto> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Produto a");

    }

}