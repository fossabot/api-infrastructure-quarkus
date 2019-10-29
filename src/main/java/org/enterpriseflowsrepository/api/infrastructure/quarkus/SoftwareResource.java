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
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Software;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/software")
public interface SoftwareResource {
  /**
   * list all software
   */
  @GET
  @Produces("application/json")
  List<Software> listSoftwares();

  /**
   * add a software
   */
  @POST
  @Consumes("application/json")
  void addSoftware(Software data);

  /**
   * Get description of a software.
   */
  @Path("/{id}")
  @GET
  @Produces("application/json")
  Software getOneSoftware(@PathParam("id") String id, @QueryParam("version") String version);

  /**
   * Modify this software.
   */
  @Path("/{id}")
  @POST
  @Consumes("application/json")
  void modifyOneSoftware(@PathParam("id") String id, @QueryParam("version") String version,
      Software data);

  /**
   * Delete this software
   */
  @Path("/{id}")
  @DELETE
  void deleteOneSoftware(@PathParam("id") String id, @QueryParam("version") String version);
}
