/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Rota;
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

    @POST
    public Response salvar(Rota rota) {
        Rota r = rotaService.salvar(rota);
        return Response.ok(r).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Rota rota) {
        Rota r = rotaService.excluir(rota);
        return Response.ok(r).build();
    }

    @PUT
    public Response atualizar(Rota rota) {
        Rota r = rotaService.atualizar(rota);
        return Response.ok(r).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        Rota r = rotaService.pesquisarPeloId(id);
        return Response.ok(r).build();
    }

    @GET
    public Response listar() {
        List<Rota> listarRotas = rotaService.listar();
        GenericEntity<List<Rota>> rotas = new GenericEntity<List<Rota>>(listarRotas) {
        };
        return Response.ok(rotas).build();
    }

}
