/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.GestorDao;
import br.com.sisunit.entity.Gestor;
import br.com.sisunit.service.GestorService;
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
@Remote(GestorService.class)
public class GestorServiceImpl implements GestorService {

    @EJB
    private GestorDao dao;

    @Override
    public Gestor salvar(Gestor gestor) {
        return dao.salvar(gestor);
    }

    @Override
    public Gestor excluir(Gestor gestor) {
        return dao.excluir(gestor);
    }

    @Override
    public Gestor atualizar(Gestor gestor) {
        return dao.atualizar(gestor);
    }

    @Override
    public Gestor pesquisarPorId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<Gestor> listar() {
        return dao.listar();
    }

}
