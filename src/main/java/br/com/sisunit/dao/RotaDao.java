/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Rota;
import br.com.sisunit.entity.Rota_;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class RotaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Rota> query;

    public Rota salvar(Rota rota) {
        em.persist(rota);
        return rota;
    }

    public Rota excluir(Rota rota) {
        em.remove(rota);
        return rota;
    }

    public Rota atualizar(Rota rota) {
        em.merge(rota);
        return rota;
    }

    public Rota pesquisarPeloId(Object o) {
        return em.find(Rota.class, o);
    }

    public List<Rota> listar() {
        this.query = em.getCriteriaBuilder().createQuery(Rota.class);
        Root<Rota> r = query.from(Rota.class);
        r.fetch(Rota_.passageiros, JoinType.LEFT);
        r.fetch(Rota_.passageirosConfirmados, JoinType.LEFT);
        r.fetch(Rota_.pontosDeParada, JoinType.LEFT);
        query.select(r).distinct(true);
        List<Rota> resultList = em.createQuery(query).getResultList();
        return resultList;
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Rota.class);
    }

}
