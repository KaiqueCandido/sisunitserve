/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.PassageiroDao;
import br.com.sisunit.dominio.Passageiro;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class PassageiroService {

    @EJB
    private PassageiroDao dao;

    public Passageiro salvar(Passageiro passageiro) {
        return dao.salvar(passageiro);
    }

    public Passageiro atualizar(Passageiro passageiro) {
        return dao.atualizar(passageiro);
    }

    public Passageiro excluir(Passageiro passageiro) {
        return dao.excluir(passageiro);
    }

    public Passageiro pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<Passageiro> listar() {
        return dao.listar();
    }
}
