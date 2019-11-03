
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * description of
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "network",
    "CPU",
    "RAM",
    "softwares",
    "endpoints",
    "serversVirtualized"
})
public class Server extends Base  {

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("The root of the Element type's schema.")
    private org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element network;
    /**
     * Ressources available.
     * 
     */
    @JsonProperty("CPU")
    @JsonPropertyDescription("Ressources available.")
    private Double cpu;
    /**
     * Ressources available.
     * 
     */
    @JsonProperty("RAM")
    @JsonPropertyDescription("Ressources available.")
    private Double ram;
    /**
     * List of softwares installed.
     * 
     */
    @JsonProperty("softwares")
    @JsonPropertyDescription("List of softwares installed.")
    private List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> softwares = new ArrayList<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element>();
    /**
     * endpoints of this server.
     * 
     */
    @JsonProperty("endpoints")
    @JsonPropertyDescription("endpoints of this server.")
    private List<EndPoint> endpoints = new ArrayList<EndPoint>();
    /**
     * Servers virtualized
     * 
     */
    @JsonProperty("serversVirtualized")
    @JsonPropertyDescription("Servers virtualized")
    private List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> serversVirtualized = new ArrayList<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element>();

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * 
     */
    @JsonProperty("network")
    public org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element getNetwork() {
        return network;
    }

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * 
     */
    @JsonProperty("network")
    public void setNetwork(org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element network) {
        this.network = network;
    }

    /**
     * Ressources available.
     * 
     */
    @JsonProperty("CPU")
    public Double getCpu() {
        return cpu;
    }

    /**
     * Ressources available.
     * 
     */
    @JsonProperty("CPU")
    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    /**
     * Ressources available.
     * 
     */
    @JsonProperty("RAM")
    public Double getRam() {
        return ram;
    }

    /**
     * Ressources available.
     * 
     */
    @JsonProperty("RAM")
    public void setRam(Double ram) {
        this.ram = ram;
    }

    /**
     * List of softwares installed.
     * 
     */
    @JsonProperty("softwares")
    public List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> getSoftwares() {
        return softwares;
    }

    /**
     * List of softwares installed.
     * 
     */
    @JsonProperty("softwares")
    public void setSoftwares(List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> softwares) {
        this.softwares = softwares;
    }

    /**
     * endpoints of this server.
     * 
     */
    @JsonProperty("endpoints")
    public List<EndPoint> getEndpoints() {
        return endpoints;
    }

    /**
     * endpoints of this server.
     * 
     */
    @JsonProperty("endpoints")
    public void setEndpoints(List<EndPoint> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Servers virtualized
     * 
     */
    @JsonProperty("serversVirtualized")
    public List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> getServersVirtualized() {
        return serversVirtualized;
    }

    /**
     * Servers virtualized
     * 
     */
    @JsonProperty("serversVirtualized")
    public void setServersVirtualized(List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> serversVirtualized) {
        this.serversVirtualized = serversVirtualized;
    }

}
