package app;

import io.jooby.annotations.*;

@Path("/multiplicacao/{op}/{op2}")
public class Multiplicacao {

    @GET
    public double calculaProduto(@PathParam double op, @PathParam double op2) {
        return op * op2;
    }
}