/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.enums.StatusCadastro;
import java.io.Serializable;
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
public class PontoDeParada implements Serializable {

    @Id
    @SequenceGenerator(name = "pontodeparada_generator", sequenceName = "pontodeparada_seq", initialValue = 1, allocationSize = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pontodeparada_generator")
    private Long id;
    @Column(length = 225)
    private String nome;
    @Column(length = 225)
    private String referencia;
    @Column(length = 125)
    private String latitude;
    @Column(length = 125)
    private String longitude;
    private Boolean pontoVisitado;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private StatusCadastro status;

    public PontoDeParada() {
        this.status = StatusCadastro.ATIVO;
    }

    public PontoDeParada(String nome, String referencia, String latitude, String longitude, Boolean pontoVisitado) {
        this.nome = nome;
        this.referencia = referencia;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pontoVisitado = pontoVisitado;
        this.status = StatusCadastro.ATIVO;
    }

    public PontoDeParada(Long id, String nome, String referencia, String latitude, String longitude, Boolean pontoVisitado) {
        this.id = id;
        this.nome = nome;
        this.referencia = referencia;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pontoVisitado = pontoVisitado;
        this.status = StatusCadastro.ATIVO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    public StatusCadastro getStatus() {
        return status;
    }

    public void setStatus(StatusCadastro status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PontoDeParada{" + "id=" + id + ", nome=" + nome + ", referencia=" + referencia + ", latitude=" + latitude + ", longitude=" + longitude + ", status=" + status + '}' + super.toString();
    }

}
