/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Gestor;
import br.com.sisunit.service.GestorService;
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
@Path("gestor")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class GestorWebService {

    private GestorService gestorService;

    @POST
    public Response salvar(Gestor gestor) {
        Gestor g = gestorService.salvar(gestor);
        return Response.ok(g).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Gestor gestor) {
        Gestor g = gestorService.excluir(gestor);
        return Response.ok(g).build();
    }

    @PUT
    public Response atualizar(Gestor gestor) {
        Gestor g = gestorService.atualizar(gestor);
        return Response.ok(g).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        Gestor c = gestorService.pesquisarPorId(id);
        return Response.ok(c).build();
    }

    @GET
    public Response listar() {
        List<Gestor> gestores = gestorService.listar();
        GenericEntity<List<Gestor>> gestoresEntity = new GenericEntity<List<Gestor>>(gestores) {
        };
        return Response.ok(gestoresEntity).build();
    }

}
