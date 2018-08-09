/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import Validacao.ValidacaoEndereco;
import org.junit.Assert;
import org.junit.Test;
public class EnderecoTest {
    
    public EnderecoTest() {
    }
    
    @Test
	public void validarCamposEnderecoTestCamposVazios(){
		Endereco endereco = new Endereco();
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	
	@Test
	public void validarCamposEnderecoTestNumeroConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setNumero(10);
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestCepConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setCep("xxxxx-xxx");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestCidadeConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setCidade("Recife");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestEstadoConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setEstado("PE");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestRuaNumeroConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setRua("Rua X");
		endereco.setNumero(10);
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestRuaCepConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setRua("Rua X");
		endereco.setCep("xxxxx-xxx");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestRuaCidadeConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setRua("Rua X");
		endereco.setCidade("Recife");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestRuaEstadoConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setRua("Rua X");
		endereco.setEstado("PE");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestNumeroCepConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setNumero(10);
		endereco.setCep("xxxxx-xxx");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}

	@Test
	public void validarCamposEnderecoTestNumeroCidadeConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setNumero(10);
		endereco.setCidade("Recife");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestNumeroEstadoConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setNumero(10);
		endereco.setEstado("PE");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestCepCidadeConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setCep("xxxxx-xxx");
		endereco.setCidade("Recife");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestCepEstadoConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setCep("xxxxx-xxx");
		endereco.setEstado("PE");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestCidadeEstadoConfigurado(){
		Endereco endereco = new Endereco();
		endereco.setCidade("Recife");
		endereco.setEstado("PE");
		Assert.assertFalse(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
	
	@Test
	public void validarCamposEnderecoTestAceitou(){
		Endereco endereco = new Endereco();
		endereco.setRua("Rua X");
		endereco.setNumero(10);
		endereco.setCep("xxxxx-xxx");
		endereco.setCidade("Recife");
		endereco.setEstado("PE");
		Assert.assertTrue(ValidacaoEndereco.validarCamposEndereco(endereco).isValido());
	}
    
}