package org.enterpriseflowsrepository.api.infrastructure.quarkus;

import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Error;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/errors")
public interface ErrorsResource {
  /**
   * Gets a list of all `Error` entities.
   */
  @GET
  @Produces("application/json")
  List<Error> geterrors();

  /**
   * Creates a new instance of a `Error`.
   */
  @POST
  @Consumes("application/json")
  void createError(Error data);

  /**
   * Gets the details of a single instance of a `Error`.
   */
  @Path("/{errorId}")
  @GET
  @Produces("application/json")
  Error getError(@PathParam("errorId") String errorId);

  /**
   * Updates an existing `Error`.
   */
  @Path("/{errorId}")
  @PUT
  @Consumes("application/json")
  void updateError(@PathParam("errorId") String errorId, Error data);

  /**
   * Deletes an existing `Error`.
   */
  @Path("/{errorId}")
  @DELETE
  void deleteError(@PathParam("errorId") String errorId);
}
