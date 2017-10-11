/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.embeddable;

import br.com.sisunit.entity.Estado;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Embeddable
public class DocumentosPessoais implements Serializable {

    @Column(length = 15, unique = true)
    private String rg;
    @Column(length = 100)
    private String orgaoEmissaoRg;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Estado estadoDeEmissaoDoRg;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeEmissaoDoRg;
    @Column(length = 20, unique = true)
    private String cpf;

    public DocumentosPessoais() {
    }

    public DocumentosPessoais(String rg, String orgaoEmissaoRg, Estado estadoDeEmissaoDoRg, Date dataDeEmissaoDoRg, String cpf) {
        this.rg = rg;
        this.orgaoEmissaoRg = orgaoEmissaoRg;
        this.estadoDeEmissaoDoRg = estadoDeEmissaoDoRg;
        this.dataDeEmissaoDoRg = dataDeEmissaoDoRg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissaoRg() {
        return orgaoEmissaoRg;
    }

    public void setOrgaoEmissaoRg(String orgaoEmissaoRg) {
        this.orgaoEmissaoRg = orgaoEmissaoRg.toUpperCase();
    }

    public Estado getEstadoDeEmissaoDoRg() {
        return estadoDeEmissaoDoRg;
    }

    public void setEstadoDeEmissaoDoRg(Estado estadoDeEmissaoDoRg) {
        this.estadoDeEmissaoDoRg = estadoDeEmissaoDoRg;
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
        return "DocumentosPessoais{" + "rg=" + rg + ", orgaoEmissaoRg=" + orgaoEmissaoRg + ", estadoDeEmissaoDoRg=" + estadoDeEmissaoDoRg + ", dataDeEmissaoDoRg=" + dataDeEmissaoDoRg + ", cpf=" + cpf + '}';
    }

}
