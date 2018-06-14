
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import negocio.Categoria;
import negocio.Tamanho;
import negocio.Fornecedor;

@Entity
public class Produto {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private String nome;
    @Column(length = 20)
    private String marca;
    @Column(length = 20)
    Categoria categoria;
    @Column(length = 20)
    private String descricao;
    @Column(length = 20)
    private float preco;
    @Column(length = 20)
    private String imagem;
    @Column(length = 20)
    Tamanho tamanho;
    @Column(length = 20)
    private Boolean disponivel;
    @Column(length = 20)
    private boolean promocao;
    @Column(length = 20)
    Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(int id, String nome, String marca, Categoria categoria, String descricao, float preco, String imagem, Tamanho tamanho, Boolean disponivel, boolean promocao, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.tamanho = tamanho;
        this.disponivel = disponivel;
        this.promocao = promocao;
        this.fornecedor = fornecedor;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void manterProduto() {

    }
}
