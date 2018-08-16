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
@Table(name = "Tamanho")
public class Tamanho implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private String dimensao;
    @Column(length = 20)
    private String peso;

    public Tamanho() {

    }

    public Tamanho(int id, String dimensao, String peso) {
        this.id = id;
        this.dimensao = dimensao;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getDimensao() {
        return dimensao;
    }

    public String getPeso() {
        return peso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
