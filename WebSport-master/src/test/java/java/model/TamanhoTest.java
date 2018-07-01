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
public class TamanhoTest {
    
    public TamanhoTest() {
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
     * Test of getId method, of class Tamanho.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Tamanho instance = new Tamanho();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDimensao method, of class Tamanho.
     */
    @Test
    public void testGetDimensao() {
        System.out.println("getDimensao");
        Tamanho instance = new Tamanho();
        String expResult = "";
        String result = instance.getDimensao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Tamanho.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Tamanho instance = new Tamanho();
        String expResult = "";
        String result = instance.getPeso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Tamanho.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Tamanho instance = new Tamanho();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDimensao method, of class Tamanho.
     */
    @Test
    public void testSetDimensao() {
        System.out.println("setDimensao");
        String dimensao = "";
        Tamanho instance = new Tamanho();
        instance.setDimensao(dimensao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class Tamanho.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        String peso = "";
        Tamanho instance = new Tamanho();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
