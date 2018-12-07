/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mayco
 */
@ManagedBean
@SessionScoped
public class Fachada {

    static CategoriaController categoriaController = new CategoriaController();
    static ClienteController clienteController = new ClienteController();
    static CompraController compraController = new CompraController();
    static EnderecoController enderecoController = new EnderecoController();
    static EnderecoEntregaController enderecoEntregaController = new EnderecoEntregaController();
    static FornecedorController fornecedorController = new FornecedorController();
    static LoginController loginController = new LoginController();
    static PagamentoController pagamentoController = new PagamentoController();
    static ProdutoController produtoController = new ProdutoController();
    static TamanhoController tamanhoController = new TamanhoController();

    public CategoriaController getCategoriaController() {
        return categoriaController;
    }

    public ClienteController getClienteController() {
        return clienteController;
    }

    public CompraController getCompraController() {
        return compraController;
    }

    public EnderecoController getEnderecoController() {
        return enderecoController;
    }

    public EnderecoEntregaController getEnderecoEntregaController() {
        return enderecoEntregaController;
    }

    public FornecedorController getFornecedorController() {
        return fornecedorController;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public PagamentoController getPagamentoController() {
        return pagamentoController;
    }

    public ProdutoController getProdutoController() {
        return produtoController;
    }

    public TamanhoController getTamanhoController() {
        return tamanhoController;
    }
}
