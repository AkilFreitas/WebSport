/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifpe.websport.model.entidades.Endereco;
import mensagem.Mensagem;

/**
 *
 * @author mayco
 */
public class ValidacaoEndereco {

    private static final String ENDERECO_NULO = "exception.endereco_nulo";
    private static final String ENDERECO_RUA_OBRIGATORIO = "exception.endereco_rua_obrigatorio";
    private static final String ENDERECO_NUMERO_OBRIGATORIO = "exception.endereco_numero_obrigatorio";
    private static final String ENDERECO_CEP_OBRIGATORIO = "exception.endereco_cep_obrigatorio";
    private static final String ENDERECO_CIDADE_OBRIGATORIO = "exception.endereco_cidade_obrigatoria";
    private static final String ENDERECO_ESTADO_OBRIGATORIO = "exception.endereco_estado_obrigatorio";

    public static ResultadoValidacao validarCamposEndereco(Endereco endereco) {
        List<String> msgs = new ArrayList<String>();
        boolean valido = false;

        if (endereco != null) {
            valido = validarRua(endereco, msgs) && validarNumero(endereco, msgs) && validarCEP(endereco, msgs)
                    && validarCidade(endereco, msgs) && validarEstado(endereco, msgs);
        } else {
            msgs.add(Mensagem.getMessageFromBundle(ENDERECO_NULO));
        }

        return new ResultadoValidacao(valido, msgs);
    }

    private static boolean validarRua(Endereco endereco, List<String> msgs) {
        boolean valido = true;
        if (endereco.getRua() == null) {
            valido = false;
            msgs.add(Mensagem.getMessageFromBundle(ENDERECO_RUA_OBRIGATORIO));
        }
        return valido;
    }

    private static boolean validarNumero(Endereco endereco, List<String> msgs) {
        boolean valido = true;
        if (endereco.getNumero() == 0) {
            valido = false;
            msgs.add(Mensagem.getMessageFromBundle(ENDERECO_NUMERO_OBRIGATORIO));
        }
        return valido;
    }

    private static boolean validarCEP(Endereco endereco, List<String> msgs) {
        boolean valido = true;
        if (endereco.getCep() == null) {
            valido = false;
            msgs.add(Mensagem.getMessageFromBundle(ENDERECO_CEP_OBRIGATORIO));
        } else {
        }
        return valido;
    }

    private static boolean validarCidade(Endereco endereco, List<String> msgs) {
        boolean valido = true;
        if (endereco.getCidade() == null) {
            valido = false;
            msgs.add(Mensagem.getMessageFromBundle(ENDERECO_CIDADE_OBRIGATORIO));
        }
        return valido;
    }

    private static boolean validarEstado(Endereco endereco, List<String> msgs) {
        boolean valido = true;
        if (endereco.getEstado() == null) {
            valido = false;
            msgs.add(Mensagem.getMessageFromBundle(ENDERECO_ESTADO_OBRIGATORIO));
        }
        return valido;
    }
}
