package app;

import io.jooby.annotations.*;

@Path("/divisao/{op}/{op2}")
public class Divisao {

    @GET
    public double calculaRaiz(@PathParam double op, @PathParam double op2) {
        return op / op2;
    }
}
