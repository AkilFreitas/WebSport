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
public class TamanhoNGTest {
    
    public TamanhoNGTest() {
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
     * Teste de método getId, da classe Tamanho.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Tamanho instance = new Tamanho();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getDimensao, da classe Tamanho.
     */
    @Test
    public void testGetDimensao() {
        System.out.println("getDimensao");
        Tamanho instance = new Tamanho();
        String expResult = "";
        String result = instance.getDimensao();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getPeso, da classe Tamanho.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Tamanho instance = new Tamanho();
        String expResult = "";
        String result = instance.getPeso();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Tamanho.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Tamanho instance = new Tamanho();
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setDimensao, da classe Tamanho.
     */
    @Test
    public void testSetDimensao() {
        System.out.println("setDimensao");
        String dimensao = "";
        Tamanho instance = new Tamanho();
        instance.setDimensao(dimensao);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setPeso, da classe Tamanho.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        String peso = "";
        Tamanho instance = new Tamanho();
        instance.setPeso(peso);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
