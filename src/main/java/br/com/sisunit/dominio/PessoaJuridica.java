/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.embeddable.Endereco;
import br.com.sisunit.embeddable.Login;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Entity
public class PessoaJuridica extends Cliente {

    @Column(length = 50)
    private String cnpj;
    @Column(length = 225)
    private String razaoSocial;
    @Column(length = 225)
    private String RepresentanteLegal;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String razaoSocial, String RepresentanteLegal, String telefone, Login login, Endereco endereco) {
        super(telefone, login, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.RepresentanteLegal = RepresentanteLegal;
    }

    public PessoaJuridica(String cnpj, String razaoSocial, String RepresentanteLegal, Long id, String telefone, Login login, Endereco endereco) {
        super(id, telefone, login, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.RepresentanteLegal = RepresentanteLegal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRepresentanteLegal() {
        return RepresentanteLegal;
    }

    public void setRepresentanteLegal(String RepresentanteLegal) {
        this.RepresentanteLegal = RepresentanteLegal;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", RepresentanteLegal=" + RepresentanteLegal + '}' + super.toString();
    }

}
