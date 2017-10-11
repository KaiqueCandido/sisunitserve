/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.CronogramaDao;
import br.com.sisunit.entity.Cronograma;
import br.com.sisunit.service.CronogramaService;
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
@Remote(CronogramaService.class)
public class CronogramaServiceImpl implements CronogramaService {

    @EJB
    private CronogramaDao dao;

    @Override
    public Cronograma salvar(Cronograma cronograma) {
        return dao.salvar(cronograma);
    }

    @Override
    public Cronograma excluir(Cronograma cronograma) {
        return dao.excluir(cronograma);
    }

    @Override
    public Cronograma atualizar(Cronograma cronograma) {
        return dao.atualizar(cronograma);
    }

    @Override
    public Cronograma pesquisarPorId(Object o) {
        return dao.pesquisarPorId(o);
    }

    @Override
    public List<Cronograma> listar() {
        return dao.listar();
    }

}
