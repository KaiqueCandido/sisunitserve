/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.dominio;

import br.com.sisunit.enums.StatusCadastro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Rota implements Serializable {

    @Id
    @SequenceGenerator(name = "rota_generator", sequenceName = "rota_seq", initialValue = 1, allocationSize = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rota_generator")
    private Long id;
    @Column(length = 150)
    private String descricao;
    @Column(length = 15)
    @Enumerated(EnumType.STRING)
    private StatusCadastro status;
    @ManyToOne
    private Motorista motorista;
    @ManyToOne
    private Veiculo veiculo;
    @OneToOne
    private Cronograma cronograma;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Passageiro> passageirosCadastrados;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Passageiro> passageirosConfirmados;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<PontoDeParada> pontosDeParada;

    public Rota() {
        this.passageirosCadastrados = new ArrayList<>();
        this.passageirosConfirmados = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
        this.status = StatusCadastro.ATIVO;
    }

    public Rota(String descricao, Motorista motorista, Veiculo veiculo, Cronograma cronograma) {
        this.descricao = descricao;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.cronograma = cronograma;
        this.passageirosCadastrados = new ArrayList<>();
        this.passageirosConfirmados = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
    }

    public Rota(Long id, String descricao, Motorista motorista, Veiculo veiculo, Cronograma cronograma) {
        this.id = id;
        this.descricao = descricao;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.cronograma = cronograma;
        this.passageirosCadastrados = new ArrayList<>();
        this.passageirosConfirmados = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
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

    public StatusCadastro getStatus() {
        return status;
    }

    public void setStatus(StatusCadastro status) {
        this.status = status;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cronograma getCronograma() {
        return cronograma;
    }

    public void setCronograma(Cronograma cronograma) {
        this.cronograma = cronograma;
    }

    public List<Passageiro> getPassageirosCadastrados() {
        return passageirosCadastrados;
    }

    public void setPassageirosCadastrados(List<Passageiro> passageirosCadastrados) {
        this.passageirosCadastrados = passageirosCadastrados;
    }

    public List<Passageiro> getPassageirosConfirmados() {
        return passageirosConfirmados;
    }

    public void setPassageirosConfirmados(List<Passageiro> passageirosConfirmados) {
        this.passageirosConfirmados = passageirosConfirmados;
    }

    public List<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }

    public void setPontosDeParada(List<PontoDeParada> pontosDeParada) {
        this.pontosDeParada = pontosDeParada;
    }

    public void addPassageiroCadastrado(Passageiro passageiro) {
        this.getPassageirosCadastrados().add(passageiro);
    }

    public void removePassageiroCadastrado(Passageiro passageiro) {
        if (this.getPassageirosCadastrados().contains(passageiro)) {
            this.getPassageirosCadastrados().remove(passageiro);
        }
    }

    public void addPassageiroConfirmados(Passageiro passageiro) {
        this.getPassageirosConfirmados().add(passageiro);
    }

    public void removePassageiroConfirmados(Passageiro passageiro) {
        if (this.getPassageirosConfirmados().contains(passageiro)) {
            this.getPassageirosConfirmados().remove(passageiro);
        }
    }

    public void addPontoDeParada(PontoDeParada pdp) {
        this.getPontosDeParada().add(pdp);
    }

    public void removePontoDeParada(PontoDeParada pdp) {
        if (this.getPontosDeParada().contains(pdp)) {
            this.getPontosDeParada().remove(pdp);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.descricao);
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
        final Rota other = (Rota) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rota{" + "id=" + id + ", descricao=" + descricao + ", status=" + status + ", motorista=" + motorista + ", veiculo=" + veiculo + ", cronograma=" + cronograma + ", passageirosCadastrados=" + passageirosCadastrados + ", passageirosConfirmados=" + passageirosConfirmados + ", pontosDeParada=" + pontosDeParada + '}';
    }

}
