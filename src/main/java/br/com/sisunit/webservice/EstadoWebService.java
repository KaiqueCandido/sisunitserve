/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Estado;
import br.com.sisunit.service.EstadoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Path("estado")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class EstadoWebService {

    @EJB
    private EstadoService estadoService;

    @GET
    public Response listar() {
        List<Estado> listarEstados = estadoService.listar();
        GenericEntity<List<Estado>> estados = new GenericEntity<List<Estado>>(listarEstados) {
        };
        return Response.ok(estados).build();
    }

}
