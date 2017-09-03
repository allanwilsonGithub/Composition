package com.allanwilson;

public class Main {

    public static void main(String[] args) {
        Sauna upstairsSauna = new Sauna(70,15,8);
        Sink upstairsSink = new Sink(3,"Green","Marble");
        Shower upstairsShower = new Shower(4,2);

        Bathroom upstairsBathroom = new Bathroom(upstairsSink,upstairsSauna,upstairsShower);
        System.out.println("Sauna capacity is: " + upstairsBathroom.getTheSauna().getCapacity());
        System.out.println("Sink volume is (I did use a getter here): " + upstairsBathroom.getTheSink().getVolume());
        System.out.println("The sink is made of " + upstairsBathroom.getTheSink().whatsTheSinkMadeOf() + ". I didn't use a getter here!");
        System.out.println("The sink is made of " + upstairsBathroom.showSinkMaterial() + ". I didn't use a getter here again!");
    }
}
