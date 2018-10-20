package com.laibao.micronaut.iocapp.qualify.byannotation;

import io.micronaut.context.ApplicationContext;
import org.junit.Test;


public class EngineIocByAnnotationTest {

    @Test
    public void testEngineStartQualifyByAnnotation() {
        try (ApplicationContext applicationContext = ApplicationContext.run()) {
            com.laibao.micronaut.iocapp.qualify.byannotation.Vehicle vehicle = applicationContext.getBean(Vehicle.class);
            System.out.println(vehicle.start());
            System.out.println();

            com.laibao.micronaut.iocapp.qualify.byannotation.Car car = applicationContext.getBean(Car.class);
            System.out.println(car.start());
            System.out.println();

            com.laibao.micronaut.iocapp.qualify.byannotation.Bus bus = applicationContext.getBean(Bus.class);
            System.out.println(bus.start());
            System.out.println();
        }
    }
}
