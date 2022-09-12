package app;

import io.jooby.annotations.*;

@Path("/adicao/{op}/{op2}")
public class Adicao {

    @GET
    public double calculaAdicao(@PathParam double op, @PathParam double op2) {
        return op + op2;
    }
}