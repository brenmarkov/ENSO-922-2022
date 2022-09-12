package app;

import io.jooby.annotations.*;

@Path("/subtracao/{op}/{op2}")
public class Subtracao {

    @GET
    public double calculaRaiz(@PathParam double op, @PathParam double op2) {
        return op - op2;
    }
}