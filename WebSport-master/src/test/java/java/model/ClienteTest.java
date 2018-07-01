package java.model;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Daniel Calado <danielcalado159@gmail.com>
 */
public class ClienteTest {
  
    public ClienteTest() {
    }
    Endereco endereco = new Endereco(); //colocar as coisas de end dentro dos ()
    Cliente cliente = new Cliente(); //colocar as coisas de cliente dentro dos ()
    Cliente negCliente = new Cliente();
    Cliente clienteRes = null;
    
  
    @Test
    @Ignore
    public void SalvarClienteNoBanco() {
        negCliente.salvar(cliente);
        clienteRes = negCliente.buscar(cliente.getIdCliente());
        assertEquals("12345678", clienteRes.getCpf());
    }
     
    @Test
    @Ignore
    public void AlterarClienteNoBanco(){
        clienteRes = negCliente.buscar(cliente.getIdCliente());
        clienteRes.setNome("daniel nunes");
        negCliente.editar(clienteRes);
        cliente = negCliente.buscar(clienteRes.getIdCliente());
        assertEquals("daniel nunes", cliente.getNome());
;
    }
         
    @Test
    @Ignore
    public void DeletarClienteNoBanco() {
        System.out.println(cliente.getIdCliente());
        clienteRes = negCliente.buscar(cliente.getIdCliente());
        negCliente.deletar(clienteRes);
        clienteRes = negCliente.buscar(cliente.getIdCliente());
        assertEquals(null, clienteRes);
    }
}