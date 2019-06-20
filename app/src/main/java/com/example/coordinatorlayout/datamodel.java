package com.example.coordinatorlayout;

public class datamodel {
    public datamodel(int image, String name) {
        this.image = image;
        this.name = name;
    }

    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
