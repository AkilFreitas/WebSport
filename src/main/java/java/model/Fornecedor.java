package java.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fornecedor {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private int cnpj;
    @Column(length = 20)
    private int telefone;
    @Column(length = 20)
    private String nomeFantasia;
    @Column(length = 20)
    private String email;
    

   
    public Fornecedor() {
    }

    public Fornecedor(int id, int cnpj, int telefone, String nomeFantasia, String email) {
        this.id = id;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void manterEndereco() {

    }

}