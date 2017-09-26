/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.embeddable.Login;
import br.com.sisunit.enums.StatusCadastro;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @SequenceGenerator(name = "pessoa_generator", sequenceName = "pessoa_seq", initialValue = 1, allocationSize = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_generator")
    private Long id;
    @Column(length = 25)
    private String telefone;
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private StatusCadastro status;
    @Embedded
    private Login login;
    @Embedded
    private Endereco endereco;

    public Pessoa() {
        this.status = StatusCadastro.ATIVO;
    }

    public Pessoa(String telefone, Login login, Endereco endereco) {
        this.telefone = telefone;
        this.login = login;
        this.endereco = endereco;
        this.status = StatusCadastro.ATIVO;
    }

    public Pessoa(Long id, String telefone, Login login, Endereco endereco) {
        this.id = id;
        this.telefone = telefone;
        this.login = login;
        this.endereco = endereco;
        this.status = StatusCadastro.ATIVO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public StatusCadastro getStatus() {
        return status;
    }

    public void setStatus(StatusCadastro status) {
        this.status = status;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", telefone=" + telefone + ", status=" + status + ", login=" + login + ", endereco=" + endereco + '}';
    }

}
