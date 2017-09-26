/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisunit.dao;

import br.com.sisunit.dominio.Cliente;
import br.com.sisunit.enums.StatusCadastro;
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
public class ClienteDao {
    
    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Cliente> query;
    
    public Cliente salvar(Cliente cliente) {
        em.persist(cliente);
        return cliente;
    }

    public Cliente excluir(Cliente cliente) {
        cliente.setStatus(StatusCadastro.INATIVO);
        return atualizar(cliente);
    }

    public Cliente atualizar(Cliente cliente) {
        em.merge(cliente);
        return cliente;
    }

    public Cliente pesquisarPeloId(Object o) {
        return em.find(Cliente.class, o);
    }

    public List<Cliente> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Cliente.class);
    }

}
