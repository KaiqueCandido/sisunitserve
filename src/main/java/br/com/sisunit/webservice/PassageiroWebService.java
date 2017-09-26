/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.dominio.Passageiro;
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

    @GET
    public Response listPassageiro() {
        List<Passageiro> listarPassageiros = passageiroService.listar();
        GenericEntity<List<Passageiro>> passageiros = new GenericEntity<List<Passageiro>>(listarPassageiros) {
        };
        return Response.ok(passageiros).build();
    }

    @GET
    @Path("{idPassageiro}")
    public Response getPassageiro(@PathParam(value = "idPassageiro") Long idPassageiro) {
        Passageiro passageiro = passageiroService.pesquisarPeloId(idPassageiro);
        return Response.ok(passageiro).build();
    }

    @POST
    public Response addPassageiro(Passageiro p) {
        Passageiro passageiro = passageiroService.salvar(p);
        return Response.ok(passageiro).build();
    }

    @POST
    @Path("{idPassageiro}")
    public Response removePassageiro(@PathParam(value = "idPassageiro") Long idPassageiro) {
        Passageiro passageiroPesquisado = passageiroService.pesquisarPeloId(idPassageiro);
        Passageiro passageiro = passageiroService.excluir(passageiroPesquisado);
        return Response.ok(passageiro).build();
    }

    @PUT
    public Response atualizaPassageiro(Passageiro p) {
        Passageiro passageiro = passageiroService.atualizar(p);
        return Response.ok(passageiro).build();
    }
}
