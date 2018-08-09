/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;
import bancodedados.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.EnderecoEntrega;
import java.util.List;

/**
 *
 * @author Neto
 */
public class EnderecoEntregaImplBD implements RepositorioGenerico<EnderecoEntrega, Integer>{
    
    @Override
    public void inserir(EnderecoEntrega t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(EnderecoEntrega t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public EnderecoEntrega recuperar(Integer id) {
        try {
            return (EnderecoEntrega) PersistenceDao.getInstance().read("select a from EnderecoEntrega a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(EnderecoEntrega t) {
        PersistenceDao.getInstance().delete(t);

    }

    @Override
    public List<EnderecoEntrega> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from EnderecoEntrega a");

    }

    
}
