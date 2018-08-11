/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

import bancodedados.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Pagamento;
import java.util.List;

/**
 *
 * @author 20151D12GR0227
 */
public class PagamentoImplBD implements RepositorioGenerico<Pagamento, Integer> {

    @Override
    public void inserir(Pagamento t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Pagamento t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Pagamento recuperar(Integer id) {
        try {
            return (Pagamento) PersistenceDao.getInstance().read("select a from Pagamento a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Pagamento t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Pagamento> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Pagamento a");
    }

}
