package org.master.java.generics;

import java.util.List;

class GenericMethodExample {
    // Generic method
    //<Type> returnType methodName(Type argument) {
        // method body
    //}
    public <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public <T extends Number> double sumOfList(List<T> list) {
        double sum = 0;
        for (T num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        GenericMethodExample obj = new GenericMethodExample();

        // Integer array
        Integer[] intArray = {10, 20, 30, 40, 50};
        obj.displayArray(intArray);

        // String array
        String[] strArray = {"apple", "banana", "cherry"};
        obj.displayArray(strArray);
    }
}
