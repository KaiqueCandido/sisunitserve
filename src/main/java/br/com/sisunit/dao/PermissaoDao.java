/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Permissao;
import br.com.sisunit.enums.StatusDoCadastroEnum;
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
public class PermissaoDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Permissao> query;

    public Permissao salvar(Permissao permissao) {
        em.persist(permissao);
        return permissao;
    }

    public Permissao excluir(Permissao permissao) {
        em.remove(permissao);
        return atualizar(permissao);
    }

    public Permissao atualizar(Permissao permissao) {
        return em.merge(permissao);        
    }

    public Permissao pesquisarPeloId(Object o) {
        return em.find(Permissao.class, o);
    }

    public List<Permissao> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Permissao.class);
    }

}
