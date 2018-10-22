package com.laibao.dagger.iocapp;

import dagger.Lazy;

import javax.inject.Inject;

public class CoffeeMaker {

    // Create a possibly costly heater only when we use it.
    private final Lazy<Heater> heater;

   private final Pump pump;

    @Inject
    public CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }

}
