/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.PontoDeParadaDao;
import br.com.sisunit.entity.PontoDeParada;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class PontoDeParadaService {

    @EJB
    private PontoDeParadaDao dao;

    public PontoDeParada salvar(PontoDeParada pontoDeParada) {
        return dao.salvar(pontoDeParada);
    }

    public PontoDeParada atualizar(PontoDeParada pontoDeParada) {
        return dao.atualizar(pontoDeParada);
    }

    public PontoDeParada excluir(PontoDeParada pontoDeParada) {
        return dao.excluir(pontoDeParada);
    }

    public PontoDeParada pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<PontoDeParada> listar() {
        return dao.listar();
    }
}
