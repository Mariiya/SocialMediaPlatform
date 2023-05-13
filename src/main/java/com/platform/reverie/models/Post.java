package com.platform.reverie.models;

import java.math.BigInteger;

public class Post {
    private BigInteger id;
    private String description;

    public Post(BigInteger id, String description) {
        this.id = id;
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
