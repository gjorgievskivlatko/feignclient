package com.example.feignclient.dtos;

import java.time.LocalDateTime;

public class ItemDTO {

    private String propertyString;
    private Integer propertyInteger;
    private int propertyInt;
    private LocalDateTime propertyLocalDateTime;

    public String getPropertyString() {
        return propertyString;
    }

    public void setPropertyString(String propertyString) {
        this.propertyString = propertyString;
    }

    public Integer getPropertyInteger() {
        return propertyInteger;
    }

    public void setPropertyInteger(Integer propertyInteger) {
        this.propertyInteger = propertyInteger;
    }

    public int getPropertyInt() {
        return propertyInt;
    }

    public void setPropertyInt(int propertyInt) {
        this.propertyInt = propertyInt;
    }

    public LocalDateTime getPropertyLocalDateTime() {
        return propertyLocalDateTime;
    }

    public void setPropertyLocalDateTime(LocalDateTime propertyLocalDateTime) {
        this.propertyLocalDateTime = propertyLocalDateTime;
    }
}
