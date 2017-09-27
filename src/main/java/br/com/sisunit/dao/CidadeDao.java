/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.Cidade;
import br.com.sisunit.dominio.Cidade_;
import br.com.sisunit.dominio.Estado;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class CidadeDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Cidade> query;

    public List<Cidade> listar() {
        return em.createQuery(query).getResultList();
    }

    public List<Cidade> listarPorEstado(Long idEstado) {
        Root<Cidade> p = query.from(Cidade.class);
        query.where(em.getCriteriaBuilder().equal(p.get(Cidade_.idEstado), idEstado));
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Cidade.class);
    }
}
