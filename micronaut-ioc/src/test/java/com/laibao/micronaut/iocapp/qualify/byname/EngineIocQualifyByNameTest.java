package com.laibao.micronaut.iocapp.qualify.byname;

import io.micronaut.context.ApplicationContext;
import org.junit.Test;


public class EngineIocQualifyByNameTest {

    @Test
    public void testEngineStartQualifyByName() {
        try (ApplicationContext applicationContext = ApplicationContext.run()) {
            com.laibao.micronaut.iocapp.qualify.byname.Vehicle vehicle = applicationContext.getBean(Vehicle.class);
            System.out.println(vehicle.start());
            System.out.println();

            com.laibao.micronaut.iocapp.qualify.byname.Car car = applicationContext.getBean(Car.class);
            System.out.println(car.start());
            System.out.println();

            com.laibao.micronaut.iocapp.qualify.byname.Bus bus = applicationContext.getBean(Bus.class);
            System.out.println(bus.start());
            System.out.println();
        }
    }
}
