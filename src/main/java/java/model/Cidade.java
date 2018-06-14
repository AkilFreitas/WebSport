
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temsdsdfffffdplate file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20151D12GR0464
 */
@Entity
public class Cidade {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private String nome;

    Cidade() {
    }

    public Cidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void manterCidade() {
        
    }
}
