package com.laibao.micronaut.iocapp;

import io.micronaut.context.ApplicationContext;
import org.junit.Test;

public class EngineIocTest {

    @Test
    public void testEngineStart() {
        try (ApplicationContext applicationContext = ApplicationContext.run()) {
            Vehicle vehicle = applicationContext.getBean(Vehicle.class);
            System.out.println(vehicle.start());
        }
    }
}
