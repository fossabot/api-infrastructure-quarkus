
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
    "localisation",
    "capacity",
    "zones"
})
public class DataCenter extends Base {

    @JsonProperty("localisation")
    private String localisation;
    @JsonProperty("capacity")
    private String capacity;
    /**
     * zones in datacenter
     * 
     */
    @JsonProperty("zones")
    @JsonPropertyDescription("zones in datacenter")
    private List<Element> zones = new ArrayList<Element>();

    @JsonProperty("localisation")
    public String getLocalisation() {
        return localisation;
    }

    @JsonProperty("localisation")
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @JsonProperty("capacity")
    public String getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * zones in datacenter
     * 
     */
    @JsonProperty("zones")
    public List<Element> getZones() {
        return zones;
    }

    /**
     * zones in datacenter
     * 
     */
    @JsonProperty("zones")
    public void setZones(List<Element> zones) {
        this.zones = zones;
    }

}
