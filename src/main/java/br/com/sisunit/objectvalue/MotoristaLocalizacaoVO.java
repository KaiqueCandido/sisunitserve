/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisunit.objectvalue;

import br.com.sisunit.entity.PontoDeParada;
import java.util.List;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
public class MotoristaLocalizacaoVO {
    
    private Long idMotorista;
    private String latitude;
    private String longitude;
    private List<PontoDeParada> pontosDeParada;

    public MotoristaLocalizacaoVO() {
    }

    public MotoristaLocalizacaoVO(Long idMotorista, String latitude, String longitude, List<PontoDeParada> pontosDeParada) {
        this.idMotorista = idMotorista;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pontosDeParada = pontosDeParada;
    }

    public Long getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(Long idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }

    public void setPontosDeParada(List<PontoDeParada> pontosDeParada) {
        this.pontosDeParada = pontosDeParada;
    }

    @Override
    public String toString() {
        return "MotoristaLocalizacaoVO{" + "idMotorista=" + idMotorista + ", latitude=" + latitude + ", longitude=" + longitude + ", pontosDeParada=" + pontosDeParada + '}';
    }        

}
