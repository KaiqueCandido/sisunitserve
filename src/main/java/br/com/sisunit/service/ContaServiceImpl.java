/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.ContaDao;
import br.com.sisunit.entity.Conta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class ContaServiceImpl {

    @EJB
    private ContaDao dao;

    public Conta salvar(Conta conta) {
        return dao.salvar(conta);
    }

    public Conta excluir(Conta conta) {
        return dao.excluir(conta);
    }

    public Conta atualizar(Conta conta) {
        return dao.atualizar(conta);
    }

    public Conta pesquisarPorId(Object o) {
        return dao.pesquisarPorId(o);
    }

    public List<Conta> listar() {
        return dao.listar();
    }

}
