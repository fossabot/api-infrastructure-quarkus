
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
    "technologicalFoundation",
    "deliverables",
    "dependencies"
})
public class Software {

    /**
     * Is it a technological foundation ?
     * (Required)
     * 
     */
    @JsonProperty("technologicalFoundation")
    @JsonPropertyDescription("Is it a technological foundation ?")
    private Boolean technologicalFoundation;
    /**
     * Deliverables run on
     * 
     */
    @JsonProperty("deliverables")
    @JsonPropertyDescription("Deliverables run on")
    private List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> deliverables = new ArrayList<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element>();
    /**
     * Software dependencies.
     * 
     */
    @JsonProperty("dependencies")
    @JsonPropertyDescription("Software dependencies.")
    private List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> dependencies = new ArrayList<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element>();

    /**
     * Is it a technological foundation ?
     * (Required)
     * 
     */
    @JsonProperty("technologicalFoundation")
    public Boolean getTechnologicalFoundation() {
        return technologicalFoundation;
    }

    /**
     * Is it a technological foundation ?
     * (Required)
     * 
     */
    @JsonProperty("technologicalFoundation")
    public void setTechnologicalFoundation(Boolean technologicalFoundation) {
        this.technologicalFoundation = technologicalFoundation;
    }

    /**
     * Deliverables run on
     * 
     */
    @JsonProperty("deliverables")
    public List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> getDeliverables() {
        return deliverables;
    }

    /**
     * Deliverables run on
     * 
     */
    @JsonProperty("deliverables")
    public void setDeliverables(List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> deliverables) {
        this.deliverables = deliverables;
    }

    /**
     * Software dependencies.
     * 
     */
    @JsonProperty("dependencies")
    public List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> getDependencies() {
        return dependencies;
    }

    /**
     * Software dependencies.
     * 
     */
    @JsonProperty("dependencies")
    public void setDependencies(List<org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element> dependencies) {
        this.dependencies = dependencies;
    }

}
