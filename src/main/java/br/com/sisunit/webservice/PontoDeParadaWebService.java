/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.PontoDeParada;
import br.com.sisunit.service.PontoDeParadaService;
import java.util.List;
import javax.ejb.EJB;
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
 * @author Kaique Candido kaiqueoliveira.ci@gmail.com
 */
@Path("pontodeparada")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class PontoDeParadaWebService {

    @EJB
    private PontoDeParadaService pontoDeParadaService;

    @POST
    public Response salvar(PontoDeParada pontoDeParada) {
        PontoDeParada pdp = pontoDeParadaService.salvar(pontoDeParada);
        return Response.ok(pdp).build();
    }

    @POST
    @Path("remove")
    public Response excluir(PontoDeParada pontoDeParada) {
        PontoDeParada pdp = pontoDeParadaService.excluir(pontoDeParada);
        return Response.ok(pdp).build();
    }

    @PUT
    public Response atualizar(PontoDeParada pontoDeParada) {
        PontoDeParada pdp = pontoDeParadaService.atualizar(pontoDeParada);
        return Response.ok(pdp).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        PontoDeParada pdp = pontoDeParadaService.pesquisarPeloId(id);
        return Response.ok(pdp).build();
    }

    @GET
    public Response listar() {
        List<PontoDeParada> listarPontosDeParada = pontoDeParadaService.listar();
        GenericEntity<List<PontoDeParada>> pontosDeParada = new GenericEntity<List<PontoDeParada>>(listarPontosDeParada) {
        };
        return Response.ok(pontosDeParada).build();
    }

}
