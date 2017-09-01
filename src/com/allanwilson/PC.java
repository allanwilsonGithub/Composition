package com.allanwilson;

/**
 * Created by awil on 2017-09-01.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private Keyboard keyboard;

    public PC (Case theCase, Monitor monitor, Motherboard motherboard, Keyboard keyboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.keyboard = keyboard;
    }

    public Case getTheCase(){
        return theCase;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public Motherboard getMotherboard(){
        return motherboard;
    }

    public Keyboard getKeyboard(){
        return keyboard;
    }
}
