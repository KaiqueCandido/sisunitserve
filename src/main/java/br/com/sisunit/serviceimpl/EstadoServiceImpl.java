/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisunit.serviceimpl;

import br.com.sisunit.dao.EstadoDao;
import br.com.sisunit.entity.Estado;
import br.com.sisunit.service.EstadoService;
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
@Remote(EstadoService.class)
public class EstadoServiceImpl implements EstadoService{
    
    @EJB
    private EstadoDao dao;    

    @Override
    public List<Estado> listar() {
        return dao.listar();
    }

}
