/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model.entidades;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mayco
 */
public class ProdutoNGTest {
    
    public ProdutoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método getId, da classe Produto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Produto instance = new Produto();
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNome, da classe Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNome, da classe Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Produto instance = new Produto();
        instance.setNome(nome);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getMarca, da classe Produto.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setMarca, da classe Produto.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Produto instance = new Produto();
        instance.setMarca(marca);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getCategoria, da classe Produto.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Produto instance = new Produto();
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCategoria, da classe Produto.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria categoria = null;
        Produto instance = new Produto();
        instance.setCategoria(categoria);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getDescricao, da classe Produto.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setDescricao, da classe Produto.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Produto instance = new Produto();
        instance.setDescricao(descricao);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getPreco, da classe Produto.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(result, expResult, 0.0);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setPreco, da classe Produto.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        float preco = 0.0F;
        Produto instance = new Produto();
        instance.setPreco(preco);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getImagem, da classe Produto.
     */
    @Test
    public void testGetImagem() {
        System.out.println("getImagem");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getImagem();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setImagem, da classe Produto.
     */
    @Test
    public void testSetImagem() {
        System.out.println("setImagem");
        String imagem = "";
        Produto instance = new Produto();
        instance.setImagem(imagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getTamanho, da classe Produto.
     */
    @Test
    public void testGetTamanho() {
        System.out.println("getTamanho");
        Produto instance = new Produto();
        Tamanho expResult = null;
        Tamanho result = instance.getTamanho();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTamanho, da classe Produto.
     */
    @Test
    public void testSetTamanho() {
        System.out.println("setTamanho");
        Tamanho tamanho = null;
        Produto instance = new Produto();
        instance.setTamanho(tamanho);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getDisponivel, da classe Produto.
     */
    @Test
    public void testGetDisponivel() {
        System.out.println("getDisponivel");
        Produto instance = new Produto();
        Boolean expResult = null;
        Boolean result = instance.getDisponivel();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setDisponivel, da classe Produto.
     */
    @Test
    public void testSetDisponivel() {
        System.out.println("setDisponivel");
        Boolean disponivel = null;
        Produto instance = new Produto();
        instance.setDisponivel(disponivel);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método isPromocao, da classe Produto.
     */
    @Test
    public void testIsPromocao() {
        System.out.println("isPromocao");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.isPromocao();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setPromocao, da classe Produto.
     */
    @Test
    public void testSetPromocao() {
        System.out.println("setPromocao");
        boolean promocao = false;
        Produto instance = new Produto();
        instance.setPromocao(promocao);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getFornecedor, da classe Produto.
     */
    @Test
    public void testGetFornecedor() {
        System.out.println("getFornecedor");
        Produto instance = new Produto();
        Fornecedor expResult = null;
        Fornecedor result = instance.getFornecedor();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setFornecedor, da classe Produto.
     */
    @Test
    public void testSetFornecedor() {
        System.out.println("setFornecedor");
        Fornecedor fornecedor = null;
        Produto instance = new Produto();
        instance.setFornecedor(fornecedor);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método manterProduto, da classe Produto.
     */
    @Test
    public void testManterProduto() {
        System.out.println("manterProduto");
        Produto instance = new Produto();
        instance.manterProduto();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
