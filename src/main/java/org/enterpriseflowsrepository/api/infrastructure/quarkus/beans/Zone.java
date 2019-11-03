
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
    "networks"
})
public class Zone extends Base  {

    @JsonProperty("networks")
    private List<Element> networks = new ArrayList<Element>();

    @JsonProperty("networks")
    public List<Element> getNetworks() {
        return networks;
    }

    @JsonProperty("networks")
    public void setNetworks(List<Element> networks) {
        this.networks = networks;
    }

}
