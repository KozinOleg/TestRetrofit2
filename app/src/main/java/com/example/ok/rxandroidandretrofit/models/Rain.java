package com.example.ok.rxandroidandretrofit.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
public class Rain {

    private Double _1h;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _1h
     */
    public Double get1h() {
        return _1h;
    }

    /**
     * 
     * @param _1h
     *     The 1h
     */
    public void set1h(Double _1h) {
        this._1h = _1h;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_1h).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rain) == false) {
            return false;
        }
        Rain rhs = ((Rain) other);
        return new EqualsBuilder().append(_1h, rhs._1h).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
