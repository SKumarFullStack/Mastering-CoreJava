package org.master.java.functional;

import java.math.BigDecimal;

public class MyFunctionalImpl {

    public void saySomethingDemoWithString(String message){
        MyFunctional<String> stringImpl = (i) -> System.out.println("Hello:"+ i);
        doIt(stringImpl, message);

    }

    public void saySomethingDemoWithInteger(Integer message){
        MyFunctional<Integer> integerImpl = (i) -> System.out.println("I want "+ i + " dollars.");
        doIt(integerImpl, message);
    }

    public void saySomethingDemoWithBigDecimal(BigDecimal message){
        MyFunctional<BigDecimal> integerImpl = (i) -> System.out.println("I have "+ i + " dollars in my pocket.");
        doIt(integerImpl, message);
    }

    private void doIt(MyFunctional function, Object message){
        function.saySomething(message);
    }

}
