package com.realtimecep.pilots.analytics.rest;

import com.realtimecep.pilots.analytics.rest.domains.OrderEventLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Sample REST Service Class.
 * <p/>
 * http://localhost:8080/statss-web/rest/hello
 *
 * @author <a href="iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 */

@Controller
@Path("/rest")
public class SampleRESTService {

    /**
     * Get text data.
     * <p/>
     * http://localhost:8080/statss-web/rest/text
     *
     * @return sample data
     */
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("text")
    public String getSampleTextData() {
        return "Hello";
    }

    /**
     * Get xml data.
     * <p/>
     * http://localhost:8080/statss-web/rest/xml
     *
     * @return sample data
     */
    @GET
    @Produces({MediaType.APPLICATION_XML})
    @Path("xml")
    public OrderEventLog getSampleXmlData() {
        return new OrderEventLog("myItemName");
    }

    /**
     * Get xml data.
     * <p/>
     * http://localhost:8080/statss-web/rest/json
     *
     * @return sample data
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("json")
    public OrderEventLog getSampleJsonData() {
        return new OrderEventLog("myItemName");
    }

    /**
     * Get xml data.
     * <p/>
     * http://localhost:8080/statss-web/rest/html
     *
     * @return sample data
     */
    @GET
    @Produces({MediaType.TEXT_HTML})
    @Path("html")
    public ModelAndView getSampleHtmlData() {
        // forward to the "contacts" view, with a request attribute named
        // "contacts" that has all of the existing contacts
        return new ModelAndView("contacts", "contacts", new OrderEventLog("myItemName"));
    }
}
