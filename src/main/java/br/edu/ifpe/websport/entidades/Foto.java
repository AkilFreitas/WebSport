/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.entidades;

/**
 *
 * @author mayco
 */
public class Foto {

    private int id;
    private byte[] imagem;
    private int ordem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
    public int getOrdem() {
        return ordem;
    }
 
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    
    
}
