/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.repositorioImplBD;

import bancodedados.dao.PersistenceDao;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.model.Usuario;
import java.util.List;

/**
 *
 * @author 20151D12GR0227
 */
public class UsuarioImplBD implements RepositorioGenerico<Usuario, Integer> {

    @Override
    public void inserir(Usuario t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Usuario t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Usuario recuperar(Integer id) {
        try {
            return (Usuario) PersistenceDao.getInstance().read("select a from Usuario a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Usuario t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Usuario> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Cidade a");
    }
}
