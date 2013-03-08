package com.byelink.persistence.dao;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.map.ObjectMapper;

import javax.annotation.Nullable;

/**
 * Created by : doron
 * Since: 7/1/12
 */

@JsonTypeName("AppSettings")
public class AppSettings {

    private @Nullable String title;
    private @Nullable JsonNode styling;

    public AppSettings() {}

    public AppSettings(ObjectMapper objectMapper) {
        styling = objectMapper.createObjectNode();
    }

    public <T> T nvl(T value, T fallback) {
        return (value != null)?value:fallback;
    }

    @Nullable
    public JsonNode getStyling() {
        return styling;
    }

    public void setStyling(@Nullable JsonNode styling) {
        this.styling = styling;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    public void setTitle(@Nullable String title) {
        this.title = title;
    }
}
