package org.enterpriseflowsrepository.api.infrastructure.quarkus;

import java.lang.Object;
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
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.DataCenter;
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Network;
import org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Zone;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/datacenter")
public interface DatacenterResource {
  /**
   * list all datacenters
   */
  @GET
  @Produces("application/json")
  List<DataCenter> listDataCenters();

  /**
   * add a datacenter
   */
  @POST
  @Consumes("application/json")
  void addDataCenter(DataCenter data);

  /**
   * Get Full description.
   */
  @Path("/{id}")
  @GET
  @Produces("application/json")
  DataCenter getOneDataCenter(@QueryParam("version") String version, @PathParam("id") String id);

  /**
   * Update DataCenter
   */
  @Path("/{id}")
  @POST
  @Consumes("application/json")
  void modifyOneDataCenter(@QueryParam("version") String version, @PathParam("id") Object id,
      DataCenter data);

  /**
   * Delete this zone
   */
  @Path("/{id}")
  @DELETE
  void deleteOneDataCenter(@QueryParam("version") String version, @PathParam("id") String id);

  /**
   * Get description of a zone.
   */
  @Path("/{id}/zone/{id}")
  @GET
  @Produces("application/json")
  Zone getOneZone(@PathParam("id") String id, @QueryParam("version") String version);

  /**
   * Modify this zone.
   */
  @Path("/{id}/zone/{id}")
  @POST
  @Consumes("application/json")
  void modifyOneZone(@PathParam("id") String id, @QueryParam("version") String version, Zone data);

  /**
   * Delete this zone
   */
  @Path("/{id}/zone/{id}")
  @DELETE
  void deleteOneZone(@PathParam("id") String id, @QueryParam("version") String version);

  /**
   * list all zones
   */
  @Path("/{id}/zone")
  @GET
  @Produces("application/json")
  List<Zone> listZones(@PathParam("id") String id);

  /**
   * add a zone
   */
  @Path("/{id}/zone")
  @POST
  @Consumes("application/json")
  void addZone(@PathParam("id") String id, Zone data);

  /**
   * list all networks
   */
  @Path("/{id}/zone/{id}/network")
  @GET
  @Produces("application/json")
  List<Network> listNetworks();

  /**
   * add a network
   */
  @Path("/{id}/zone/{id}/network")
  @POST
  @Consumes("application/json")
  void addNetwork(Network data);

  /**
   * Get description of a network.
   */
  @Path("/{id}/zone/{id}/network/{id}")
  @GET
  @Produces("application/json")
  Network getOneNetwork(@PathParam("id") String id, @QueryParam("version") String version);

  /**
   * Modify this network.
   */
  @Path("/{id}/zone/{id}/network/{id}")
  @POST
  @Consumes("application/json")
  void modifyOneNetwork(@PathParam("id") String id, @QueryParam("version") String version,
      Network data);

  /**
   * Delete this network
   */
  @Path("/{id}/zone/{id}/network/{id}")
  @DELETE
  void deleteOneNetwork(@PathParam("id") String id, @QueryParam("version") String version);
}
