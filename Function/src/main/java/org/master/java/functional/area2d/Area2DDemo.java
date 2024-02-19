package org.master.java.functional.area2d;

import java.math.BigDecimal;

public class Area2DDemo {
    public static void main(String[] args) {
        Area2DVariousImplementations impl = new Area2DVariousImplementations();
        double param1  = 2.2;
        double param2  = 4.7;
        double param3  = 14.7;
        double param4  = 50.2;
        impl.areaOfRectangle(BigDecimal.valueOf(param1), BigDecimal.valueOf(param2));
        impl.areaOfRectangle(BigDecimal.valueOf(param1), BigDecimal.valueOf(param3));
        impl.areaOfSquare(BigDecimal.valueOf(param1));
        impl.areaOfCircle(BigDecimal.valueOf(param1));
        impl.areaOfCircle(BigDecimal.valueOf(param4));
    }
}
