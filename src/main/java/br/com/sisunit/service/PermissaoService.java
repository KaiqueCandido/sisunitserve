/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.PermissaoDao;
import br.com.sisunit.entity.Permissao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class PermissaoService {

    @EJB
    private PermissaoDao dao;

    public Permissao salvar(Permissao permissao) {
        return dao.salvar(permissao);
    }

    public Permissao atualizar(Permissao permissao) {
        return dao.atualizar(permissao);
    }

    public Permissao excluir(Permissao passageiro) {
        return dao.excluir(passageiro);
    }

    public Permissao pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<Permissao> listar() {
        return dao.listar();
    }
}
