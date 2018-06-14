
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import negocio.Cidade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20151D12GR0464
 */
@Entity
public class EnderecoEntrega {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private int cep;
    @Column(length = 20)
    private int numero;
    @Column(length = 20)
    private String rua;
    @Column(length = 20)
    private String bairro;
    @Column(length = 20)
    Cidade cidade;

    public EnderecoEntrega() {
    }

    public EnderecoEntrega(int id, int cep, int numero, String rua, String bairro, Cidade cidade) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void manterEndereco(){
        
    }

}
