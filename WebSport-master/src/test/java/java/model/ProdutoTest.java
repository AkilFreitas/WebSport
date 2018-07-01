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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getId method, of class Produto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Produto instance = new Produto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Produto instance = new Produto();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Produto.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Produto.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Produto instance = new Produto();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class Produto.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Produto instance = new Produto();
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class Produto.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria categoria = null;
        Produto instance = new Produto();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Produto.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Produto.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Produto instance = new Produto();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class Produto.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class Produto.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        float preco = 0.0F;
        Produto instance = new Produto();
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagem method, of class Produto.
     */
    @Test
    public void testGetImagem() {
        System.out.println("getImagem");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getImagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagem method, of class Produto.
     */
    @Test
    public void testSetImagem() {
        System.out.println("setImagem");
        String imagem = "";
        Produto instance = new Produto();
        instance.setImagem(imagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamanho method, of class Produto.
     */
    @Test
    public void testGetTamanho() {
        System.out.println("getTamanho");
        Produto instance = new Produto();
        Tamanho expResult = null;
        Tamanho result = instance.getTamanho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTamanho method, of class Produto.
     */
    @Test
    public void testSetTamanho() {
        System.out.println("setTamanho");
        Tamanho tamanho = null;
        Produto instance = new Produto();
        instance.setTamanho(tamanho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisponivel method, of class Produto.
     */
    @Test
    public void testGetDisponivel() {
        System.out.println("getDisponivel");
        Produto instance = new Produto();
        Boolean expResult = null;
        Boolean result = instance.getDisponivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponivel method, of class Produto.
     */
    @Test
    public void testSetDisponivel() {
        System.out.println("setDisponivel");
        Boolean disponivel = null;
        Produto instance = new Produto();
        instance.setDisponivel(disponivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPromocao method, of class Produto.
     */
    @Test
    public void testIsPromocao() {
        System.out.println("isPromocao");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.isPromocao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPromocao method, of class Produto.
     */
    @Test
    public void testSetPromocao() {
        System.out.println("setPromocao");
        boolean promocao = false;
        Produto instance = new Produto();
        instance.setPromocao(promocao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFornecedor method, of class Produto.
     */
    @Test
    public void testGetFornecedor() {
        System.out.println("getFornecedor");
        Produto instance = new Produto();
        Fornecedor expResult = null;
        Fornecedor result = instance.getFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFornecedor method, of class Produto.
     */
    @Test
    public void testSetFornecedor() {
        System.out.println("setFornecedor");
        Fornecedor fornecedor = null;
        Produto instance = new Produto();
        instance.setFornecedor(fornecedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manterProduto method, of class Produto.
     */
    @Test
    public void testManterProduto() {
        System.out.println("manterProduto");
        Produto instance = new Produto();
        instance.manterProduto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
