package org.enterpriseflowsrepository.api.infrastructure.quarkus;

import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.EndPoint;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/endpoint")
public interface EndpointResource {
  /**
   * list all endpoints
   */
  @GET
  @Produces("application/json")
  List<EndPoint> listEndPoints();

  /**
   * add a endpoint
   */
  @POST
  @Consumes("application/json")
  void addEndPoint(EndPoint data);

  /**
   * Get description of a endpoint.
   */
  @Path("/{id}")
  @GET
  @Produces("application/json")
  EndPoint getOneEndPoint(@PathParam("id") String id, @QueryParam("version") String version);

  /**
   * Modify this endpoint.
   */
  @Path("/{id}")
  @POST
  @Consumes("application/json")
  void modifyOneEndPoint(@PathParam("id") String id, @QueryParam("version") String version,
      EndPoint data);

  /**
   * Delete this endpoint
   */
  @Path("/{id}")
  @DELETE
  void deleteOneEndPoint(@PathParam("id") String id, @QueryParam("version") String version);
}
