/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.entity;

import br.com.sisunit.enums.StatusDoCadastroEnum;
import br.com.sisunit.exeption.PassageiroException;
import br.com.sisunit.exeption.PontoDeParadaException;
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Entity
public class Rota implements Serializable {

    @Id
    @SequenceGenerator(name = "rota_generator", sequenceName = "rota_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rota_generator")
    private Long id;
    @Column(length = 150)
    private String descricao;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Cronograma cronograma;
    @Column(length = 15)
    @Enumerated(EnumType.STRING)
    private StatusDoCadastroEnum statusDoCadastro;
    @ManyToOne
    private Veiculo veiculo;
    @OneToOne(cascade = CascadeType.MERGE)
    private Motorista motorista;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Passageiro> passageiros;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<PontoDeParada> pontosDeParada;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Passageiro> passageirosConfirmados;

    public Rota() {
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
        this.passageiros = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
        this.passageirosConfirmados = new ArrayList<>();
    }

    public Rota(String descricao, Veiculo veiculo, Motorista motorista, Cronograma cronograma) {
        this.descricao = descricao;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cronograma = cronograma;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
        this.passageiros = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
        this.passageirosConfirmados = new ArrayList<>();
    }

    public Rota(Long id, String descricao, Veiculo veiculo, Motorista motorista, Cronograma cronograma) {
        this.id = id;
        this.descricao = descricao;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cronograma = cronograma;
        this.statusDoCadastro = StatusDoCadastroEnum.ATIVO;
        this.passageiros = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
        this.passageirosConfirmados = new ArrayList<>();
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
        this.descricao = descricao;
    }

    public StatusDoCadastroEnum getStatusDoCadastro() {
        return statusDoCadastro;
    }

    public void setStatusDoCadastro(StatusDoCadastroEnum statusDoCadastro) {
        this.statusDoCadastro = statusDoCadastro;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cronograma getCronograma() {
        return cronograma;
    }

    public void setCronograma(Cronograma cronograma) {
        this.cronograma = cronograma;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }

    public void setPontosDeParada(List<PontoDeParada> pontosDeParada) {
        this.pontosDeParada = pontosDeParada;
    }

    public List<Passageiro> getPassageirosConfirmados() {
        return passageirosConfirmados;
    }

    public void setPassageirosConfirmados(List<Passageiro> passageirosConfirmados) {
        this.passageirosConfirmados = passageirosConfirmados;
    }

    public boolean isExistePassageiro(Passageiro passageiro) {
        return getPassageiros().contains(passageiro);
    }

    public boolean isExistePontoDeParada(PontoDeParada pontoDeParada) {
        return getPontosDeParada().contains(pontoDeParada);
    }

    public boolean isExistePassageiroConfirmado(Passageiro passageiro) {
        return getPassageirosConfirmados().contains(passageiro);
    }

    public void adicionarPassageiro(Passageiro passageiro) throws PassageiroException {
        if (!isExistePassageiro(passageiro)) {
            getPassageiros().add(passageiro);
        } else {
            throw new PassageiroException(passageiro, "Este passageiro já existe para essa rota!");
        }
    }

    public void removerPassageiro(Passageiro passageiro) throws PassageiroException {
        if (isExistePassageiro(passageiro)) {
            getPassageiros().remove(passageiro);
        } else {
            throw new PassageiroException(passageiro, "Este passageiro não existe para essa rota!");
        }
    }

    public void adicionarPontoDeParada(PontoDeParada pontoDeParada) throws PontoDeParadaException {
        if (!isExistePontoDeParada(pontoDeParada)) {
            getPontosDeParada().add(pontoDeParada);
        } else {
            throw new PontoDeParadaException(pontoDeParada, "Este ponto de parada já existe para essa rota!");
        }
    }

    public void removerPontoDeParada(PontoDeParada pontoDeParada) throws PontoDeParadaException {
        if (isExistePontoDeParada(pontoDeParada)) {
            getPontosDeParada().remove(pontoDeParada);
        } else {
            throw new PontoDeParadaException(pontoDeParada, "Este ponto de parada não existe para essa rota!");
        }
    }

    public void adicionarPassageiroConfirmado(Passageiro passageiro) throws PassageiroException {
        if (!isExistePassageiroConfirmado(passageiro)) {
            getPassageirosConfirmados().add(passageiro);
        } else {
            throw new PassageiroException(passageiro, "Este passageiro já esta confirmado para essa rota!");
        }
    }

    public void removerPassageiroConfirmado(Passageiro passageiro) throws PassageiroException {
        if (isExistePassageiroConfirmado(passageiro)) {
            getPassageirosConfirmados().remove(passageiro);
        } else {
            throw new PassageiroException(passageiro, "Este passageiro não esta confirmado para essa rota!");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        return true;
    }

    @Override
    public String toString() {
        return "Rota{" + "id=" + id + ", descricao=" + descricao + ", statusDoCadastro=" + statusDoCadastro + ", veiculo=" + veiculo + ", motorista=" + motorista + ", cronograma=" + cronograma + ", passageiros=" + passageiros + ", pontosDeParada=" + pontosDeParada + ", passageirosConfirmados=" + passageirosConfirmados + '}';
    }

}
