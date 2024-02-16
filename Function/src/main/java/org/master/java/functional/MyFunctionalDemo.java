package org.master.java.functional;

import java.math.BigDecimal;

public class MyFunctionalDemo {

    public static void main(String[] args) {
        MyFunctionalImpl client = new MyFunctionalImpl();
        client.saySomethingDemoWithString("Ganesh");
        client.saySomethingDemoWithInteger(Integer.valueOf(4));
        client.saySomethingDemoWithBigDecimal(BigDecimal.valueOf(2000l));

    }
}
