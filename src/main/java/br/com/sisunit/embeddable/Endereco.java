/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.embeddable;

import br.com.sisunit.enums.TipoDeZonaEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

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
    private String bairro;
    @Column(length = 100)
    private String complemento;
    @Column(length = 30)
    private String cep;
    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private TipoDeZonaEnum tipoDeZona;

    public Endereco() {
    }

    public Endereco(String logradouro, String bairro, String complemento, String cep, TipoDeZonaEnum tipoDeZona) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.tipoDeZona = tipoDeZona;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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

    public TipoDeZonaEnum getTipoDeZona() {
        return tipoDeZona;
    }

    public void setTipoDeZona(TipoDeZonaEnum tipoDeZona) {
        this.tipoDeZona = tipoDeZona;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", complemento=" + complemento + ", cep=" + cep + ", tipoDeZona=" + tipoDeZona + '}';
    }

}
