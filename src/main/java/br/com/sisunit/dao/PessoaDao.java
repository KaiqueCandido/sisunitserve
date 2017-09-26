/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.Pessoa;
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
public class PessoaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Pessoa> query;

    public Pessoa salvar(Pessoa pessoa) {
        em.persist(pessoa);
        return pessoa;
    }

    public Pessoa excluir(Pessoa pessoa) {
        pessoa.setStatus(StatusCadastro.INATIVO);
        return atualizar(pessoa);
    }

    public Pessoa atualizar(Pessoa pessoa) {
        em.merge(pessoa);
        return pessoa;
    }

    public Pessoa pesquisarPeloId(Object o) {
        return em.find(Pessoa.class, o);
    }

    public List<Pessoa> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Pessoa.class);
    }

}
