/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.PontoDeParadaDao;
import br.com.sisunit.entity.PontoDeParada;
import br.com.sisunit.service.PontoDeParadaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
@Remote(PontoDeParadaService.class)
public class PontoDeParadaServiceImpl implements PontoDeParadaService {

    @EJB
    private PontoDeParadaDao dao;

    @Override
    public PontoDeParada salvar(PontoDeParada pontoDeParada) {
        return dao.salvar(pontoDeParada);
    }

    @Override
    public PontoDeParada atualizar(PontoDeParada pontoDeParada) {
        return dao.atualizar(pontoDeParada);
    }

    @Override
    public PontoDeParada excluir(PontoDeParada pontoDeParada) {
        return dao.excluir(pontoDeParada);
    }

    @Override
    public PontoDeParada pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    @Override
    public List<PontoDeParada> listar() {
        return dao.listar();
    }
}
