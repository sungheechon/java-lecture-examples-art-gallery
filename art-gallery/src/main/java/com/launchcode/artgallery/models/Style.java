package com.launchcode.artgallery.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Style extends AbstractEntity {

    @NotBlank(message = "Name of style is required.")
    private String name;

    @OneToMany(mappedBy = "style")
    private List<Artwork> artworks = new ArrayList<>();

    public Style() {}

    public Style(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

}
