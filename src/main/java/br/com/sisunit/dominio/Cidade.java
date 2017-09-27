/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Cidade implements Serializable {

    @Id
    @SequenceGenerator(name = "cidade_generator", sequenceName = "cidade_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cidade_generator")
    private Long id;
    private Long idEstado;
    private Long codigoMunicipio;
    @Column(length = 150)
    private String nome;
    @Column(length = 50)
    private String uf;

    public Cidade() {
    }

    public Cidade(Long idEstado, Long codigoMunicipio, String nome, String uf) {
        this.idEstado = idEstado;
        this.codigoMunicipio = codigoMunicipio;
        this.nome = nome;
        this.uf = uf;
    }

    public Cidade(Long id, Long idEstado, Long codigoMunicipio, String nome, String uf) {
        this.id = id;
        this.idEstado = idEstado;
        this.codigoMunicipio = codigoMunicipio;
        this.nome = nome;
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public Long getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(Long codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf.toUpperCase();
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", idEstado=" + idEstado + ", codigoMunicipio=" + codigoMunicipio + ", nome=" + nome + ", uf=" + uf + '}';
    }

}
