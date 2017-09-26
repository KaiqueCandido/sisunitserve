/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.PessoaFisica;
import br.com.sisunit.enums.StatusCadastro;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class PessoaFisicaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<PessoaFisica> query;

    public PessoaFisica salvar(PessoaFisica pessoaFisica) {
        em.persist(pessoaFisica);
        return pessoaFisica;
    }

    public PessoaFisica excluir(PessoaFisica pessoaFisica) {
        pessoaFisica.setStatus(StatusCadastro.INATIVO);
        return atualizar(pessoaFisica);
    }

    public PessoaFisica atualizar(PessoaFisica pessoaFisica) {
        em.merge(pessoaFisica);
        return pessoaFisica;
    }

    public PessoaFisica pesquisarPeloId(Object o) {
        return em.find(PessoaFisica.class, o);
    }

    public List<PessoaFisica> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(PessoaFisica.class);
    }

}
