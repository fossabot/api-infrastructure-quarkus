
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Tag to filter and specify elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value"
})
public class Tag {

    /**
     * name of tag
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of tag")
    private String name;
    /**
     * value of tag
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("value of tag")
    private String value;

    /**
     * name of tag
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of tag
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * value of tag
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * value of tag
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
