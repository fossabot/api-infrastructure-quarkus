
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Validity
 * <p>
 * The root of the Validity type's schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start",
    "end",
    "obsolete",
    "version",
    "previous",
    "element",
    "uuid"
})
public class Temporal {

    /**
     * start of life
     * (Required)
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("start of life")
    private Date start;
    /**
     * End of life
     * 
     */
    @JsonProperty("end")
    @JsonPropertyDescription("End of life")
    private Date end;
    /**
     * start of obsolecence.
     * 
     */
    @JsonProperty("obsolete")
    @JsonPropertyDescription("start of obsolecence.")
    private Date obsolete;
    /**
     * Version of element.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of element.")
    private String version;
    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * 
     */
    @JsonProperty("previous")
    @JsonPropertyDescription("The root of the Element type's schema.")
    private org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element previous;
    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * (Required)
     * 
     */
    @JsonProperty("element")
    @JsonPropertyDescription("The root of the Element type's schema.")
    private org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element element;
    /**
     * Unique id
     * (Required)
     * 
     */
    @JsonProperty("uuid")
    @JsonPropertyDescription("Unique id")
    private String uuid;

    /**
     * start of life
     * (Required)
     * 
     */
    @JsonProperty("start")
    public Date getStart() {
        return start;
    }

    /**
     * start of life
     * (Required)
     * 
     */
    @JsonProperty("start")
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * End of life
     * 
     */
    @JsonProperty("end")
    public Date getEnd() {
        return end;
    }

    /**
     * End of life
     * 
     */
    @JsonProperty("end")
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * start of obsolecence.
     * 
     */
    @JsonProperty("obsolete")
    public Date getObsolete() {
        return obsolete;
    }

    /**
     * start of obsolecence.
     * 
     */
    @JsonProperty("obsolete")
    public void setObsolete(Date obsolete) {
        this.obsolete = obsolete;
    }

    /**
     * Version of element.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Version of element.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * 
     */
    @JsonProperty("previous")
    public org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element getPrevious() {
        return previous;
    }

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * 
     */
    @JsonProperty("previous")
    public void setPrevious(org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element previous) {
        this.previous = previous;
    }

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * (Required)
     * 
     */
    @JsonProperty("element")
    public org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element getElement() {
        return element;
    }

    /**
     * Root Type for Element
     * <p>
     * The root of the Element type's schema.
     * (Required)
     * 
     */
    @JsonProperty("element")
    public void setElement(org.enterpriseflowsrepository.api.infrastructure.quarkus.beans.Element element) {
        this.element = element;
    }

    /**
     * Unique id
     * (Required)
     * 
     */
    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    /**
     * Unique id
     * (Required)
     * 
     */
    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
