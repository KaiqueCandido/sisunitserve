/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.embeddable.Contato;
import br.com.sisunit.embeddable.DocumentosPessoais;
import br.com.sisunit.enums.SexoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author Kaique Oliveura
 * @email kaiqueoliveira.ci@gmail.com
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @SequenceGenerator(name = "pessoa_generator", sequenceName = "pessoa_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_generator")
    private Long id;
    @Column(length = 150)
    private String nome;
    @Column(length = 150)
    private String sobrenome;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeNascimento;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private SexoEnum sexo;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Conta conta;
    @Embedded
    private DocumentosPessoais documentosPessoais;
    @Embedded
    private Contato contato;
    @Embedded
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, Conta conta, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.conta = conta;
        this.documentosPessoais = documentosPessoais;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Pessoa(Long id, String nome, String sobrenome, Date dataDeNascimento, SexoEnum sexo, Conta conta, DocumentosPessoais documentosPessoais, Contato contato, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.conta = conta;
        this.documentosPessoais = documentosPessoais;
        this.contato = contato;
        this.endereco = endereco;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public DocumentosPessoais getDocumentosPessoais() {
        return documentosPessoais;
    }

    public void setDocumentosPessoais(DocumentosPessoais documentosPessoais) {
        this.documentosPessoais = documentosPessoais;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", dataDeNascimento=" + dataDeNascimento + ", sexo=" + sexo + ", conta=" + conta + ", documentosPessoais=" + documentosPessoais + ", contato=" + contato + ", endereco=" + endereco + '}';
    }

}
