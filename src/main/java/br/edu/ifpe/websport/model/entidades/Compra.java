package br.edu.ifpe.websport.model.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "Compra")
public class Compra implements Serializable {

    public static enum STATUS {

        PEDIDO_REALIZADO,
        PAGAMENTO_IDENTIFICADO,
        EM_PROCESSAMENTO,
        ENVIADO,
        CONCLUIDO;

        public static STATUS getStatus(Integer auto) {
            STATUS a = null;

            switch (auto) {
                case 0:
                    a = PEDIDO_REALIZADO;
                    break;
                case 1:
                    a = PAGAMENTO_IDENTIFICADO;
                    break;
                case 2:
                    a = EM_PROCESSAMENTO;
                    break;
                case 3:
                    a = ENVIADO;
                    break;
                case 4:
                    a = CONCLUIDO;
                    break;
                default:
                    break;
            }

            return a;
        }
    };

    /*
    Seria interessante que o id da compra fosse igual ao id do produto, pq, 
    quando eu comprar um produto seus id's vão ser iguais, e vai ter mais sentido
    na hora de apresentar a compra, pq o id da compra vai bater com o id do produto,
    e não tem sentido o cliente inserir o id da compra!
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(length = 20)
    private float total;
    @OneToMany
    private List<Cliente> cliente;
    @Column(length = 20)
    private float frete;
    @Column(length = 20)
    private boolean concluida;
    @Column(length = 20)
    private boolean cancelarCompra;
    @Column(length = 20)
    private String observacoes;
    @OneToMany
    private List<Pagamento> tipoDePagamento;
    @OneToMany
    private List<Produto> produto;
    @Column(length = 20)
    private STATUS status;

    public Compra() {
    }

    public Compra(int id, Date data, float total, Cliente cliente, float frete, boolean concluida, boolean cancelarCompra, String observacoes, Pagamento tipoDePagamento, Produto produto, STATUS status) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.cliente = (List<Cliente>) cliente;
        this.frete = frete;
        this.concluida = concluida;
        this.cancelarCompra = cancelarCompra;
        this.observacoes = observacoes;
        this.tipoDePagamento = (List<Pagamento>) tipoDePagamento;
        this.produto = (List<Produto>) produto;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Pagamento> getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(List<Pagamento> tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
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

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isCancelarCompra() {
        return cancelarCompra;
    }

    public void setCancelarCompra(boolean cancelarCompra) {
        this.cancelarCompra = cancelarCompra;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void manterCompra() {

    }
}
