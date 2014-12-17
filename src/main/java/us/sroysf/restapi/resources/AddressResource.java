package us.sroysf.restapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import us.sroysf.restapi.model.SimpleAddress;

/**
 * AddressResource
 *
 * @author saptarshi.roy
 */
@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {
    @GET
    @Timed
    public SimpleAddress sayHello(@QueryParam("name") Optional<String> name) {
        return new SimpleAddress("1034 Main St",
                "Suite 449",
                "San Francisco",
                "CA",
                "94105");
    }
}
