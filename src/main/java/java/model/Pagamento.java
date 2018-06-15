package java.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 * A serialização em Java é o processo no qual a instância de um objeto é
 * transformada em uma sequência de bytes e é útil quando precisamos enviar
 * objetos pela rede, salvar no disco, ou comunicar de uma JVM com outra.
 */
/**
 * Em APIs Java simples, a precisão temporal do tempo não é definida. Ao lidar
 * com dados temporais, você pode querer descrever a precisão esperada no banco
 * de dados. Os dados temporais podem ter precisão de DATE, TIME ou TIMESTAMP
 * (ou seja, a data real, apenas a hora ou ambos). Use a anotação @Temporal para
 * afinar isso.
 */
/**
 *
 * @author mayco
 */
@Entity
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private Enum tipoDePagamento;
    @Column(length = 20)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDePagamento;
    @Column(length = 20)
    private String nome;

    public Pagamento() {

    }

    public Pagamento(int id, Enum tipoDePagamento, Date dataDePagamento, String nome) {
        this.id = id;
        this.tipoDePagamento = tipoDePagamento;
        this.dataDePagamento = dataDePagamento;
        this.nome = nome;

    }

    public int getId() {
        return id;
    }

    public Enum getTipoDePagamento() {
        return tipoDePagamento;
    }

    public Date getDataDePagamento() {
        return dataDePagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoDePagamento(Enum tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public void setDataDePagamento(Date dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
