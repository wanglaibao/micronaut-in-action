package com.laibao.micronaut.iocapp.qualify.primary;

import javax.inject.Singleton;

@Singleton
public class ColorPicker {

    private final Color color;

    public ColorPicker(Color color) {
        this.color = color;
    }

    public String index() {
        return color.getColor();
    }
}
