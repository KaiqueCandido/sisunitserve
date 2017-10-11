/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.CidadeDao;
import br.com.sisunit.entity.Cidade;
import br.com.sisunit.service.CidadeService;
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
@Remote(CidadeService.class)
public class CidadeServiceImpl implements CidadeService {

    @EJB
    private CidadeDao dao;

    @Override
    public Cidade pesquisarPorCodIbge(Long codibge) {
        return dao.pesquisarPorCodIbge(codibge);
    }
    
    @Override
    public List<Cidade> listar() {
        return dao.listar();
    }

    @Override
    public List<Cidade> listarPorEstado(String uf) {
        return dao.listarPorEstado(uf);
    }


}
