package br.edu.ifpe.websport.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class EnderecoEntrega extends Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String formaDeEntrega;
    @Column(length = 20)
    private float frete;

    public EnderecoEntrega() {
    }

    public EnderecoEntrega(int id, String formaDeEntrega, float frete) {
        this.id = id;
        this.formaDeEntrega = formaDeEntrega;
        this.frete = frete;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void manterEnderecoEntrega() {

    }

}
