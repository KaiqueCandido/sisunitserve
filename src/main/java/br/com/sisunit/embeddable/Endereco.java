/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.embeddable;

import br.com.sisunit.entity.Cidade;
import br.com.sisunit.entity.Estado;
import br.com.sisunit.enums.TipoDeZonaEnum;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Embeddable
public class Endereco implements Serializable {

    @Column(length = 100)
    private String logradouro;
    @Column(length = 100)
    private String numero;
    @Column(length = 100)
    private String bairro;
    @Column(length = 100)
    private String complemento;
    @Column(length = 30)
    private String cep;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Estado estado;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Cidade cidade;
    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private TipoDeZonaEnum tipoDeZona;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String bairro, String complemento, String cep, Estado estado, Cidade cidade, TipoDeZonaEnum tipoDeZona) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.tipoDeZona = tipoDeZona;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public TipoDeZonaEnum getTipoDeZona() {
        return tipoDeZona;
    }

    public void setTipoDeZona(TipoDeZonaEnum tipoDeZona) {
        this.tipoDeZona = tipoDeZona;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", cep=" + cep + ", estado=" + estado + ", cidade=" + cidade + ", tipoDeZona=" + tipoDeZona + '}';
    }

}
