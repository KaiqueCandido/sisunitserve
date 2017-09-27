/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.enums.StatusVeiculo;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
    @ManyToOne(cascade = CascadeType.MERGE)
    private Estado estado;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Cidade cidade;
    private Integer qtdelugares;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private StatusVeiculo statusVeiculo;

    public Veiculo() {
        this.statusVeiculo = StatusVeiculo.ATIVO;
    }

    public Veiculo(String descricao, String placa, Estado estado, Cidade cidade, Integer qtdelugares) {
        this.descricao = descricao;
        this.placa = placa;
        this.estado = estado;
        this.cidade = cidade;
        this.qtdelugares = qtdelugares;
        this.statusVeiculo = StatusVeiculo.ATIVO;
    }

    public Veiculo(Long id, String descricao, String placa, Estado estado, Cidade cidade, Integer qtdelugares) {
        this.id = id;
        this.descricao = descricao;
        this.placa = placa;
        this.estado = estado;
        this.cidade = cidade;
        this.qtdelugares = qtdelugares;
        this.statusVeiculo = StatusVeiculo.ATIVO;
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
        this.descricao = descricao.toUpperCase();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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
        return "Veiculo{" + "id=" + id + ", descricao=" + descricao + ", placa=" + placa + ", estado=" + estado + ", cidade=" + cidade + ", qtdelugares=" + qtdelugares + ", statusVeiculo=" + statusVeiculo + '}';
    }

}
