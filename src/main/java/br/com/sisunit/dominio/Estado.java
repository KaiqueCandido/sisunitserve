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
public class Estado implements Serializable {

    @Id
    @SequenceGenerator(name = "estado_generator", sequenceName = "estado_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_generator")
    private Long id;
    @Column(length = 100)
    private String nome;
    private Long codigoUf;
    @Column(length = 10)
    private String uf;
    @Column(length = 100)
    private String regiao;

    public Estado() {
    }

    public Estado(String nome, Long codigoUf, String uf, String regiao) {
        this.nome = nome;
        this.codigoUf = codigoUf;
        this.uf = uf;
        this.regiao = regiao;
    }

    public Estado(Long id, String nome, Long codigoUf, String uf, String regiao) {
        this.id = id;
        this.nome = nome;
        this.codigoUf = codigoUf;
        this.uf = uf;
        this.regiao = regiao;
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
        this.nome = nome.toUpperCase();
    }

    public Long getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(Long codigoUf) {
        this.codigoUf = codigoUf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf.toUpperCase();
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao.toUpperCase();
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", nome=" + nome + ", codigoUf=" + codigoUf + ", uf=" + uf + ", regiao=" + regiao + '}';
    }

}
