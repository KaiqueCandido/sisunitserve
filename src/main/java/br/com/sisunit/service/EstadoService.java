/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisunit.service;

import br.com.sisunit.dao.EstadoDao;
import br.com.sisunit.entity.Estado;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */

@Stateless
public class EstadoService {
    
    @EJB
    private EstadoDao dao;    

    public List<Estado> listar() {
        return dao.listar();
    }

}
