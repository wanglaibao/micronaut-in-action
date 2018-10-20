package com.laibao.micronaut.iocapp.qualify.primary;
import io.micronaut.context.BeanContext;
import org.junit.Test;

public class ColorPickerTest {

    @Test
    public void testIndex() {
        try(BeanContext beanContext = BeanContext.run()) {
            ColorPicker colorPicker = beanContext.getBean(ColorPicker.class);
            String colorValue = colorPicker.index();
            System.out.println(colorValue);
        }
    }
}
