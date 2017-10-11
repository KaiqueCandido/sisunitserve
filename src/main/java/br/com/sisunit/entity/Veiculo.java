/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.enums.StatusDoCadastroEnum;
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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Veiculo implements Serializable {

    @Id
    @SequenceGenerator(name = "veiculo_generator", sequenceName = "veiculo_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo_generator")
    private Long id;
    @Column(length = 150)
    private String descricao;
    @Column(length = 25)
    private String placa;
    private Integer qtdeAssentos;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Estado estado;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Cidade cidade;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private StatusDoCadastroEnum statusDoCadastro;

    public Veiculo() {
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
    }

    public Veiculo(String descricao, String placa, Integer qtdeAssentos, Estado estado, Cidade cidade) {
        this.descricao = descricao;
        this.placa = placa;
        this.qtdeAssentos = qtdeAssentos;
        this.estado = estado;
        this.cidade = cidade;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
    }

    public Veiculo(Long id, String descricao, String placa, Integer qtdeAssentos, Estado estado, Cidade cidade) {
        this.id = id;
        this.descricao = descricao;
        this.placa = placa;
        this.qtdeAssentos = qtdeAssentos;
        this.estado = estado;
        this.cidade = cidade;
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
        this.descricao = descricao.toUpperCase();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }

    public Integer getQtdeAssentos() {
        return qtdeAssentos;
    }

    public void setQtdeAssentos(Integer qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
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

    public StatusDoCadastroEnum getStatusDoCadastro() {
        return statusDoCadastro;
    }

    public void setStatusDoCadastro(StatusDoCadastroEnum statusDoCadastro) {
        this.statusDoCadastro = statusDoCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", descricao=" + descricao + ", placa=" + placa + ", qtdeAssentos=" + qtdeAssentos + ", estado=" + estado + ", cidade=" + cidade + ", statusDoCadastro=" + statusDoCadastro + '}';
    }

}
