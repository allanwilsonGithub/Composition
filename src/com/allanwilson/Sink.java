package com.allanwilson;

/**
 * Created by awil on 2017-09-03.
 */
public class Sink {
    private int volume;
    private String color;
    private String material;

    public Sink (int volume, String color, String material){
        this.volume = volume;
        this.color = color;
        this.material = material;
    }

    public String whatsTheSinkMadeOf(){
        return material;
    }

    public int getVolume(){
        return volume;
    }


}
