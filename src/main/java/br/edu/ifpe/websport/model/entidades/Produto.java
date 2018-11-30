package br.edu.ifpe.websport.model.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "Produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String nome;
    @Column(length = 20)
    private String marca;
    @OneToMany
    private List <Categoria> categoria;
    @Column(length = 20)
    private String descricao;
    @Column(length = 20)
    private float preco;
    @Column(length = 20)
    private String imagem;
    @OneToMany
    private List <Tamanho> tamanho;
    @Column(length = 20)
    private boolean disponivel;
    @Column(length = 20)
    private boolean promocao;
    @OneToMany
    private List <Fornecedor> fornecedor;

    public Produto() {
    }

    public Produto(int id, String nome, String marca, Categoria categoria, String descricao, float preco, String imagem, Tamanho tamanho, boolean disponivel, boolean promocao, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.categoria = (List<Categoria>) categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.tamanho = (List<Tamanho>) tamanho;
        this.disponivel = disponivel;
        this.promocao = promocao;
        this.fornecedor = (List<Fornecedor>) fornecedor;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<Tamanho> getTamanho() {
        return tamanho;
    }

    public void setTamanho(List<Tamanho> tamanho) {
        this.tamanho = tamanho;
    }

    public List<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }

   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

  
    
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
 
    public void manterProduto() {

    }
}
