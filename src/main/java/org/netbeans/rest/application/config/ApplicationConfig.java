/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@javax.ws.rs.ApplicationPath("ws")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.sisunit.corsfilter.CorsFilter.class);
        resources.add(br.com.sisunit.webservice.CidadeWebService.class);
        resources.add(br.com.sisunit.webservice.ContaWebService.class);
        resources.add(br.com.sisunit.webservice.CronogramaWebService.class);
        resources.add(br.com.sisunit.webservice.EnumWebService.class);
        resources.add(br.com.sisunit.webservice.EstadoWebService.class);
        resources.add(br.com.sisunit.webservice.GestorWebService.class);
        resources.add(br.com.sisunit.webservice.LoginWebService.class);
        resources.add(br.com.sisunit.webservice.MotoristaWebService.class);
        resources.add(br.com.sisunit.webservice.PassageiroWebService.class);
        resources.add(br.com.sisunit.webservice.PontoDeParadaWebService.class);
        resources.add(br.com.sisunit.webservice.RotaWebService.class);
        resources.add(br.com.sisunit.webservice.ValidatorWebService.class);
        resources.add(br.com.sisunit.webservice.VeiculoWebService.class);
    }

}
