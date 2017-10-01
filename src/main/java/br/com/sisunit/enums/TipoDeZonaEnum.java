/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.enums;

/**
 *
 * @author kaique Oliveira
 * @email kaiqueoliveira@Gmail.com
 */
public enum TipoDeZonaEnum {

    URBANA("Urbana"),
    RURAL("Rural");

    private String descricao;

    private TipoDeZonaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
