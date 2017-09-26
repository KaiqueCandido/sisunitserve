/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.enums.StatusVeiculo;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Veiculo implements Serializable {

    @Id
    @SequenceGenerator(name = "veiculo_generator", sequenceName = "veiculo_seq", initialValue = 1, allocationSize = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo_generator")
    private Long id;
    @Column(length = 150)
    private String descricao;
    @Column(length = 25)
    private String placa;
    @Column(length = 125)
    private String cidade;
    @Column(length = 25)
    private String uf;
    private Integer qtdelugares;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private StatusVeiculo statusVeiculo;

    public Veiculo() {
    }

    public Veiculo(String descricao, String placa, String cidade, String uf, Integer qtdelugares) {
        this.descricao = descricao;
        this.placa = placa;
        this.cidade = cidade;
        this.uf = uf;
        this.qtdelugares = qtdelugares;
    }

    public Veiculo(String descricao, Long id, String placa, String cidade, String uf, Integer qtdelugares) {
        this.descricao = descricao;
        this.id = id;
        this.placa = placa;
        this.cidade = cidade;
        this.uf = uf;
        this.qtdelugares = qtdelugares;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getQtdelugares() {
        return qtdelugares;
    }

    public void setQtdelugares(Integer qtdelugares) {
        this.qtdelugares = qtdelugares;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.placa);
        hash = 53 * hash + Objects.hashCode(this.qtdelugares);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.qtdelugares, other.qtdelugares)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", descricao=" + descricao + ", placa=" + placa + ", cidade=" + cidade + ", uf=" + uf + ", qtdelugares=" + qtdelugares + ", statusVeiculo=" + statusVeiculo + '}' + super.toString();
    }

}
