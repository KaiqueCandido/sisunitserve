/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Cronograma;
import br.com.sisunit.service.CronogramaService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Path("cronograma")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CronogramaWebService {

    private CronogramaService cronogramaService;

    @POST
    public Response salvar(Cronograma cronograma) {
        Cronograma c = cronogramaService.salvar(cronograma);
        return Response.ok(c).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Cronograma cronograma) {
        Cronograma c = cronogramaService.excluir(cronograma);
        return Response.ok(c).build();
    }

    @PUT
    public Response atualizar(Cronograma cronograma) {
        Cronograma c = cronogramaService.atualizar(cronograma);
        return Response.ok(c).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        Cronograma c = cronogramaService.pesquisarPorId(id);
        return Response.ok(c).build();
    }

    @GET
    public Response listar() {
        List<Cronograma> cronogramas = cronogramaService.listar();
        GenericEntity<List<Cronograma>> cronogramasEntity = new GenericEntity<List<Cronograma>>(cronogramas) {
        };
        return Response.ok(cronogramasEntity).build();
    }

}
