package br.edu.ifpe.websport.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A serialização em Java é o processo no qual a instância de um objeto é
 * transformada em uma sequência de bytes e é útil quando precisamos enviar
 * objetos pela rede, salvar no disco, ou comunicar de uma JVM com outra.
 */
/**
 *
 * @author mayco
 */
@Entity
@Table(name = "Fornecedor")
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private int cnpj;
    @Column(length = 20)
    private String telefone;
    @Column(length = 20)
    private String nomeFantasia;
    @Column(length = 20)
    private String email;

    public Fornecedor() {
    }

    public Fornecedor(int id, int cnpj, String telefone, String nomeFantasia, String email) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
