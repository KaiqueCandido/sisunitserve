/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.enums.StatusDoCadastroEnum;
import br.com.sisunit.exeption.PermissaoException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Conta implements Serializable {

    @Id
    @SequenceGenerator(name = "conta_generator", sequenceName = "conta_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conta_generator")
    private Long id;
    @Column(length = 150)
    private String login;
    @Column(length = 150)
    private String senha;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private StatusDoCadastroEnum statusDoCadastro;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Permissao> permissoes;

    public Conta() {
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
        this.permissoes = new ArrayList<>();
    }

    public Conta(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
        this.permissoes = new ArrayList<>();
    }

    public Conta(Long id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
        this.permissoes = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public StatusDoCadastroEnum getStatusDoCadastro() {
        return statusDoCadastro;
    }

    public void setStatusDoCadastro(StatusDoCadastroEnum statusDoCadastro) {
        this.statusDoCadastro = statusDoCadastro;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissao> permissoes) {
        this.permissoes = permissoes;
    }

    public boolean isExistePermissao(Permissao permissao) {
        return getPermissoes().contains(permissao);
    }

    public void adicionarPermissao(Permissao permissao) throws PermissaoException {
        if (!isExistePermissao(permissao)) {
            getPermissoes().add(permissao);
        } else {
            throw new PermissaoException(permissao, "Essa permissão já consta para esta conta");
        }
    }

    public void removerPermissao(Permissao permissao) throws PermissaoException {
        if (isExistePermissao(permissao)) {
            getPermissoes().remove(permissao);
        } else {
            throw new PermissaoException(permissao, "Essa permissão não consta para esta conta");
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", statusDoCadastro=" + statusDoCadastro + ", permissoes=" + permissoes + '}';
    }

}
