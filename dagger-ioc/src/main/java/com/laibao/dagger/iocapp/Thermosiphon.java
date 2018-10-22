package com.laibao.dagger.iocapp;


import javax.inject.Inject;

public class Thermosiphon implements Pump{

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }else {
            System.out.println("<= <= pumping <= <=");
        }
    }
}
