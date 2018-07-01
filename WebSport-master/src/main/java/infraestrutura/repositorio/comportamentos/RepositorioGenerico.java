/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.comportamentos;

import java.util.List;

//Mostra um parâmetro que será passado a um método.(@param)
/**
 *
 * @author mayco
 * @param <T>
 * @param <G>
 */
public interface RepositorioGenerico<T, G> {

    public void inserir(T t);

    public void alterar(T t);

    public T recuperar(G id);

    public void deletar(T t);

    public List<T> recuperarTodos();
}
