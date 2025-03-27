package org.master.java.streams;

import org.master.java.company.dto.Business;
import org.master.java.company.dto.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsDemo {

    public static void main(String[] args) {

        System.out.println("demoComplex:" + demoComplex());
        System.out.println("demoReduce:" + demoReduce ());

        /* Use streams with immutable objects: The Stream API works best with immutable objects.
         * Using immutable objects ensures that the state of the stream is not modified during processing,
         * which can lead to more predictable behavior and better code readability.
         **/
        System.out.println("demoMap:" + demoMap ());

        System.out.println("demoFilterWithEvenNumbersOnlyList:" + demoFilterWithEvenNumbersOnlyList ());

    }

    /* Use reduce to
    * Use streams with immutable objects: The Stream API works best with immutable objects.
    * Using immutable objects ensures that the state of the stream is not modified during processing,
    * which can lead to more predictable behavior and better code readability.
    **/
    private static Integer demoReduce (){
        var list = Arrays.asList(1, 2, 3, 4, 5);
        var sum = list.parallelStream().reduce(0, Integer::sum);
        return sum;
    }

    private static List<String> demoMap (){
        var listStr = Arrays.asList("apple", "banana", "cherry");
        var result = listStr.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return result;
    }
    private static List<Integer> demoFilterWithEvenNumbersOnlyList () {
        var list = Arrays.asList(1, 2, 3, 4, 5, 88, 97);
        var filteredList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        return filteredList;
    }

   /* private static List<Integer> demoFilterWithEvenNumbersOnlyList (List<Integer> inputList, int maxItems) {
        inputList.stream()
                .map(i-> {

                }).collect(Collectors.toList());


        var filteredList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        return filteredList;
    }*/

    private static void demoTerminalOperationsForEachOrCollectOrReduce(){
        var list = Arrays.asList(1, 2, 3, 4, 5, 88, 97);

        //Use of forEach
        list.stream().forEach(i -> System.out.println(i));

        //Use of Collect
        var filteredList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());


        //Use of reduce
        var sum = list.parallelStream().reduce(0, Integer::sum);
    }


    private static String demoComplex(){
        Employee.EmployeeBuilder builder = Employee.builder();
        List<Business> businesses = new ArrayList<>();
        Business amzn =  new Business("Amazon", List.of(builder.firstName("Shri").build(),builder.firstName("SKM").build(), builder.firstName("Kumar").build()));
        businesses.add(amzn);
        Business oracle =  new Business("Oracle", List.of(builder.firstName("Amit").build(), builder.firstName("Garg").build()));
        businesses.add(oracle);
        Business microsoft =  new Business("Microsoft", List.of(builder.firstName("Micro").build(), builder.firstName("Soft").build()));
        businesses.add(microsoft);

        String names = businesses.stream()
                .filter(b-> b.getBusinessName().startsWith("A"))
                .flatMap(b -> b.getEmployees().stream())
                .sorted()
                .filter(e-> e.getFirstName().startsWith("S"))
                .map(Employee::getFirstName)
                .collect(Collectors.joining("#"));

        System.out.println(names);
        return names;

    }

}
