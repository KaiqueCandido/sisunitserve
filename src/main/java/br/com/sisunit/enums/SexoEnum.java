/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.enums;

/**
 *
 * @author Kaique Olivera
 * @email kaiqueoliveira.ci@gmail.com
 */
public enum SexoEnum {

    MASCULINO("masculino"),
    FEMININO("Feminino"),
    OUTRO("Outro");

    private String descricao;

    private SexoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
