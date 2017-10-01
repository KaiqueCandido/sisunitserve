/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Cronograma;
import br.com.sisunit.entity.Cronograma_;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class CronogramaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Cronograma> query;

    public Cronograma salvar(Cronograma cronograma) {
        em.persist(cronograma);
        return cronograma;
    }

    public Cronograma excluir(Cronograma cronograma) {
        em.remove(cronograma);
        return cronograma;
    }

    public Cronograma atualizar(Cronograma cronograma) {
        return em.merge(cronograma);
    }

    public Cronograma pesquisarPorId(Object o) {
        return em.find(Cronograma.class, o);
    }

    public List<Cronograma> listar() {
        Root<Cronograma> c = query.from(Cronograma.class);
        query.orderBy(em.getCriteriaBuilder().asc(c.get(Cronograma_.horarioDeInicio)));
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Cronograma.class);
    }

}
