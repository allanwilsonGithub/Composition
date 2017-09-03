package com.allanwilson;

/**
 * Created by awil on 2017-09-03.
 */
public class Sauna {
    private int maxHeat;
    private int age;
    private int capacity;

    public Sauna (int maxHeat, int age, int capacity){
        this.maxHeat = maxHeat;
        this.age = age;
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
