
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import negocio.Cliente;
import negocio.Pagamento;
import negocio.Produto;

/**
 *
 * @author paulo
 */
@Entity
public class Compra {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private Date date;
    @Column(length = 20)
    private float total;
    @Column(length = 20)
    private Cliente cliente;
    @Column(length = 20)
    private float frete;
    @Column(length = 20)
    private boolean concluida;
    @Column(length = 20)
    private String observacoes;
    @Column(length = 20)
    private Pagamento tipoDePagamento;
    @Column(length = 20)
    private Produto produto;
    @Column(length = 20)
    private Enum pedidoRealizado;
    @Column(length = 20)
    private Enum pagamentoIdentificado;
    @Column(length = 20)
    private Enum emProcessamento;
    @Column(length = 20)
    private Enum eviado;
    @Column(length = 20)
    private Enum cloncluido;

    Compra() {

    }

    public Compra(int id, Date date, float total, Cliente cliente, float frete, boolean concluida, String observacoes, Pagamento tipoDePagamento, Produto produto, Enum pedidoRealizado, Enum pagamentoIdentificado, Enum emProcessamento, Enum eviado, Enum cloncluido) {
        this.id = id;
        this.date = date;
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
        this.eviado = eviado;
        this.cloncluido = cloncluido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public boolean isConcluida() {
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

    public Enum getEviado() {
        return eviado;
    }

    public void setEviado(Enum eviado) {
        this.eviado = eviado;
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
