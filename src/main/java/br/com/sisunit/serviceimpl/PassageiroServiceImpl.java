/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.PassageiroDao;
import br.com.sisunit.entity.Passageiro;
import br.com.sisunit.service.PassageiroService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(PassageiroService.class)
public class PassageiroServiceImpl implements PassageiroService {

    @EJB
    private PassageiroDao dao;

    @Override
    public Passageiro salvar(Passageiro passageiro) {
        return dao.salvar(passageiro);
    }

    @Override
    public Passageiro atualizar(Passageiro passageiro) {
        return dao.atualizar(passageiro);
    }

    @Override
    public Passageiro excluir(Passageiro passageiro) {
        return dao.excluir(passageiro);
    }

    @Override
    public Passageiro pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<Passageiro> listar() {
        return dao.listar();
    }
}
