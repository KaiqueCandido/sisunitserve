/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Conta;
import br.com.sisunit.entity.Gestor;
import br.com.sisunit.entity.Motorista;
import br.com.sisunit.entity.Pessoa_;
import br.com.sisunit.enums.StatusDoCadastroEnum;
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
public class GestorDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Gestor> query;

    public Gestor salvar(Gestor gestor) {
        em.persist(gestor);
        return gestor;
    }

    public Gestor excluir(Gestor gestor, Conta conta) {
        gestor.getContas().forEach((c) -> {
            if (c.getId().equals(conta.getId())) {
                c.setStatusDoCadastro(StatusDoCadastroEnum.INATIVO);
            }
        });
        return atualizar(gestor);
    }

    public Gestor atualizar(Gestor gestor) {
        em.merge(gestor);
        return gestor;
    }

    public Gestor pesquisarPeloId(Object o) {
        return em.find(Gestor.class, o);
    }

    public List<Gestor> listar() {
        Root<Gestor> m = query.from(Gestor.class);
        query.orderBy(em.getCriteriaBuilder().asc(m.get(Pessoa_.nome)));
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Gestor.class);
    }

}
