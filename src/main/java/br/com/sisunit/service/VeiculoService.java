/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.VeiculoDao;
import br.com.sisunit.entity.Veiculo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class VeiculoService {

    @EJB
    private VeiculoDao dao;

    public Veiculo salvar(Veiculo veiculo) {
        return dao.salvar(veiculo);
    }

    public Veiculo atualizar(Veiculo veiculo) {
        return dao.atualizar(veiculo);
    }

    public Veiculo excluir(Veiculo veiculo) {
        return dao.excluir(veiculo);
    }

    public Veiculo pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<Veiculo> listar() {
        return dao.listar();
    }
}
