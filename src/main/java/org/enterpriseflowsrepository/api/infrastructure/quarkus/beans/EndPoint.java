
package org.enterpriseflowsrepository.api.infrastructure.quarkus.beans;

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
    "IP",
    "URL",
    "port"
})
public class EndPoint extends Base  {

    /**
     * IP of this endpoint.
     * (Required)
     * 
     */
    @JsonProperty("IP")
    @JsonPropertyDescription("IP of this endpoint.")
    private String ip;
    /**
     * URL of this endpoint.
     * 
     */
    @JsonProperty("URL")
    @JsonPropertyDescription("URL of this endpoint.")
    private String url;
    /**
     * port of this endpoint.
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("port of this endpoint.")
    private Integer port;

    /**
     * IP of this endpoint.
     * (Required)
     * 
     */
    @JsonProperty("IP")
    public String getIp() {
        return ip;
    }

    /**
     * IP of this endpoint.
     * (Required)
     * 
     */
    @JsonProperty("IP")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * URL of this endpoint.
     * 
     */
    @JsonProperty("URL")
    public String getUrl() {
        return url;
    }

    /**
     * URL of this endpoint.
     * 
     */
    @JsonProperty("URL")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * port of this endpoint.
     * 
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * port of this endpoint.
     * 
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

}
