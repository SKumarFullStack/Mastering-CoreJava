package org.master.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsDemo {

    public static void main(String[] args) {
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

}
