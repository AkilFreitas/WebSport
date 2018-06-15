package java.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tamanho{
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