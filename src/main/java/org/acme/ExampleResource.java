package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/color-crush")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

//    @GET
//    @Produces(MediaType.TEXT_HTML)
//    @Path("/login")
//    public int loginPage() throws IOException{
//        String path = "~/IdeaProjects/color-crush/resources/";
//        String fullPath = path + "index.html";
//        return Files.readString(Paths.get(fullPath));
//        return 0;
//    }

}