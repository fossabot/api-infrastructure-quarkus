
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeOfResponse",
    "availability",
    "timeToRecover",
    "criticity"
})
public class Sla {

    @JsonProperty("timeOfResponse")
    private Object timeOfResponse;
    @JsonProperty("availability")
    private Object availability;
    @JsonProperty("timeToRecover")
    private Object timeToRecover;
    @JsonProperty("criticity")
    private Object criticity;

    @JsonProperty("timeOfResponse")
    public Object getTimeOfResponse() {
        return timeOfResponse;
    }

    @JsonProperty("timeOfResponse")
    public void setTimeOfResponse(Object timeOfResponse) {
        this.timeOfResponse = timeOfResponse;
    }

    @JsonProperty("availability")
    public Object getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(Object availability) {
        this.availability = availability;
    }

    @JsonProperty("timeToRecover")
    public Object getTimeToRecover() {
        return timeToRecover;
    }

    @JsonProperty("timeToRecover")
    public void setTimeToRecover(Object timeToRecover) {
        this.timeToRecover = timeToRecover;
    }

    @JsonProperty("criticity")
    public Object getCriticity() {
        return criticity;
    }

    @JsonProperty("criticity")
    public void setCriticity(Object criticity) {
        this.criticity = criticity;
    }

}
