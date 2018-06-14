
import com.mysql.fabric.xmlrpc.base.Data;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pagamento{
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private Enum tipoDePagamento;
    @Column(length = 20)
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