/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.GestorDao;
import br.com.sisunit.entity.Conta;
import br.com.sisunit.entity.Cronograma;
import br.com.sisunit.entity.Gestor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class GestorServiceImpl {

    @EJB
    private GestorDao dao;

    public Gestor salvar(Gestor gestor) {
        return dao.salvar(gestor);
    }

    public Gestor excluir(Gestor gestor, Conta conta) {
        return dao.excluir(gestor, conta);
    }

    public Gestor atualizar(Gestor gestor) {
        return dao.atualizar(gestor);
    }

    public Gestor pesquisarPorId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<Gestor> listar() {
        return dao.listar();
    }

}
