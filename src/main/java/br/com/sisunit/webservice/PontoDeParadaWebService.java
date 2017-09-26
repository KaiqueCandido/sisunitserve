/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.dominio.PontoDeParada;
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

    @GET
    public Response listPontoDeParada() {
        List<PontoDeParada> listarPontosDeParada = pontoDeParadaService.listar();
        GenericEntity<List<PontoDeParada>> pontosDeParada = new GenericEntity<List<PontoDeParada>>(listarPontosDeParada) {
        };
        return Response.ok(pontosDeParada).build();
    }

    @GET
    @Path("{idPontoDeParada}")
    public Response getPontoDeParada(@PathParam(value = "idPontoDeParada") Long idPontoDeParada) {
        PontoDeParada pontoDeParada = pontoDeParadaService.pesquisarPeloId(idPontoDeParada);
        return Response.ok(pontoDeParada).build();
    }

    @POST
    public Response addPontoDeParada(PontoDeParada pdp) {
        PontoDeParada pontoDeParada = pontoDeParadaService.salvar(pdp);
        return Response.ok(pontoDeParada).build();
    }

    @POST
    @Path("{idPontoDeParada}")
    public Response removePontoDeParada(@PathParam(value = "idPontoDeParada") Long idPontoDeParada) {
        PontoDeParada pontoDeParadaPesquisado = pontoDeParadaService.pesquisarPeloId(idPontoDeParada);
        PontoDeParada pontoDeParada = pontoDeParadaService.excluir(pontoDeParadaPesquisado);
        return Response.ok(pontoDeParada).build();
    }

    @PUT
    public Response atualizaPontoDeParada(PontoDeParada pdp) {
        PontoDeParada pontoDeParada = pontoDeParadaService.atualizar(pdp);
        return Response.ok(pontoDeParada).build();
    }
}
