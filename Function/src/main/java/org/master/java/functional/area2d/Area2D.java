package org.master.java.functional.area2d;

@FunctionalInterface
public interface Area2D<BigDecimal,Optional> {
    BigDecimal area(BigDecimal firstParam, Optional optSecondParam);
}
