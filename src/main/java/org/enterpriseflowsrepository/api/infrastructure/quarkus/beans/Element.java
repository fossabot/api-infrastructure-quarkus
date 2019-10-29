
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Element
 * <p>
 * The root of the Element type's schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "class",
    "link"
})
public class Element {

    /**
     * ID of this element.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ID of this element.")
    private String id;
    /**
     * Type of element
     * 
     */
    @JsonProperty("class")
    @JsonPropertyDescription("Type of element")
    private String _class;
    /**
     * Link to this element
     * 
     */
    @JsonProperty("link")
    @JsonPropertyDescription("Link to this element")
    private String link;

    /**
     * ID of this element.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID of this element.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Type of element
     * 
     */
    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    /**
     * Type of element
     * 
     */
    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     * Link to this element
     * 
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     * Link to this element
     * 
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

}
