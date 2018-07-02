/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados.dao;

import java.model.Cliente;
import java.model.Endereco;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author mayco
 */
public class PersistenciaDaoTest {

    @Test
    @Ignore
    public void salvarTest() {
        Cliente cliente = new Cliente();
        cliente.setNome("Paulo");
        cliente.setCpf("5453453");
        cliente.setTelefone("888888888888");
        cliente.setEmail("paulo@gmail.com");
        cliente.setSenha("paulo132323");

        Endereco end = new Endereco();
        end.setBairro("magano");
        end.setCidade("Garanhuns");

        cliente.setEndereco(end);
        PersistenceDao.getInstance().persist(cliente);

        String sql = "SELECT c FROM Cliente c";
        Cliente cli = (Cliente) PersistenceDao.getInstance().read(sql).get(0);
        Assert.assertEquals("Paulo", cli.getNome());
    }

    @Test
    @Ignore
    public void listarTest() {
        String sql = "SELECT a FROM Cliente a", email = "paulo@gmail.com", senha = "Neto12345";
        Cliente cliente = (Cliente) PersistenceDao.getInstance().update(sql, email, senha);
        Assert.assertEquals("Neto", cliente.getNome());
    }

    @Test
    @Ignore
    public void editarTest() {
        String sql = "SELECT c FROM Cliente c";
        Cliente cliente = (Cliente) PersistenceDao.getInstance().read(sql).get(0);

        cliente.setNome("akil");
        cliente.setCpf("2344677777");
        cliente.setTelefone("999999");
        cliente.setEmail("akilfreitas@gmail.com");
        cliente.setSenha("121212");

        Endereco endereco = new Endereco();
        endereco.setBairro("Heliopolis");
        endereco.setCidade("Garanhuns");

        cliente.setEndereco(endereco);
        PersistenceDao.getInstance().update(cliente);

        Cliente cli = (Cliente) PersistenceDao.getInstance().read(sql).get(0);
        Assert.assertEquals("akil", cli.getNome());
    }

    @Test
    @Ignore
    public void deletarTest() {
        String sql = "SELECT c FROM Cliente c";
        Cliente cliente = (Cliente) PersistenceDao.getInstance().read(sql).get(2);
        PersistenceDao.getInstance().delete(cliente);
    }

    @Test
    @Ignore
    public void buscarTest() {
        String sql = "SELECT c FROM Cliente c";
        Cliente cliente = (Cliente) PersistenceDao.getInstance().read(sql).get(0);
        System.out.println(cliente.getNome());

        Assert.assertEquals("akil", cliente.getNome());
    }

    @Test
    @Ignore
    public void autenticarTest() {
        String sql = "SELECT a FROM Cliente a", email = "akilfreitas@gmail.com", senha = "111111";
        Cliente cliente = (Cliente) PersistenceDao.getInstance().update(sql, email, senha);

        System.out.println(cliente.getEmail());

        Assert.assertEquals("akilfreitas@gmail.com", cliente.getEmail());
    }

}
