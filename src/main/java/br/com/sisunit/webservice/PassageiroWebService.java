/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Passageiro;
import br.com.sisunit.service.PassageiroService;
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
@Path("passageiro")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class PassageiroWebService {

    @EJB
    private PassageiroService passageiroService;

    @POST
    public Response salvar(Passageiro passageiro) {
        Passageiro p = passageiroService.salvar(passageiro);
        return Response.ok(p).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Passageiro passageiro) {
        Passageiro p = passageiroService.excluir(passageiro);
        return Response.ok(p).build();
    }

    @PUT
    public Response atualizar(Passageiro passageiro) {
        Passageiro p = passageiroService.atualizar(passageiro);
        return Response.ok(p).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        Passageiro p = passageiroService.pesquisarPeloId(id);
        return Response.ok(p).build();
    }

    @GET
    public Response listar() {
        List<Passageiro> listarPassageiros = passageiroService.listar();
        GenericEntity<List<Passageiro>> passageiros = new GenericEntity<List<Passageiro>>(listarPassageiros) {
        };
        return Response.ok(passageiros).build();
    }

}
