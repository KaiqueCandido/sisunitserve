/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.MotoristaDao;
import br.com.sisunit.entity.Conta;
import br.com.sisunit.entity.Motorista;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class MotoristaService {

    @EJB
    private MotoristaDao dao;

    public Motorista salvar(Motorista motorista) {
        return dao.salvar(motorista);
    }

    public Motorista atualizar(Motorista motorista) {
        return dao.atualizar(motorista);
    }

    public Motorista excluir(Motorista motorista, Conta conta) {
        return dao.excluir(motorista, conta);
    }

    public Motorista pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<Motorista> listar() {
        return dao.listar();
    }
}
