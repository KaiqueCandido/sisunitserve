/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Motorista;
import br.com.sisunit.entity.Pessoa_;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class MotoristaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Motorista> query;

    public Motorista salvar(Motorista motorista) {
        em.persist(motorista);
        return motorista;
    }

    public Motorista excluir(Motorista motorista) {
        em.remove(motorista);
        return motorista;
    }

    public Motorista atualizar(Motorista motorista) {
        em.merge(motorista);
        return motorista;
    }

    public Motorista pesquisarPeloId(Object o) {
        return em.find(Motorista.class, o);
    }

    public List<Motorista> listar() {
        Root<Motorista> m = query.from(Motorista.class);
        query.orderBy(em.getCriteriaBuilder().asc(m.get(Pessoa_.nome)));
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Motorista.class);
    }

}
