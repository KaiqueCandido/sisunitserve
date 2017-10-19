/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.embeddable.Contato;
import br.com.sisunit.embeddable.Contato_;
import br.com.sisunit.embeddable.DocumentosPessoais;
import br.com.sisunit.embeddable.DocumentosPessoais_;
import br.com.sisunit.entity.Conta;
import br.com.sisunit.entity.Conta_;
import br.com.sisunit.entity.Pessoa;
import br.com.sisunit.entity.Pessoa_;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author Kaique Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class ValidatorDao {

    @PersistenceContext
    private EntityManager em;

    private CriteriaQuery<Pessoa> query;

    public boolean validateRg(String value) {
        this.query = em.getCriteriaBuilder().createQuery(Pessoa.class);
        Root<Pessoa> p = query.from(Pessoa.class);
        Join<Pessoa, DocumentosPessoais> documentosPessoais = p.join(Pessoa_.documentosPessoais);
        query.where(em.getCriteriaBuilder().equal(documentosPessoais.get(DocumentosPessoais_.rg), value));
        return em.createQuery(query).getResultList().size() <= 0;
    }

    public boolean validateCpf(String value) {
        this.query = em.getCriteriaBuilder().createQuery(Pessoa.class);
        Root<Pessoa> p = query.from(Pessoa.class);
        Join<Pessoa, DocumentosPessoais> documentosPessoais = p.join(Pessoa_.documentosPessoais);
        query.where(em.getCriteriaBuilder().equal(documentosPessoais.get(DocumentosPessoais_.cpf), value));
        return em.createQuery(query).getResultList().size() <= 0;
    }

    public boolean validateEmail(String value) {
        this.query = em.getCriteriaBuilder().createQuery(Pessoa.class);
        Root<Pessoa> p = query.from(Pessoa.class);
        Join<Pessoa, Contato> contato = p.join(Pessoa_.contato);
        query.where(em.getCriteriaBuilder().equal(contato.get(Contato_.email), value));
        return em.createQuery(query).getResultList().size() <= 0;
    }

    public boolean validateLogin(String value) {
        this.query = em.getCriteriaBuilder().createQuery(Pessoa.class);
        Root<Pessoa> p = query.from(Pessoa.class);
        Join<Pessoa, Conta> conta = p.join(Pessoa_.conta);
        query.where(em.getCriteriaBuilder().equal(conta.get(Conta_.login), value));
        return em.createQuery(query).getResultList().size() <= 0;
    }

}
