package org.sub;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/sub")
public class OtherResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "sub from Quarkus REST";
    }
}
