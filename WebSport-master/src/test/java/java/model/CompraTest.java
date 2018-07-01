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
public class CompraTest {
    
    public CompraTest() {
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
     * Test of getId method, of class Compra.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Compra.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Compra instance = new Compra();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Compra.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Compra instance = new Compra();
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Compra.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date data = null;
        Compra instance = new Compra();
        instance.setDate(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Compra.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Compra instance = new Compra();
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Compra.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        float total = 0.0F;
        Compra instance = new Compra();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Compra.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Compra instance = new Compra();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Compra.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Compra instance = new Compra();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrete method, of class Compra.
     */
    @Test
    public void testGetFrete() {
        System.out.println("getFrete");
        Compra instance = new Compra();
        float expResult = 0.0F;
        float result = instance.getFrete();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrete method, of class Compra.
     */
    @Test
    public void testSetFrete() {
        System.out.println("setFrete");
        float frete = 0.0F;
        Compra instance = new Compra();
        instance.setFrete(frete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConcluida method, of class Compra.
     */
    @Test
    public void testIsConcluida() {
        System.out.println("isConcluida");
        Compra instance = new Compra();
        boolean expResult = false;
        boolean result = instance.isConcluida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConcluida method, of class Compra.
     */
    @Test
    public void testSetConcluida() {
        System.out.println("setConcluida");
        boolean concluida = false;
        Compra instance = new Compra();
        instance.setConcluida(concluida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacoes method, of class Compra.
     */
    @Test
    public void testGetObservacoes() {
        System.out.println("getObservacoes");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getObservacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacoes method, of class Compra.
     */
    @Test
    public void testSetObservacoes() {
        System.out.println("setObservacoes");
        String observacoes = "";
        Compra instance = new Compra();
        instance.setObservacoes(observacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDePagamento method, of class Compra.
     */
    @Test
    public void testGetTipoDePagamento() {
        System.out.println("getTipoDePagamento");
        Compra instance = new Compra();
        Pagamento expResult = null;
        Pagamento result = instance.getTipoDePagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoDePagamento method, of class Compra.
     */
    @Test
    public void testSetTipoDePagamento() {
        System.out.println("setTipoDePagamento");
        Pagamento tipoDePagamento = null;
        Compra instance = new Compra();
        instance.setTipoDePagamento(tipoDePagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduto method, of class Compra.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        Compra instance = new Compra();
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduto method, of class Compra.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        Compra instance = new Compra();
        instance.setProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedidoRealizado method, of class Compra.
     */
    @Test
    public void testGetPedidoRealizado() {
        System.out.println("getPedidoRealizado");
        Compra instance = new Compra();
        Enum expResult = null;
        Enum result = instance.getPedidoRealizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedidoRealizado method, of class Compra.
     */
    @Test
    public void testSetPedidoRealizado() {
        System.out.println("setPedidoRealizado");
        Enum pedidoRealizado = null;
        Compra instance = new Compra();
        instance.setPedidoRealizado(pedidoRealizado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagamentoIdentificado method, of class Compra.
     */
    @Test
    public void testGetPagamentoIdentificado() {
        System.out.println("getPagamentoIdentificado");
        Compra instance = new Compra();
        Enum expResult = null;
        Enum result = instance.getPagamentoIdentificado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagamentoIdentificado method, of class Compra.
     */
    @Test
    public void testSetPagamentoIdentificado() {
        System.out.println("setPagamentoIdentificado");
        Enum pagamentoIdentificado = null;
        Compra instance = new Compra();
        instance.setPagamentoIdentificado(pagamentoIdentificado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmProcessamento method, of class Compra.
     */
    @Test
    public void testGetEmProcessamento() {
        System.out.println("getEmProcessamento");
        Compra instance = new Compra();
        Enum expResult = null;
        Enum result = instance.getEmProcessamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmProcessamento method, of class Compra.
     */
    @Test
    public void testSetEmProcessamento() {
        System.out.println("setEmProcessamento");
        Enum emProcessamento = null;
        Compra instance = new Compra();
        instance.setEmProcessamento(emProcessamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEviado method, of class Compra.
     */
    @Test
    public void testGetEviado() {
        System.out.println("getEviado");
        Compra instance = new Compra();
        Enum expResult = null;
        Enum result = instance.getEviado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEviado method, of class Compra.
     */
    @Test
    public void testSetEviado() {
        System.out.println("setEviado");
        Enum eviado = null;
        Compra instance = new Compra();
        instance.setEviado(eviado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCloncluido method, of class Compra.
     */
    @Test
    public void testGetCloncluido() {
        System.out.println("getCloncluido");
        Compra instance = new Compra();
        Enum expResult = null;
        Enum result = instance.getCloncluido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCloncluido method, of class Compra.
     */
    @Test
    public void testSetCloncluido() {
        System.out.println("setCloncluido");
        Enum cloncluido = null;
        Compra instance = new Compra();
        instance.setCloncluido(cloncluido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manterCompra method, of class Compra.
     */
    @Test
    public void testManterCompra() {
        System.out.println("manterCompra");
        Compra instance = new Compra();
        instance.manterCompra();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
