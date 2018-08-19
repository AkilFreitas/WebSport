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
import infraestrutura.repositorio.implementacoes.RepositorioFornecedor;
import infraestrutura.repositorio.implementacoes.RepositorioPagamento;
import infraestrutura.repositorio.implementacoes.RepositorioProduto;
import infraestrutura.repositorio.implementacoes.RepositorioTamanho;

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
            if (tipoEntidade == FORNECEDOR) {
                return new RepositorioFornecedor();
            }
            if (tipoEntidade == PAGAMENTO) {
                return new RepositorioPagamento();
            }
            if (tipoEntidade == PRODUTO) {
                return new RepositorioProduto();
            }
            if (tipoEntidade == TAMANHO) {
                return new RepositorioTamanho();
            }
        }

        if (tipoPersistencia == BANCODADOS) {
            if (tipoEntidade == CATEGORIA) {
                return null;
            }
            if (tipoEntidade == CLIENTE) {
                return null;
            }
            if (tipoEntidade == COMPRA) {
                return null;
            }
            if (tipoEntidade == ENDERECO) {
                return null;
            }
            if (tipoEntidade == ENDERECOENTREGA) {
                return null;
            }
            if (tipoEntidade == FORNECEDOR) {
                return null;
            }
            if (tipoEntidade == PAGAMENTO) {
                return null;
            }
            if (tipoEntidade == PRODUTO) {
                return null;
            }
            if (tipoEntidade == TAMANHO) {
                return null;
            }
        }

        if (tipoPersistencia == ARQUIVO) {
            if (tipoEntidade == CATEGORIA) {
                return null;
            }
            if (tipoEntidade == CLIENTE) {
                return null;
            }
            if (tipoEntidade == COMPRA) {
                return null;
            }
            if (tipoEntidade == ENDERECO) {
                return null;
            }
            if (tipoEntidade == ENDERECOENTREGA) {
                return null;
            }
            if (tipoEntidade == FORNECEDOR) {
                return null;
            }
            if (tipoEntidade == PAGAMENTO) {
                return null;
            }
            if (tipoEntidade == PRODUTO) {
                return null;
            }
            if (tipoEntidade == TAMANHO) {
                return null;
            }

        }
        return null;

    }
}
