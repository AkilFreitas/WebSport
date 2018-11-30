package br.edu.ifpe.websport.model.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = "Pagamento")
public class Pagamento implements Serializable {

    public static enum STATUS {

        TIPO_DE_PAGAMENTO;

        public static STATUS getStatus(Integer auto) {
            STATUS a = null;

            switch (auto) {
                case 0:
                    a = TIPO_DE_PAGAMENTO;
                    break;
                default:
                    break;
            }

            return a;
        }
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private STATUS status;
    @Column(length = 20)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDePagamento;
    @Column(length = 20)
    private String nome;

    public Pagamento() {

    }

    public Pagamento(int id, STATUS status, Date dataDePagamento, String nome) {
        this.id = id;
        this.status = status;
        this.dataDePagamento = dataDePagamento;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public Date getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(Date dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void gerarBoleto() {
    }

    public void manterTipoDePagamento() {
    }

}
