/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.model.entidades;

import java.util.Date;
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
public class CompraNGTest {
    
    public CompraNGTest() {
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
     * Teste de método getId, da classe Compra.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Compra.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Compra instance = new Compra();
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getData, da classe Compra.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Compra instance = new Compra();
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setData, da classe Compra.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Date data = null;
        Compra instance = new Compra();
        instance.setData(data);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getTotal, da classe Compra.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Compra instance = new Compra();
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(result, expResult, 0.0);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTotal, da classe Compra.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        float total = 0.0F;
        Compra instance = new Compra();
        instance.setTotal(total);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getCliente, da classe Compra.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Compra instance = new Compra();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCliente, da classe Compra.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Compra instance = new Compra();
        instance.setCliente(cliente);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getFrete, da classe Compra.
     */
    @Test
    public void testGetFrete() {
        System.out.println("getFrete");
        Compra instance = new Compra();
        float expResult = 0.0F;
        float result = instance.getFrete();
        assertEquals(result, expResult, 0.0);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setFrete, da classe Compra.
     */
    @Test
    public void testSetFrete() {
        System.out.println("setFrete");
        float frete = 0.0F;
        Compra instance = new Compra();
        instance.setFrete(frete);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método isConcluida, da classe Compra.
     */
    @Test
    public void testIsConcluida() {
        System.out.println("isConcluida");
        Compra instance = new Compra();
        boolean expResult = false;
        boolean result = instance.isConcluida();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setConcluida, da classe Compra.
     */
    @Test
    public void testSetConcluida() {
        System.out.println("setConcluida");
        boolean concluida = false;
        Compra instance = new Compra();
        instance.setConcluida(concluida);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getObservacoes, da classe Compra.
     */
    @Test
    public void testGetObservacoes() {
        System.out.println("getObservacoes");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getObservacoes();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setObservacoes, da classe Compra.
     */
    @Test
    public void testSetObservacoes() {
        System.out.println("setObservacoes");
        String observacoes = "";
        Compra instance = new Compra();
        instance.setObservacoes(observacoes);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getTipoDePagamento, da classe Compra.
     */
    @Test
    public void testGetTipoDePagamento() {
        System.out.println("getTipoDePagamento");
        Compra instance = new Compra();
        Pagamento expResult = null;
        Pagamento result = instance.getTipoDePagamento();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTipoDePagamento, da classe Compra.
     */
    @Test
    public void testSetTipoDePagamento() {
        System.out.println("setTipoDePagamento");
        Pagamento tipoDePagamento = null;
        Compra instance = new Compra();
        instance.setTipoDePagamento(tipoDePagamento);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getProduto, da classe Compra.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        Compra instance = new Compra();
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setProduto, da classe Compra.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        Compra instance = new Compra();
        instance.setProduto(produto);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getStatus, da classe Compra.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Compra instance = new Compra();
        Compra.STATUS expResult = null;
        Compra.STATUS result = instance.getStatus();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setStatus, da classe Compra.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Compra.STATUS status = null;
        Compra instance = new Compra();
        instance.setStatus(status);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método manterCompra, da classe Compra.
     */
    @Test
    public void testManterCompra() {
        System.out.println("manterCompra");
        Compra instance = new Compra();
        instance.manterCompra();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
