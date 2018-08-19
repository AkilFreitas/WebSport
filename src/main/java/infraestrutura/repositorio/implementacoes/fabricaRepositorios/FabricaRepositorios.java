/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.fabricaRepositorios;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.RepositorioCategoria;
import infraestrutura.repositorio.implementacoes.RepositorioCliente;
import infraestrutura.repositorio.implementacoes.RepositorioCompra;
import infraestrutura.repositorio.implementacoes.RepositorioEndereco;
import infraestrutura.repositorio.implementacoes.RepositorioEnderecoEntrega;

/**
 *
 * @author mayco
 */
public class FabricaRepositorios {

    public static final int CATEGORIA = 1;
    public static final int CLIENTE = 2;
    public static final int COMPRA = 3;
    public static final int ENDERECO = 4;
    public static final int ENDERECOENTREGA = 5;
    public static final int FORNECEDOR = 6;
    public static final int PAGAMENTO = 7;
    public static final int PRODUTO = 8;
    public static final int TAMANHO = 9;

    public static final int MEMORIA = 1;
    public static final int BANCODADOS = 2;
    public static final int ARQUIVO = 3;

    /**
     *
     * @param tipoEntidade
     * @param tipoPersistencia
     * @return
     */
    public static RepositorioGenerico manufactor(int tipoEntidade, int tipoPersistencia) {
        if (tipoPersistencia == MEMORIA) {

             if (tipoEntidade == CATEGORIA) {
                return new RepositorioCategoria();
            }
            if (tipoEntidade == CLIENTE) {
                return new RepositorioCliente();
            }
             if (tipoEntidade == COMPRA) {
                return new RepositorioCompra();
            }
              if (tipoEntidade == ENDERECO) {
                return new RepositorioEndereco();
            }
               if (tipoEntidade == ENDERECOENTREGA) {
                return new RepositorioEnderecoEntrega();
            }
                if (tipoEntidade == CLIENTE) {
                return new RepositorioCliente();
            }
                 if (tipoEntidade == CLIENTE) {
                return new RepositorioCliente();
            }
                  if (tipoEntidade == CLIENTE) {
                return new RepositorioCliente();
            }
                  
        }
        if (tipoPersistencia == BANCODADOS) {

            if (tipoEntidade == CLIENTE) {
                return null;
            }
        }

        if (tipoPersistencia == ARQUIVO) {

            if (tipoEntidade == CLIENTE) {
                return null;
            }

        }
        return null;

    }
}
