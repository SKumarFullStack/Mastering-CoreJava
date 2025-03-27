package org.master.java.functional.area2d;

import org.master.java.functional.area2d.Area2D;

import java.math.BigDecimal;
import java.util.Optional;

public class Area2DVariousImplementations {
    BigDecimal executeFunctional(Area2D<BigDecimal,Optional<BigDecimal>> function, BigDecimal firstParam, Optional<BigDecimal> optSecondParam){
        return function.area(firstParam,optSecondParam);
    }

    BigDecimal areaOfRectangle(BigDecimal length, BigDecimal breadth){
        Area2D<BigDecimal,Optional<BigDecimal>> function = (l,b) -> l.multiply(b.get());
        BigDecimal area =  executeFunctional(function, length, Optional.of(breadth));
        System.out.println("Area of rectangle with length :"+ length + " unit and breadth:"+breadth + " unit is :"+ area + " units");
        return area;
    }

    BigDecimal areaOfSquare(BigDecimal side){
        Area2D<BigDecimal,Optional<BigDecimal>> function = (l,b) -> l.multiply(l);
        BigDecimal area =   executeFunctional(function, side, Optional.empty());
        System.out.println("Area of square with side :"+ side + " unit is :"+ area + " units");
        return area;
    }

    BigDecimal areaOfCircle(BigDecimal radius){
        Area2D<BigDecimal,Optional<BigDecimal>> function = (r,empty) -> r.multiply(BigDecimal.valueOf(Math.PI * 2));
        BigDecimal area =    executeFunctional(function, radius, Optional.empty());
        System.out.println("Area of circle with radius :"+ radius + " unit is :"+ area + " units");
        return area;
    }
}
