package com.allanwilson;

/**
 * Created by awil on 2017-09-01.
 */
public class Resolution {
    private int width;
    private int height;

    public Resolution (int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
