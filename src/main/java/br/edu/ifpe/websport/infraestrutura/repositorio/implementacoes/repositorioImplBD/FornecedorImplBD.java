/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.infraestrutura.repositorio.implementacoes.repositorioImplBD;

import br.edu.ifpe.websport.model.dao.PersistenceDao;
import br.edu.ifpe.websport.infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import br.edu.ifpe.websport.model.entidades.Fornecedor;
import java.util.List;

/**
 *
 * @author mayco
 */
public class FornecedorImplBD implements RepositorioGenerico<Fornecedor, Integer> {

    @Override
    public void inserir(Fornecedor t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Fornecedor t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Fornecedor recuperar(Integer id) {
        try {
            return (Fornecedor) PersistenceDao.getInstance().read("select a from Fornecedor a where a.id=" + id).get(0);
        } catch (IndexOutOfBoundsException index) {
            return null;
        }
    }

    @Override
    public void deletar(Fornecedor t) {
        PersistenceDao.getInstance().delete(t);

    }

    @Override
    public List<Fornecedor> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Fornecedor a");
    }

}
