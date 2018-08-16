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
public class FornecedorNGTest {
    
    public FornecedorNGTest() {
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
     * Teste de método getId, da classe Fornecedor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Fornecedor instance = new Fornecedor();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Fornecedor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Fornecedor instance = new Fornecedor();
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getCnpj, da classe Fornecedor.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Fornecedor instance = new Fornecedor();
        int expResult = 0;
        int result = instance.getCnpj();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCnpj, da classe Fornecedor.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        int cnpj = 0;
        Fornecedor instance = new Fornecedor();
        instance.setCnpj(cnpj);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getTelefone, da classe Fornecedor.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Fornecedor instance = new Fornecedor();
        int expResult = 0;
        int result = instance.getTelefone();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTelefone, da classe Fornecedor.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        int telefone = 0;
        Fornecedor instance = new Fornecedor();
        instance.setTelefone(telefone);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNomeFantasia, da classe Fornecedor.
     */
    @Test
    public void testGetNomeFantasia() {
        System.out.println("getNomeFantasia");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getNomeFantasia();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNomeFantasia, da classe Fornecedor.
     */
    @Test
    public void testSetNomeFantasia() {
        System.out.println("setNomeFantasia");
        String nomeFantasia = "";
        Fornecedor instance = new Fornecedor();
        instance.setNomeFantasia(nomeFantasia);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getEmail, da classe Fornecedor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setEmail, da classe Fornecedor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Fornecedor instance = new Fornecedor();
        instance.setEmail(email);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método manterEndereco, da classe Fornecedor.
     */
    @Test
    public void testManterEndereco() {
        System.out.println("manterEndereco");
        Fornecedor instance = new Fornecedor();
        instance.manterEndereco();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
