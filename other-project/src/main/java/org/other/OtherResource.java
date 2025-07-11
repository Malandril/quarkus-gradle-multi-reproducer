package org.other;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/other")
public class OtherResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Other from Quarkus REST";
    }
}
