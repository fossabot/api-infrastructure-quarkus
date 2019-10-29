
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
    "id",
    "name",
    "description",
    "temporal",
    "deleted",
    "tags"
})
public class Base {

    /**
     * ID of element.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID of element.")
    private String id;
    /**
     * name of element.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of element.")
    private String name;
    /**
     * Textual description.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Textual description.")
    private String description;
    /**
     * Root Type for Validity
     * <p>
     * The root of the Validity type's schema.
     * (Required)
     * 
     */
    @JsonProperty("temporal")
    @JsonPropertyDescription("The root of the Validity type's schema.")
    private Temporal temporal;
    /**
     * Is it deleted ?
     * (Required)
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("Is it deleted ?")
    private Boolean deleted;
    /**
     * Tags on this element.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags on this element.")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * ID of element.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID of element.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * name of element.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of element.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Textual description.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Textual description.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Root Type for Validity
     * <p>
     * The root of the Validity type's schema.
     * (Required)
     * 
     */
    @JsonProperty("temporal")
    public Temporal getTemporal() {
        return temporal;
    }

    /**
     * Root Type for Validity
     * <p>
     * The root of the Validity type's schema.
     * (Required)
     * 
     */
    @JsonProperty("temporal")
    public void setTemporal(Temporal temporal) {
        this.temporal = temporal;
    }

    /**
     * Is it deleted ?
     * (Required)
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Is it deleted ?
     * (Required)
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Tags on this element.
     * 
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * Tags on this element.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
