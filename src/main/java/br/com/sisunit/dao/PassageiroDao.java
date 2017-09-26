/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.Passageiro;
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
public class PassageiroDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Passageiro> query;

    public Passageiro salvar(Passageiro passageiro) {
        em.persist(passageiro);
        return passageiro;
    }

    public Passageiro excluir(Passageiro passageiro) {
        passageiro.setStatus(StatusCadastro.INATIVO);
        return atualizar(passageiro);
    }

    public Passageiro atualizar(Passageiro passageiro) {
        em.merge(passageiro);
        return passageiro;
    }

    public Passageiro pesquisarPeloId(Object o) {
        return em.find(Passageiro.class, o);
    }

    public List<Passageiro> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Passageiro.class);
    }

}
