/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.RotaDao;
import br.com.sisunit.entity.Rota;
import br.com.sisunit.service.RotaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(RotaService.class)
public class RotaServiceImpl implements RotaService {

    @EJB
    private RotaDao dao;

    @Override
    public Rota salvar(Rota rota) {
        return dao.salvar(rota);
    }

    @Override
    public Rota atualizar(Rota rota) {
        return dao.atualizar(rota);
    }

    @Override
    public Rota excluir(Rota rota) {
        return dao.excluir(rota);
    }

    @Override
    public Rota pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<Rota> listar() {
        return dao.listar();
    }
}
