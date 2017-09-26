/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.PontoDeParada;
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
public class PontoDeParadaDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<PontoDeParada> query;

    public PontoDeParada salvar(PontoDeParada pontoDeParada) {
        em.persist(pontoDeParada);
        return pontoDeParada;
    }

    public PontoDeParada excluir(PontoDeParada pontoDeParada) {
        pontoDeParada.setStatus(StatusCadastro.INATIVO);
        return atualizar(pontoDeParada);
    }

    public PontoDeParada atualizar(PontoDeParada pontoDeParada) {
        em.merge(pontoDeParada);
        return pontoDeParada;
    }

    public PontoDeParada pesquisarPeloId(Object o) {
        return em.find(PontoDeParada.class, o);
    }

    public List<PontoDeParada> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(PontoDeParada.class);
    }

}
