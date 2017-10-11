/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.MotoristaDao;
import br.com.sisunit.entity.Motorista;
import br.com.sisunit.service.MotoristaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(MotoristaService.class)
public class MotoristaServiceImpl implements MotoristaService {

    @EJB
    private MotoristaDao dao;

    @Override
    public Motorista salvar(Motorista motorista) {
        return dao.salvar(motorista);
    }

    @Override
    public Motorista atualizar(Motorista motorista) {
        return dao.atualizar(motorista);
    }

    @Override
    public Motorista excluir(Motorista motorista) {
        return dao.excluir(motorista);
    }

    @Override
    public Motorista pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<Motorista> listar() {
        return dao.listar();
    }
}
