
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
    "technology",
    "runOn",
    "interfaces"
})
public class Deliverable {

    @JsonProperty("technology")
    private Object technology;
    /**
     * description of
     * (Required)
     * 
     */
    @JsonProperty("runOn")
    @JsonPropertyDescription("description of")
    private Software runOn;
    /**
     * Interfaces exposed by this deliverable.
     * 
     */
    @JsonProperty("interfaces")
    @JsonPropertyDescription("Interfaces exposed by this deliverable.")
    private List<Element> interfaces = new ArrayList<Element>();

    @JsonProperty("technology")
    public Object getTechnology() {
        return technology;
    }

    @JsonProperty("technology")
    public void setTechnology(Object technology) {
        this.technology = technology;
    }

    /**
     * description of
     * (Required)
     * 
     */
    @JsonProperty("runOn")
    public Software getRunOn() {
        return runOn;
    }

    /**
     * description of
     * (Required)
     * 
     */
    @JsonProperty("runOn")
    public void setRunOn(Software runOn) {
        this.runOn = runOn;
    }

    /**
     * Interfaces exposed by this deliverable.
     * 
     */
    @JsonProperty("interfaces")
    public List<Element> getInterfaces() {
        return interfaces;
    }

    /**
     * Interfaces exposed by this deliverable.
     * 
     */
    @JsonProperty("interfaces")
    public void setInterfaces(List<Element> interfaces) {
        this.interfaces = interfaces;
    }

}
