/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes.fabricaRepositorios;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.RepositorioCliente;

/**
 *
 * @author mayco
 */
public class FabricaRepositorios {

    //Vai ficar com 1, mas é por enquanto. Quando começar a colocar as outras classes ai ajeita a ordem, no caso CLIENTE, seria o 3, pra ficar na ordem que ta lá no pacote MODEL 
    public static final int CLIENTE = 1;

    public static final int MEMORIA = 1;
    public static final int BANCODADOS = 2;
    public static final int ARQUIVO = 3;

}
