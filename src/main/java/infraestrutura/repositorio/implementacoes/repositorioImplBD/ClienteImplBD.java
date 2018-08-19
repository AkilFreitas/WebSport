/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

import br.edu.ifpe.websport.model.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Cliente;
import java.util.List;

/**
 *
 * @author mayco
 */
public class ClienteImplBD implements RepositorioGenerico<Cliente, Integer> {

    @Override
    public void inserir(Cliente t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Cliente t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Cliente recuperar(Integer id) {
        try {
            return (Cliente) PersistenceDao.getInstance().read("select a from Cliente a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Cliente t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Cliente a");
    }

}
