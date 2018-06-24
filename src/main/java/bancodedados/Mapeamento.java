/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

/**
 *
 * @author Val
 */
table (name ="Mapeamento") 
public class Mapeamento {
    @id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Integer codigo;
    
    @Column(name = "Messagem", nullable = false, length = 1000)
    private String message;
    
    @OneToOne
    @JoinColumn(name = "id")
    public String getCodigo(){
     return codigo;;
    }
    public void detCodigo(String codigo){
        this.codigo = codigo; 
    }
    
    public String getMessage(){
     return message;;
    }
    public void setMessage(String Message){
        this.message = message; 
    }
}