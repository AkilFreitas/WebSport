/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayco
 */
public class EnderecoTest {
    
    public EnderecoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Endereco.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Endereco instance = new Endereco();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Endereco.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Endereco instance = new Endereco();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Endereco.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Endereco instance = new Endereco();
        int expResult = 0;
        int result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Endereco.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        int cep = 0;
        Endereco instance = new Endereco();
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Endereco.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Endereco instance = new Endereco();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Endereco.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Endereco instance = new Endereco();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRua method, of class Endereco.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getRua();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRua method, of class Endereco.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String rua = "";
        Endereco instance = new Endereco();
        instance.setRua(rua);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Endereco.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Endereco.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Endereco instance = new Endereco();
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Endereco.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Endereco instance = new Endereco();
        Cidade expResult = null;
        Cidade result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Endereco.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        Cidade cidade = null;
        Endereco instance = new Endereco();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manterEndereco method, of class Endereco.
     */
    @Test
    public void testManterEndereco() {
        System.out.println("manterEndereco");
        Endereco instance = new Endereco();
        instance.manterEndereco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
