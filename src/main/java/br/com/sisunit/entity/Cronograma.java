/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.enums.DiasDaSemanaEnum;
import br.com.sisunit.enums.TurnoEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique C. Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Cronograma implements Serializable {

    @Id
    @SequenceGenerator(name = "cronograma_generator", sequenceName = "cronograma_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cronograma_generator")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private DiasDaSemanaEnum diaDaSemana;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private TurnoEnum turno;
    @Column(length = 50)
    private String horarioDeInicio;
    @Column(length = 50)
    private String horarioDeTermino;

    public Cronograma() {
    }

    public Cronograma(DiasDaSemanaEnum diaDaSemana, TurnoEnum turno, String horarioDeInicio, String horarioDeTermino) {
        this.diaDaSemana = diaDaSemana;
        this.turno = turno;
        this.horarioDeInicio = horarioDeInicio;
        this.horarioDeTermino = horarioDeTermino;
    }

    public Cronograma(Long id, DiasDaSemanaEnum diaDaSemana, TurnoEnum turno, String horarioDeInicio, String horarioDeTermino) {
        this.id = id;
        this.diaDaSemana = diaDaSemana;
        this.turno = turno;
        this.horarioDeInicio = horarioDeInicio;
        this.horarioDeTermino = horarioDeTermino;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiasDaSemanaEnum getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiasDaSemanaEnum diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public void setTurno(TurnoEnum turno) {
        this.turno = turno;
    }

    public String getHorarioDeInicio() {
        return horarioDeInicio;
    }

    public void setHorarioDeInicio(String horarioDeInicio) {
        this.horarioDeInicio = horarioDeInicio;
    }

    public String getHorarioDeTermino() {
        return horarioDeTermino;
    }

    public void setHorarioDeTermino(String horarioDeTermino) {
        this.horarioDeTermino = horarioDeTermino;
    }

    @Override
    public String toString() {
        return "Cronograma{" + "id=" + id + ", diaDaSemana=" + diaDaSemana + ", turno=" + turno + ", horarioDeInicio=" + horarioDeInicio + ", horarioDeTermino=" + horarioDeTermino + '}';
    }

}
