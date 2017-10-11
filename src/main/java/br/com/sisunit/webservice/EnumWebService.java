/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisunit.webservice;

import br.com.sisunit.enums.DiasDaSemanaEnum;
import br.com.sisunit.enums.SexoEnum;
import br.com.sisunit.enums.StatusDoCadastroEnum;
import br.com.sisunit.enums.TipoDeZonaEnum;
import br.com.sisunit.enums.TurnoEnum;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Oliveira
 * @Email kaiqueoliveira.ci@gmail.com
 */
@Path("enum")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class EnumWebService {

    @GET
    @Path("diasdasemana")
    public Response diasDaSemana() {
        List<DiasDaSemanaEnum> diasDaSemana = Arrays.asList(DiasDaSemanaEnum.values());
        GenericEntity<List<DiasDaSemanaEnum>> diasGe = new GenericEntity<List<DiasDaSemanaEnum>>(diasDaSemana) {
        };
        return Response.ok(diasGe).build();
    }

    @GET
    @Path("sexos")
    public Response sexos() {
        List<SexoEnum> sexos = Arrays.asList(SexoEnum.values());
        GenericEntity<List<SexoEnum>> sexosGe = new GenericEntity<List<SexoEnum>>(sexos) {
        };
        return Response.ok(sexosGe).build();
    }

    @GET
    @Path("statusdocadastro")
    public Response statusDosCadastros() {
        List<StatusDoCadastroEnum> statusDosCadastros = Arrays.asList(StatusDoCadastroEnum.values());
        GenericEntity<List<StatusDoCadastroEnum>> statusGe = new GenericEntity<List<StatusDoCadastroEnum>>(statusDosCadastros) {
        };
        return Response.ok(statusGe).build();
    }

    @GET
    @Path("tipodezona")
    public Response tiposDeZona() {
        List<TipoDeZonaEnum> tiposDezonas = Arrays.asList(TipoDeZonaEnum.values());
        GenericEntity<List<TipoDeZonaEnum>> tiposDeZonasGe = new GenericEntity<List<TipoDeZonaEnum>>(tiposDezonas) {
        };
        return Response.ok(tiposDeZonasGe).build();
    }

    @GET
    @Path("turno")
    public Response turnos() {
        List<TurnoEnum> turnos = Arrays.asList(TurnoEnum.values());
        GenericEntity<List<TurnoEnum>> turnosGe = new GenericEntity<List<TurnoEnum>>(turnos) {
        };
        return Response.ok(turnosGe).build();
    }

}
