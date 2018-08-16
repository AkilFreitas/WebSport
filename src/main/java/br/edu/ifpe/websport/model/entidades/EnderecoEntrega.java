package br.edu.ifpe.websport.model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A serialização em Java é o processo no qual a instância de um objeto é
 * transformada em uma sequência de bytes e é útil quando precisamos enviar
 * objetos pela rede, salvar no disco, ou comunicar de uma JVM com outra.
 */
/**
 *
 * @author mayco
 */
@Entity
@Table(name = "EnderecoEntrega")
public class EnderecoEntrega implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private int cep;
    @Column(length = 20)
    private String cidade;
    @Column(length = 20)
    private int numero;
    @Column(length = 20)
    private String rua;
    @Column(length = 20)
    private String bairro;
    @Column(length = 20)
    private String formaDeEntrega;
    @Column(length = 20)
    private float frete;

    public EnderecoEntrega() {
    }

    public EnderecoEntrega(int id, int cep, String cidade, int numero, String rua, String bairro, String formaDeEntrega, float frete) {
        this.id = id;
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.formaDeEntrega = formaDeEntrega;
        this.frete = frete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getFormaDeEntrega() {
        return formaDeEntrega;
    }

    public void setFormaDeEntrega(String formaDeEntrega) {
        this.formaDeEntrega = formaDeEntrega;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public void manterEndereco() {

    }

}
