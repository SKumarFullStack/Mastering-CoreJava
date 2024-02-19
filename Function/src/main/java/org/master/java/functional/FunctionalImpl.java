package org.master.java.functional;

import java.util.function.BiConsumer;

public class FunctionalImpl {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> rectangleArea = (length, breadth) -> {
            var area = length * breadth;
            System.out.println("Area of the rectangle is :" + area);
        };
        executeFunction(rectangleArea, Integer.valueOf(4), Integer.valueOf(40));

        BiConsumer<String, String> concat = (prefix, suffix) -> {
            System.out.println("Concat value with separator | ===>" + prefix + "|" + suffix);
        };
        executeFunction(concat, "Prefix" , "Suffix");
        executeFunction(concat, "Yes" , "No");
        executeFunction(concat, "TRUE" , "FALSE");
    }


    private static void executeFunction(BiConsumer function, Object firstParam, Object secondParam) {
        function.accept(firstParam, secondParam);
    }

}
