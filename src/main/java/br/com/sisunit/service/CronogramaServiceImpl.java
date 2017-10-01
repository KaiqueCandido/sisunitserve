/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.CronogramaDao;
import br.com.sisunit.entity.Cronograma;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class CronogramaServiceImpl {

    @EJB
    private CronogramaDao dao;

    public Cronograma salvar(Cronograma cronograma) {
        return dao.salvar(cronograma);
    }

    public Cronograma excluir(Cronograma cronograma) {
        return dao.excluir(cronograma);
    }

    public Cronograma atualizar(Cronograma cronograma) {
        return dao.atualizar(cronograma);
    }

    public Cronograma pesquisarPorId(Object o) {
        return dao.pesquisarPorId(o);
    }

    public List<Cronograma> listar() {
        return dao.listar();
    }

}
