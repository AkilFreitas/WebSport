/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

import br.edu.ifpe.websport.model.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Endereco;
import java.util.List;

/**
 *
 * @author mayco
 */
public class EnderecoImplBD implements RepositorioGenerico<Endereco, Integer> {

    @Override
    public void inserir(Endereco t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Endereco t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Endereco recuperar(Integer id) {
        try {
            return (Endereco) PersistenceDao.getInstance().read("select a from Endereco a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Endereco t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Endereco> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Endereco a");
    }

}
