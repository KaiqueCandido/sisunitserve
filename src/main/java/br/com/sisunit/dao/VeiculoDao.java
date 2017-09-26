/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dao;

import br.com.sisunit.dominio.Veiculo;
import br.com.sisunit.enums.StatusVeiculo;
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
public class VeiculoDao {

    @PersistenceContext
    private EntityManager em;
    private CriteriaQuery<Veiculo> query;

    public Veiculo salvar(Veiculo veiculo) {
        em.persist(veiculo);
        return veiculo;
    }

    public Veiculo excluir(Veiculo veiculo) {
        veiculo.setStatusVeiculo(StatusVeiculo.INATIVO);
        return atualizar(veiculo);
    }

    public Veiculo atualizar(Veiculo veiculo) {
        em.merge(veiculo);
        return veiculo;
    }

    public Veiculo pesquisarPeloId(Object o) {
        return em.find(Veiculo.class, o);
    }

    public List<Veiculo> listar() {
        return em.createQuery(query).getResultList();
    }

    @PostConstruct
    public void instanceCriteria() {
        this.query = em.getCriteriaBuilder().createQuery(Veiculo.class);
    }

}
