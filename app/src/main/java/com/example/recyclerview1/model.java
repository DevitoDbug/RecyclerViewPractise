package com.example.recyclerview1;

public class model {
    String pName;
    int image;
    String description ;


    public model(int image, String pName,String description) {
        this.pName = pName;
        this.image = image;
        this.description = description;
    }

    public String getpName() {
        return pName;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
