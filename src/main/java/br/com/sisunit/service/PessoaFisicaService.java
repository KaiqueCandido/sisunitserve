/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.dao.PessoaFisicaDao;
import br.com.sisunit.dominio.PessoaFisica;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class PessoaFisicaService {

    @EJB
    private PessoaFisicaDao dao;

    public PessoaFisica salvar(PessoaFisica pessoaFisica) {
        return dao.salvar(pessoaFisica);
    }

    public PessoaFisica atualizar(PessoaFisica pessoaFisica) {
        return dao.atualizar(pessoaFisica);
    }

    public PessoaFisica excluir(PessoaFisica pessoaFisica) {
        return dao.excluir(pessoaFisica);
    }

    public PessoaFisica pesquisarPeloId(Object o) {
        return dao.pesquisarPeloId(o);
    }

    public List<PessoaFisica> listar() {
        return dao.listar();
    }
}
