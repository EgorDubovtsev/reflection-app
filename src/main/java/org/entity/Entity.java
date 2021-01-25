package org.entity;

import org.annotation.Secured;

public class Entity {
    @Secured(1)
    public int firstMethod(int value) {
        return value;
    }

    @Secured(2)
    private int secondMethod(int value) {
        return value;

    }

    @Secured(value = 3,mode = "lazy")
    public int thirdMethod(int value) {
        return value;
    }

    @Secured(value = 4,mode = "lazy")
    private int fourthMethod(int value) {
        return value;
    }

}
