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
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Server;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/server")
public interface ServerResource {
  /**
   * list all servers
   */
  @GET
  @Produces("application/json")
  List<Server> listServers();

  /**
   * add a server
   */
  @POST
  @Consumes("application/json")
  void addServer(Server data);

  /**
   * Get description of a server.
   */
  @Path("/{id}")
  @GET
  @Produces("application/json")
  Server getOneServer(@PathParam("id") String id, @QueryParam("version") String version);

  /**
   * Modify this server.
   */
  @Path("/{id}")
  @POST
  @Consumes("application/json")
  void modifyOneServer(@PathParam("id") String id, @QueryParam("version") String version,
      Server data);

  /**
   * Delete this server
   */
  @Path("/{id}")
  @DELETE
  void deleteOneServer(@PathParam("id") String id, @QueryParam("version") String version);
}
