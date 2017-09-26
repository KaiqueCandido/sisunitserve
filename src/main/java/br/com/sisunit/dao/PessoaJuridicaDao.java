/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.PessoaJuridica;
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
public class PessoaJuridicaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<PessoaJuridica> query;

    public PessoaJuridica salvar(PessoaJuridica pessoaJuridica) {
        em.persist(pessoaJuridica);
        return pessoaJuridica;
    }

    public PessoaJuridica excluir(PessoaJuridica pessoaJuridica) {
        pessoaJuridica.setStatus(StatusCadastro.INATIVO);
        return atualizar(pessoaJuridica);
    }

    public PessoaJuridica atualizar(PessoaJuridica pessoaJuridica) {
        em.merge(pessoaJuridica);
        return pessoaJuridica;
    }

    public PessoaJuridica pesquisarPeloId(Object o) {
        return em.find(PessoaJuridica.class, o);
    }

    public List<PessoaJuridica> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(PessoaJuridica.class);
    }

}
