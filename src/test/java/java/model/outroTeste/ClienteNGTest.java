/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model.outroTeste;

import java.model.Cliente;
import java.model.Endereco;
import java.model.Usuario;
import static org.testng.Assert.*;

/**
 *
 * @author mayco
 */
public class ClienteNGTest {
    
    public ClienteNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método getId, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetId() {
        System.out.println("getId");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cliente instance = new Cliente();
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getIdade, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getIdade();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setIdade, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 0;
        Cliente instance = new Cliente();
        instance.setIdade(idade);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getRg, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetRg() {
        System.out.println("getRg");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getRg();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setRg, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetRg() {
        System.out.println("setRg");
        int rg = 0;
        Cliente instance = new Cliente();
        instance.setRg(rg);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getCpf, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCpf, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Cliente instance = new Cliente();
        instance.setCpf(cpf);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getTelefone, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTelefone, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Cliente instance = new Cliente();
        instance.setTelefone(telefone);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNome, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetNome() {
        System.out.println("getNome");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNome, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cliente instance = new Cliente();
        instance.setNome(nome);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getEmail, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setEmail, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = new Cliente();
        instance.setEmail(email);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getDataDeNascimento, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetDataDeNascimento() {
        System.out.println("getDataDeNascimento");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDataDeNascimento();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setDataDeNascimento, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetDataDeNascimento() {
        System.out.println("setDataDeNascimento");
        String dataDeNascimento = "";
        Cliente instance = new Cliente();
        instance.setDataDeNascimento(dataDeNascimento);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getSexo, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setSexo, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Cliente instance = new Cliente();
        instance.setSexo(sexo);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getEndereco, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Cliente instance = new Cliente();
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setEndereco, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        Cliente instance = new Cliente();
        instance.setEndereco(endereco);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getLogin, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Cliente instance = new Cliente();
        Usuario expResult = null;
        Usuario result = instance.getLogin();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setLogin, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testSetLogin() {
        System.out.println("setLogin");
        Usuario login = null;
        Cliente instance = new Cliente();
        instance.setLogin(login);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método manterCliente, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testManterCliente() {
        System.out.println("manterCliente");
        Cliente instance = new Cliente();
        instance.manterCliente();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método efetuaLogin, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testEfetuaLogin() {
        System.out.println("efetuaLogin");
        Cliente instance = new Cliente();
        instance.efetuaLogin();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método efetuaCompra, da classe Cliente.
     */
    @org.testng.annotations.Test
    public void testEfetuaCompra() {
        System.out.println("efetuaCompra");
        Cliente instance = new Cliente();
        instance.efetuaCompra();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
