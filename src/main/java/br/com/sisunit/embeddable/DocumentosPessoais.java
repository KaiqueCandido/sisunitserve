/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Embeddable
public class DocumentosPessoais implements Serializable {

    @Column(length = 30)
    private String orgaoEmissaoRg;
    @Column(length = 30)
    private String rg;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeEmissaoDoRg;
    @Column(length = 20, unique = true)
    private String cpf;

    public DocumentosPessoais() {
    }

    public DocumentosPessoais(String orgaoEmissaoRg, String rg, Date dataDeEmissaoDoRg, String cpf) {
        this.orgaoEmissaoRg = orgaoEmissaoRg;
        this.rg = rg;
        this.dataDeEmissaoDoRg = dataDeEmissaoDoRg;
        this.cpf = cpf;
    }

    public String getOrgaoEmissaoRg() {
        return orgaoEmissaoRg;
    }

    public void setOrgaoEmissaoRg(String orgaoEmissaoRg) {
        this.orgaoEmissaoRg = orgaoEmissaoRg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataDeEmissaoDoRg() {
        return dataDeEmissaoDoRg;
    }

    public void setDataDeEmissaoDoRg(Date dataDeEmissaoDoRg) {
        this.dataDeEmissaoDoRg = dataDeEmissaoDoRg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "DocumentosPessoais{" + "orgaoEmissaoRg=" + orgaoEmissaoRg + ", rg=" + rg + ", dataDeEmissaoDoRg=" + dataDeEmissaoDoRg + ", cpf=" + cpf + '}';
    }

}
