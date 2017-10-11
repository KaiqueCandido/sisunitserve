/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.VeiculoDao;
import br.com.sisunit.entity.Veiculo;
import br.com.sisunit.service.VeiculoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(VeiculoService.class)
public class VeiculoServiceImpl implements VeiculoService {

    @EJB
    private VeiculoDao dao;

    @Override
    public Veiculo salvar(Veiculo veiculo) {
        return dao.salvar(veiculo);
    }

    @Override
    public Veiculo atualizar(Veiculo veiculo) {
        return dao.atualizar(veiculo);
    }

    @Override
    public Veiculo excluir(Veiculo veiculo) {
        return dao.excluir(veiculo);
    }

    @Override
    public Veiculo pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<Veiculo> listar() {
        return dao.listar();
    }
}
