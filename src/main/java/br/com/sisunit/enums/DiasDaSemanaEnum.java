/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.enums;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
public enum DiasDaSemanaEnum {

    DOMINGO("Domindo"),
    SEGUNDA("Segunda-Feira"), 
    TERCA("Terça-Feira"), 
    QUARTA("Quarta-Feira"), 
    QUINTA("Quinta-Feira"), 
    SEXTA("Sexta-Feira"), 
    SABADO("Sabado");
    
    private String descricao;

    private DiasDaSemanaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

}
