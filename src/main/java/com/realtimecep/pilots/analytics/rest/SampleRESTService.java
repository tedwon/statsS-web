package com.realtimecep.pilots.analytics.rest;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Sample REST Service Class.
 *
 * http://localhost:8080/statss-web/rest/hello
 *
 * @author <a href="iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 */

@Controller
@Path("/rest")
public class SampleRESTService {

    /**
     * Sample REST API.
     * http://localhost:8080/statss-web/rest/hello
     * @return sample data
     */
    @GET
    @Produces({MediaType.TEXT_PLAIN})
//    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("hello")
    public String getSampleData() {
        return "Hello";
    }
}
