package org.master.java.functional.myfunctional;


@FunctionalInterface
public interface MyFunctional<I> {

    //This one can have many implementations
    //Initial 3 are
    // 1) when the message is of type String I want to print "Hello:"+ message
    // 2) when the message is of type Integer I want to print "I want "+ message + " dollars."
    // 3) when the message is of type BigDecimal I want to print "I have "+ message + " dollars in my pocket."

    void saySomething(I message);
}
