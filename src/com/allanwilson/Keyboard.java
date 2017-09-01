package com.allanwilson;

/**
 * Created by awil on 2017-09-01.
 */
public class Keyboard {
    private String type;

    public Keyboard (String type){
        this.type = type;
    }

    public void turnKeysToColor(String keyColor){
        System.out.println("Turning all the keys " + keyColor);
    }

    public String getType(){
        return type;
    }
}
