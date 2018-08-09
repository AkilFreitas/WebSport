/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import java.util.List;

/**
 *
 * @author mayco
 */
public class ResultadoValidacao {

    private final boolean valido;
    private final List<String> msgs;

    public ResultadoValidacao(boolean valido, List<String> msgs) {
        this.valido = valido;
        this.msgs = msgs;
    }

    public boolean isValido() {
        return valido;
    }

    public List<String> getMsgs() {
        return msgs;
    }

}
