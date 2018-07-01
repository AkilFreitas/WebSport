/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import java.util.Date;
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
public class PagamentoTest {
    
    public PagamentoTest() {
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
     * Test of getId method, of class Pagamento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pagamento instance = new Pagamento();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDePagamento method, of class Pagamento.
     */
    @Test
    public void testGetTipoDePagamento() {
        System.out.println("getTipoDePagamento");
        Pagamento instance = new Pagamento();
        Enum expResult = null;
        Enum result = instance.getTipoDePagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDePagamento method, of class Pagamento.
     */
    @Test
    public void testGetDataDePagamento() {
        System.out.println("getDataDePagamento");
        Pagamento instance = new Pagamento();
        Date expResult = null;
        Date result = instance.getDataDePagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Pagamento.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pagamento instance = new Pagamento();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pagamento.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pagamento instance = new Pagamento();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoDePagamento method, of class Pagamento.
     */
    @Test
    public void testSetTipoDePagamento() {
        System.out.println("setTipoDePagamento");
        Enum tipoDePagamento = null;
        Pagamento instance = new Pagamento();
        instance.setTipoDePagamento(tipoDePagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDePagamento method, of class Pagamento.
     */
    @Test
    public void testSetDataDePagamento() {
        System.out.println("setDataDePagamento");
        Date dataDePagamento = null;
        Pagamento instance = new Pagamento();
        instance.setDataDePagamento(dataDePagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Pagamento.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pagamento instance = new Pagamento();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
