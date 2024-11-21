package com.example.cutepetadoptionapp;

public class Pet {
    private String name;
    private String description;
    private String personality;
    private int imageResource;

    public Pet(String name, String description, String personality, int imageResource) {
        this.name = name;
        this.description = description;
        this.personality = personality;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPersonality() {
        return personality;
    }

    public int getImageResource() {
        return imageResource;
    }
}

