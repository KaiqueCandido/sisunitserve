/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.ContaDao;
import br.com.sisunit.entity.Conta;
import br.com.sisunit.service.ContaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(ContaService.class)
public class ContaServiceImpl implements ContaService {

    @EJB
    private ContaDao dao;

    @Override
    public Conta salvar(Conta conta) {
        return dao.salvar(conta);
    }

    @Override
    public Conta excluir(Conta conta) {
        return dao.excluir(conta);
    }

    @Override
    public Conta atualizar(Conta conta) {
        return dao.atualizar(conta);
    }

    @Override
    public Conta pesquisarPorId(Object o) {
        return dao.pesquisarPorId(o);
    }

    @Override
    public List<Conta> listar() {
        return dao.listar();
    }

}
