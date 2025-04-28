package com.example.project;

public class Wardrobe {
    private int size;
    private int wall;

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

    void add(int element){
        wall += element;
    }

    int checkWall() throws RuntimeException{
        if (wall == 250)
            return wall;
        else
            throw new RuntimeException("Elements too large for wall.");
    }
}
