/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.CidadeDao;
import br.com.sisunit.entity.Cidade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class CidadeService {

    @EJB
    private CidadeDao dao;

    public List<Cidade> listar() {
        return dao.listar();
    }

    public List<Cidade> listarPorEstado(Long idEstado) {
        return dao.listarPorEstado(idEstado);
    }

}
