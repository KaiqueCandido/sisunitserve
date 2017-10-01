/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.entity.Conta;
import br.com.sisunit.entity.Passageiro;
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
public class PassageiroDao {
    
    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Passageiro> query;
    
    public Passageiro salvar(Passageiro passageiro) {
        em.persist(passageiro);
        return passageiro;
    }
    
    public Passageiro excluir(Passageiro passageiro, Conta conta) {
        passageiro.getContas().stream().forEach((c) -> {
            if (c.getId().equals(conta.getId())) {
                c.setStatusDoCadastro(StatusDoCadastroEnum.INATIVO);
            }
        });
        return atualizar(passageiro);
    }
    
    public Passageiro atualizar(Passageiro passageiro) {
        return em.merge(passageiro);        
    }
    
    public Passageiro pesquisarPeloId(Object o) {
        return em.find(Passageiro.class, o);
    }
    
    public List<Passageiro> listar() {
        Root<Passageiro> p = query.from(Passageiro.class);
        query.orderBy(em.getCriteriaBuilder().asc(p.get(Pessoa_.nome)));
        return em.createQuery(query).getResultList();
    }
    
    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Passageiro.class);
    }
    
}
