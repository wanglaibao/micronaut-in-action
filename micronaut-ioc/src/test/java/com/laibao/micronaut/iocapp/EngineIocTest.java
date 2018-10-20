package com.laibao.micronaut.iocapp;

import io.micronaut.context.ApplicationContext;
import org.junit.Test;

public class EngineIocTest {

    @Test
    public void testEngineStart() {
        try (ApplicationContext applicationContext = ApplicationContext.run()) {
            Vehicle vehicle = applicationContext.getBean(Vehicle.class);
            System.out.println(vehicle.start());
            System.out.println();

            Car car = applicationContext.getBean(Car.class);
            System.out.println(car.start());
            System.out.println();

            Bus bus = applicationContext.getBean(Bus.class);
            System.out.println(bus.start());
            System.out.println();
        }
    }
}
