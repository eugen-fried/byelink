package com.byelink.web.persistence.dto;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: evgeny
 * Date: 3/8/13
 * Time: 12:52 PM
 */
public class TagDto implements Serializable {
    private int id;
    private String value;
    private String description;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
