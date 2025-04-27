package org.master.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyClass {
    static void myStaticMethod(String s) {
        System.out.println("Static method: " + s);
    }

    void myInstanceMethod(String s) {
        System.out.println("Instance method: " + s);
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression
        names.forEach(name -> MyClass.myStaticMethod(name));

        // Using method reference
        names.forEach(MyClass::myStaticMethod);

        MyClass obj = new MyClass();

        // Using lambda expression
        names.forEach(name -> obj.myInstanceMethod(name));

        // Using method reference
        names.forEach(obj::myInstanceMethod);

        // Using method reference to constructor
        Consumer<String> createString = String::new;
        createString.accept("Hello");
    }
}
