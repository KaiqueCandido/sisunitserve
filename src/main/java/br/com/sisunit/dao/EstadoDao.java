/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Estado;
import br.com.sisunit.entity.Estado_;
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
public class EstadoDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Estado> query;

    public List<Estado> listar() {
        Root<Estado> e = query.from(Estado.class);
        query.orderBy(em.getCriteriaBuilder().asc(e.get(Estado_.uf)));
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Estado.class);
    }

}
