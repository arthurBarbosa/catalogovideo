package com.abcode.catalogovideo.domain;

import java.util.UUID;

public class Category {

    private UUID id;
    private String name;
    private String description;
    private Boolean isActive = true;


    public Category(UUID id, String name, String description) throws Exception {
       this.setId(id);
       this.setName(name);
       this.setDescription(description);
    }

    public Category(String name, String description) throws Exception {
        this.id = UUID.randomUUID();
        this.setName(name);
        this.setDescription(description);

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Can not be null");
        }
        if (name.isEmpty()) {
            throw new Exception("Can not be blank");
        }

        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Boolean active() {
        return this.isActive = true;
    }

    public Boolean deactivate() {
        return this.isActive = false;
    }
}
