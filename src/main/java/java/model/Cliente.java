package java.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Cliente extends Usuario implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private int idade;
    @Column(length = 20)
    private int rg;
    @Column(length = 20)
    private int cpf;
    @Column(length = 20)
    private String telefone;
    @Column(length = 20)
    private String nome;
    @Column(length = 20)
    private String email;
    @Column(length = 20)
    private String dataDeNascimento;
    @Column(length = 20)
    private String sexo;
    @Column(length = 20)
    @OneToOne
    Endereco endereco;
    @Column(length = 20)
    @OneToMany
    Usuario login;

    public Cliente() {
    }

    public Cliente(int id, int idade, int rg, int cpf, String telefone, String nome,
            String email, String dataDeNascimento, String sexo, Endereco endereco, Usuario login) {
        this.id = id;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
        this.login = login;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public int getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    public void manterCliente() {

    }

    public void efetuaLogin() {

    }

    public void efetuaCompra() {

    }

}
