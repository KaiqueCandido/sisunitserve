/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.dominio.Rota;
import br.com.sisunit.service.RotaService;
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
@Path("rota")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class RotaWebService {

    @EJB
    private RotaService rotaService;

    @GET
    public Response listRotas() {
        List<Rota> listarRotas = rotaService.listar();
        GenericEntity<List<Rota>> rotas = new GenericEntity<List<Rota>>(listarRotas) {
        };
        return Response.ok(rotas).build();
    }

    @GET
    @Path("{idRota}")
    public Response getRota(@PathParam(value = "idRota") Long idRota) {
        Rota rota = rotaService.pesquisarPeloId(idRota);
        return Response.ok(rota).build();
    }

    @POST
    public Response addRota(Rota r) {
        Rota rota = rotaService.salvar(r);
        return Response.ok(rota).build();
    }

    @POST
    @Path("{idRota}")
    public Response removeRota(@PathParam(value = "idRota") Long idRota) {
        Rota rotaPesquisada = rotaService.pesquisarPeloId(idRota);
        Rota rota = rotaService.excluir(rotaPesquisada);
        return Response.ok(rota).build();
    }

    @PUT
    public Response atualizaRota(Rota r) {
        Rota rota = rotaService.atualizar(r);
        return Response.ok(rota).build();
    }
}
