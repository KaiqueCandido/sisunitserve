/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.entity.Motorista;
import br.com.sisunit.service.MotoristaService;
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
@Path("motorista")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class MotoristaWebService {

    @EJB
    private MotoristaService motoristaService;

    @POST
    public Response salvar(Motorista motorista) {
        Motorista m = motoristaService.salvar(motorista);
        return Response.ok(m).build();
    }

    @POST
    @Path("remove")
    public Response excluir(Motorista motorista) {
        Motorista m = motoristaService.excluir(motorista);
        return Response.ok(m).build();
    }

    @PUT
    public Response atualizar(Motorista motorista) {
        Motorista m = motoristaService.atualizar(motorista);
        return Response.ok(m).build();
    }

    @GET
    @Path("{id}")
    public Response pesquisarPorId(@PathParam(value = "id") Long id) {
        Motorista motorista = motoristaService.pesquisarPeloId(id);
        return Response.ok(motorista).build();
    }

    @GET
    public Response listar() {
        List<Motorista> listarMotoristas = motoristaService.listar();
        GenericEntity<List<Motorista>> motoristas = new GenericEntity<List<Motorista>>(listarMotoristas) {
        };
        return Response.ok(motoristas).build();
    }

}
