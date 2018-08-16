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
public class PagamentoNGTest {
    
    public PagamentoNGTest() {
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
     * Teste de método getId, da classe Pagamento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pagamento instance = new Pagamento();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Pagamento.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pagamento instance = new Pagamento();
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getStatus, da classe Pagamento.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Pagamento instance = new Pagamento();
        Pagamento.STATUS expResult = null;
        Pagamento.STATUS result = instance.getStatus();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setStatus, da classe Pagamento.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Pagamento.STATUS status = null;
        Pagamento instance = new Pagamento();
        instance.setStatus(status);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getDataDePagamento, da classe Pagamento.
     */
    @Test
    public void testGetDataDePagamento() {
        System.out.println("getDataDePagamento");
        Pagamento instance = new Pagamento();
        Date expResult = null;
        Date result = instance.getDataDePagamento();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setDataDePagamento, da classe Pagamento.
     */
    @Test
    public void testSetDataDePagamento() {
        System.out.println("setDataDePagamento");
        Date dataDePagamento = null;
        Pagamento instance = new Pagamento();
        instance.setDataDePagamento(dataDePagamento);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNome, da classe Pagamento.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pagamento instance = new Pagamento();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNome, da classe Pagamento.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pagamento instance = new Pagamento();
        instance.setNome(nome);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método gerarBoleto, da classe Pagamento.
     */
    @Test
    public void testGerarBoleto() {
        System.out.println("gerarBoleto");
        Pagamento instance = new Pagamento();
        instance.gerarBoleto();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método manterTipoDePagamento, da classe Pagamento.
     */
    @Test
    public void testManterTipoDePagamento() {
        System.out.println("manterTipoDePagamento");
        Pagamento instance = new Pagamento();
        instance.manterTipoDePagamento();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
