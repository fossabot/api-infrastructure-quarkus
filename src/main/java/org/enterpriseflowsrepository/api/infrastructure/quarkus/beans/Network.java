
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * description of
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "servers"
})
public class Network {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("servers")
    private List<Element> servers = new ArrayList<Element>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("servers")
    public List<Element> getServers() {
        return servers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("servers")
    public void setServers(List<Element> servers) {
        this.servers = servers;
    }

}
