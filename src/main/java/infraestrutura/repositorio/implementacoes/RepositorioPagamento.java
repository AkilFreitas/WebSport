/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura.repositorio.implementacoes;

import br.edu.ifpe.websport.model.entidades.Pagamento;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class RepositorioPagamento implements RepositorioGenerico<Pagamento, String>{

    private List<Pagamento> pagamentos = null;

    public RepositorioPagamento() {
        this.pagamentos = new ArrayList<>();
    }
    
    @Override
    public void inserir(Pagamento t) {
        this.pagamentos.add(t);
    }

    @Override
    public void alterar(Pagamento t) {
       for (Pagamento e : this.pagamentos) {
            if (e.getNome().equals(t.getNome())) {
                e.setId(t.getId());
                e.setStatus(t.getStatus());
                e.setDataDePagamento(t.getDataDePagamento());
               
                return;
            }
        }
    }

    @Override
    public Pagamento recuperar(String id) {
       for (Pagamento e : this.pagamentos) {
            if (e.getNome().equals(id)) {
                return e;
            }
        }
        return null;    }

    @Override
    public void deletar(Pagamento t) {
        this.pagamentos.remove(t);
    }

    @Override
    public List<Pagamento> recuperarTodos() {
        return this.pagamentos;
    }
    
}
