/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.dominio.PessoaFisica;
import br.com.sisunit.service.PessoaFisicaService;
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
@Path("pessoafisica")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class PessoaFisicaWebService {

    @EJB
    private PessoaFisicaService pessoaFisicaService;

    @GET
    public Response listPessoaFisica() {
        List<PessoaFisica> listarPessoasFisica = pessoaFisicaService.listar();
        GenericEntity<List<PessoaFisica>> pessoasFisicas = new GenericEntity<List<PessoaFisica>>(listarPessoasFisica) {
        };
        return Response.ok(pessoasFisicas).build();
    }

    @GET
    @Path("{idPessoaFisica}")
    public Response getPessoaFisica(@PathParam(value = "idPessoaFisica") Long idPessoaFisica) {
        PessoaFisica pessoaFisica = pessoaFisicaService.pesquisarPeloId(idPessoaFisica);
        return Response.ok(pessoaFisica).build();
    }

    @POST
    public Response addPessoaFisica(PessoaFisica pf) {
        PessoaFisica pessoaFisica = pessoaFisicaService.salvar(pf);
        return Response.ok(pessoaFisica).build();
    }

    @POST
    @Path("{idPessoaFisica}")
    public Response removePassageiro(@PathParam(value = "idPessoaFisica") Long idPessoaFisica) {
        PessoaFisica pessoaFisicaPesquisada = pessoaFisicaService.pesquisarPeloId(idPessoaFisica);
        PessoaFisica pessoaFisica = pessoaFisicaService.excluir(pessoaFisicaPesquisada);
        return Response.ok(pessoaFisica).build();
    }

    @PUT
    public Response atualizaPessoaFisica(PessoaFisica pf) {
        PessoaFisica pessoaFisica = pessoaFisicaService.atualizar(pf);
        return Response.ok(pessoaFisica).build();
    }
}
