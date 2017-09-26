/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.RotaDao;
import br.com.sisunit.dominio.Rota;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class RotaService {

    @EJB
    private RotaDao dao;

    public Rota salvar(Rota rota) {
        return dao.salvar(rota);
    }

    public Rota atualizar(Rota rota) {
        return dao.atualizar(rota);
    }

    public Rota excluir(Rota rota) {
        return dao.excluir(rota);
    }

    public Rota pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<Rota> listar() {
        return dao.listar();
    }
}
