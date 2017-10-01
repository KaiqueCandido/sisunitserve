/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.enums.StatusDoCadastroEnum;
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
 * @author Kaique oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class PontoDeParada implements Serializable {

    @Id
    @SequenceGenerator(name = "pontodeparada_generator", sequenceName = "pontodeparada_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pontodeparada_generator")
    private Long id;
    @Column(length = 225)
    private String descricao;
    @Column(length = 125)
    private String latitude;
    @Column(length = 125)
    private String longitude;
    private Boolean pontoVisitado;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private StatusDoCadastroEnum statusDoCadastro;

    public PontoDeParada() {
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
    }

    public PontoDeParada(String descricao, String latitude, String longitude, Boolean pontoVisitado) {
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pontoVisitado = pontoVisitado;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
    }

    public PontoDeParada(Long id, String descricao, String latitude, String longitude, Boolean pontoVisitado) {
        this.id = id;
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pontoVisitado = pontoVisitado;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Boolean getPontoVisitado() {
        return pontoVisitado;
    }

    public void setPontoVisitado(Boolean pontoVisitado) {
        this.pontoVisitado = pontoVisitado;
    }

    public StatusDoCadastroEnum getStatusDoCadastro() {
        return statusDoCadastro;
    }

    public void setStatusDoCadastro(StatusDoCadastroEnum statusDoCadastro) {
        this.statusDoCadastro = statusDoCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final PontoDeParada other = (PontoDeParada) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PontoDeParada{" + "id=" + id + ", descricao=" + descricao + ", latitude=" + latitude + ", longitude=" + longitude + ", pontoVisitado=" + pontoVisitado + ", statusDoCadastro=" + statusDoCadastro + '}';
    }

}
