package com.axun.meituandemo.model;

public class LeftModel {

    private String name;
    private String typeId;

    public LeftModel() {
    }

    public LeftModel(String name, String typeId) {
        this.name = name;
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
