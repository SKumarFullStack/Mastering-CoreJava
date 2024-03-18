package org.master.java.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List list = new ArrayList<Date>();
        List<Date> dates = new ArrayList<>(); // unchecked warning
        List<Date> dates2 = new ArrayList<Date>();
        //List<Date> otherdates = new ArrayList<String>(); // Compile-time Error!
    }
}
