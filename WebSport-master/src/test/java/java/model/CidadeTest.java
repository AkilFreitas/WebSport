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
public class CidadeTest {
    
    public CidadeTest() {
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
     * Test of getId method, of class Cidade.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cidade instance = new Cidade();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Cidade.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cidade instance = new Cidade();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cidade.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cidade instance = new Cidade();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cidade.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cidade instance = new Cidade();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manterCidade method, of class Cidade.
     */
    @Test
    public void testManterCidade() {
        System.out.println("manterCidade");
        Cidade instance = new Cidade();
        instance.manterCidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
