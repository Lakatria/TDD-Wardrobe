package com.example.project;

public class Wardrobe {
    private int size;

    public void setSize(int size){
        this.size = size;
    }

    int getSize(){
        return size;
    }

    int getPrice(int size){
        if (size <= 50)
            return 59;
        else if (size <= 75)
            return 62;
        else if (size <= 100)
            return 90;
        else if (size <= 120)
            return 111;
        return 0;
    }
}
