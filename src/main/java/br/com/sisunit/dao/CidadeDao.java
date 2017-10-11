/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Cidade;
import br.com.sisunit.entity.Cidade_;
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

    public Cidade pesquisarPorCodIbge(Long codibge) {
        CriteriaQuery<Cidade> query = em.getCriteriaBuilder().createQuery(Cidade.class);
        Root<Cidade> c = query.from(Cidade.class);        
        CriteriaBuilder cb = em.getCriteriaBuilder();        
        query.where(cb.equal(c.get(Cidade_.codigoMunicipio), codibge));
        List<Cidade> resultList = em.createQuery(query).getResultList();
        return resultList.get(0);
    }

    public List<Cidade> listar() {
        Root<Cidade> c = query.from(Cidade.class);
        query.orderBy(em.getCriteriaBuilder().asc(c.get(Cidade_.nome)));
        return em.createQuery(query).getResultList();
    }

    public List<Cidade> listarPorEstado(String uf) {
        Root<Cidade> c = query.from(Cidade.class);
        query.where(em.getCriteriaBuilder().equal(c.get(Cidade_.uf), uf));
        query.orderBy(em.getCriteriaBuilder().asc(c.get(Cidade_.nome)));
        query.distinct(true);
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Cidade.class);
    }

}
