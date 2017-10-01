/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.enums;

/**
 *
 * @author Kaique Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
public enum TurnoEnum {

    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite");

    private String descricao;

    private TurnoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
