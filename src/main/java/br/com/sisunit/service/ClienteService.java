/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.ClienteDao;
import br.com.sisunit.dominio.Cliente;
import br.com.sisunit.enums.StatusCadastro;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class ClienteService {

    @EJB
    private ClienteDao dao;

    public Cliente salvar(Cliente cliente) {
        return dao.salvar(cliente);        
    }

    public Cliente atualizar(Cliente cliente) {        
        return dao.atualizar(cliente);
    }

    public Cliente excluir(Cliente cliente) {                
        return dao.excluir(cliente);
    }

    public Cliente pesquisarPeloId(Object o) {        
        return dao.pesquisarPeloId(o);
    }

    public List<Cliente> listar() {
        return dao.listar();
    }
}
