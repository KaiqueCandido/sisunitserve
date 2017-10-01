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

    @GET
    public Response listMotoristas() {
        List<Motorista> listarMotoristas = motoristaService.listar();
        GenericEntity<List<Motorista>> motoristas = new GenericEntity<List<Motorista>>(listarMotoristas) {
        };
        return Response.ok(motoristas).build();
    }

    @GET
    @Path("{idMotorista}")
    public Response getMotorista(@PathParam(value = "idMotorista") Long idMotorista) {
        Motorista motorista = motoristaService.pesquisarPeloId(idMotorista);
        return Response.ok(motorista).build();
    }

    @POST
    public Response addMotorista(Motorista m) {
        System.out.println(m);
        Motorista motorista = motoristaService.salvar(m);
        return Response.ok(motorista).build();
    }

//    @POST
//    @Path("{idMotorista}")
//    public Response removeMotorista(@PathParam(value = "idMotorista") Long idMotorista) {
//        Motorista motoristaPesquisado = motoristaService.pesquisarPeloId(idMotorista);
//        Motorista motorista = motoristaService.excluir(motoristaPesquisado);
//        return Response.ok(motorista).build();
//    }

    @PUT
    public Response atualizaMotorista(Motorista m) {
        System.out.println(m);
        Motorista motorista = motoristaService.atualizar(m);
        return Response.ok(motorista).build();
    }
}
