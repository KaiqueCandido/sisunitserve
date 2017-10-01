/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Conta;
import br.com.sisunit.entity.Conta_;
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
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class ContaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Conta> query;

    public Conta salvar(Conta conta) {
        em.persist(conta);
        return conta;
    }

    public Conta excluir(Conta conta) {
        conta.setStatusDoCadastro(StatusDoCadastroEnum.INATIVO);
        return atualizar(conta);
    }

    public Conta atualizar(Conta conta) {
        return em.merge(conta);
    }

    public Conta pesquisarPorId(Object o) {
        return em.find(Conta.class, o);
    }

    public List<Conta> listar() {
        Root<Conta> c = query.from(Conta.class);
        query.orderBy(em.getCriteriaBuilder().asc(c.get(Conta_.login)));
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Conta.class);
    }
}
