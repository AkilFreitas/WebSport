package br.edu.ifpe.websport.model.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
public class Compra implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(length = 20)
    private float total;
    @Column(length = 20)
    @ManyToMany
    private Cliente cliente;
    @Column(length = 20)
    private float frete;
    @Column(length = 20)
    private boolean concluida;
    @Column(length = 20)
    private String observacoes;
    @Column(length = 20)
    @OneToOne
    private Pagamento tipoDePagamento;
    @Column(length = 20)
    @OneToOne
    private Produto produto;
    @Column(length = 20)
    private Enum pedidoRealizado;
    @Column(length = 20)
    private Enum pagamentoIdentificado;
    @Column(length = 20)
    private Enum emProcessamento;
    @Column(length = 20)
    private Enum enviado;
    @Column(length = 20)
    private Enum cloncluido;

    public Compra() {
    }

    public Compra(int id, Date data, float total, Cliente cliente, float frete,
            boolean concluida, String observacoes, Pagamento tipoDePagamento,
            Produto produto, Enum pedidoRealizado, Enum pagamentoIdentificado,
            Enum emProcessamento, Enum enviado, Enum cloncluido) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.cliente = cliente;
        this.frete = frete;
        this.concluida = concluida;
        this.observacoes = observacoes;
        this.tipoDePagamento = tipoDePagamento;
        this.produto = produto;
        this.pedidoRealizado = pedidoRealizado;
        this.pagamentoIdentificado = pagamentoIdentificado;
        this.emProcessamento = emProcessamento;
        this.enviado = enviado;
        this.cloncluido = cloncluido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Pagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(Pagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Enum getPedidoRealizado() {
        return pedidoRealizado;
    }

    public void setPedidoRealizado(Enum pedidoRealizado) {
        this.pedidoRealizado = pedidoRealizado;
    }

    public Enum getPagamentoIdentificado() {
        return pagamentoIdentificado;
    }

    public void setPagamentoIdentificado(Enum pagamentoIdentificado) {
        this.pagamentoIdentificado = pagamentoIdentificado;
    }

    public Enum getEmProcessamento() {
        return emProcessamento;
    }

    public void setEmProcessamento(Enum emProcessamento) {
        this.emProcessamento = emProcessamento;
    }

    public Enum getEnviado() {
        return enviado;
    }

    public void setEnviado(Enum enviado) {
        this.enviado = enviado;
    }

    public Enum getCloncluido() {
        return cloncluido;
    }

    public void setCloncluido(Enum cloncluido) {
        this.cloncluido = cloncluido;
    }

    public void manterCompra() {

    }
}
