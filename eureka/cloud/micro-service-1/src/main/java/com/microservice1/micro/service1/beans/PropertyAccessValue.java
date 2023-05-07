package com.microservice1.micro.service1.beans;

public class PropertyAccessValue {

    private String name;
    private String description;

    public PropertyAccessValue(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PropertyAccessValue{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
