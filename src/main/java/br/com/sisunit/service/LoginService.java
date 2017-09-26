/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.service;

import br.com.sisunit.exeption.LoginException;
import br.com.sisunit.dominio.Pessoa;
import br.com.sisunit.dominio.Pessoa_;
import br.com.sisunit.embeddable.Login_;
import br.com.sisunit.enums.StatusCadastro;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Stateless
public class LoginService {
    
    @PersistenceContext
    private EntityManager em;

    private CriteriaQuery<Pessoa> query;        
    
    public Pessoa logar(String email, String senha) throws LoginException {
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            Root<Pessoa> P = query.from(Pessoa.class);
            Join login = P.join(Pessoa_.login);
            query.where(cb.and(cb.equal(login.get(Login_.email), email),
                    cb.equal(login.get(Login_.senha), senha),
                    cb.equal(P.get(Pessoa_.status), StatusCadastro.ATIVO)));
            Pessoa singleResult = em.createQuery(query).getSingleResult();
            return singleResult == null ? null : singleResult;
        } catch (Exception e) {
            e.printStackTrace();
            throw new LoginException();
        }
    }

//    public Pessoa buscarPessoaPeloLogin(String email, String senha) {
//        HashMap map = new HashMap();
//        map.put("email", email);
//        map.put("senha", senha);
//        Object pessoa = jpaPersistence.buscaObjetoComNamedQuery(Pessoa.BUSCA_PESSOA_PELO_LOGIN, map);
//        if (pessoa != null) {
//            if (pessoa.getClass().equals(Cliente.class)) {
//                return (Cliente) pessoa;
//            } else if (pessoa.getClass().equals(Passageiro.class)) {
//                return (Passageiro) pessoa;
//            } else if (pessoa.getClass().equals(PessoaFisica.class)) {
//                return (Pessoa) pessoa;
//            } else if (pessoa.getClass().equals(PessoaJuridica.class)) {
//                return (PessoaJuridica) pessoa;
//            } else {
//                return (Pessoa) pessoa;
//            }
//        } else {
//            return null;
//        }
//    }
    
    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Pessoa.class);
    }
}
