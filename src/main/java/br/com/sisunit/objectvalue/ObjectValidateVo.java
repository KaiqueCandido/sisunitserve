/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.objectvalue;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kaique Oliveira
 * @email kaiqueoliveira.ci@gmail.com
 */
@XmlRootElement
public class ObjectValidateVo {

    private String value;

    public ObjectValidateVo() {
    }

    public ObjectValidateVo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
