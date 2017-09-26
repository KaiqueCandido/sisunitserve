/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.PessoaJuridicaDao;
import br.com.sisunit.dominio.PessoaJuridica;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class PessoaJuridicaService {

    @EJB
    private PessoaJuridicaDao dao;

    public PessoaJuridica salvar(PessoaJuridica pessoaJuridica) {
        return dao.salvar(pessoaJuridica);
    }

    public PessoaJuridica atualizar(PessoaJuridica pessoaJuridica) {
        return dao.atualizar(pessoaJuridica);
    }

    public PessoaJuridica excluir(PessoaJuridica pessoaJuridica) {
        return dao.excluir(pessoaJuridica);
    }

    public PessoaJuridica pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<PessoaJuridica> listar() {
        return dao.listar();
    }
}
