package com.allanwilson;

/**
 * Created by awil on 2017-09-03.
 */
public class Bathroom {
    private Sink theSink;
    private Sauna theSauna;
    private Shower theShower;

    public Bathroom (Sink theSink, Sauna theSauna, Shower theShower){
        this.theSink = theSink;
        this.theSauna = theSauna;
        this.theShower = theShower;
    }

    public String showSinkMaterial(){
        return theSink.whatsTheSinkMadeOf();
    }

    public Sink getTheSink(){
        return theSink;
    }

    public Sauna getTheSauna(){
        return theSauna;
    }

    public Shower getTheShower(){
        return theShower;
    }
}
