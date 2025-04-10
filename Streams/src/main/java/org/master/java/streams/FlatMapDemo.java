package org.master.java.streams;

import org.master.java.company.dto.Company;
import org.master.java.company.dto.Employee;
import org.master.java.company.utils.EmployeeUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        //Stream<Collection<Item>> —-> flatMap() —-> Stream<Item>
        FlatMapDemo obj = new FlatMapDemo();
        obj.demoFlatMapOne();
        obj.demoFlatMaRealLifeOne();
    }

    private void demoFlatMapOne(){

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        Stream<List<Integer>> streamListOfIntegers = Stream.of(list1, list2, list3);
        Stream<Integer> integerStream = convertStreamOfListOfIntegersToStreamOfIntegers(streamListOfIntegers);
        // Print the flattened elements
        integerStream.forEach(System.out::println);
    }

    private Stream<Integer> convertStreamOfListOfIntegersToStreamOfIntegers(Stream<List<Integer>> stream) {
        // Use flatMap() to flatten the lists into a single stream of elements
        Stream<Integer> flatMappedStream = stream.flatMap(List::stream);
        return flatMappedStream;
    }

    private void demoFlatMaRealLifeOne(){

        List<Employee> listOfEmployees = EmployeeUtils.getListOfEmployees();

        Stream<Company> allEmployeesPastCompanies = getAllPastCompaniesOfAllEmployees(listOfEmployees);
        // Print the flattened elements
        allEmployeesPastCompanies.forEach(company -> System.out.println(company.getName()));
    }

    private Stream<Company> getAllPastCompaniesOfAllEmployees(List<Employee> listOfEmployees) {
        // Use flatMap() to flatten the lists into a single stream of elements
        Stream<Company> flatMappedStream = listOfEmployees.stream().flatMap(employee -> employee.getPastCompanies().stream());
        return flatMappedStream;
    }

    private List<Company> getAllPastCompaniesOfAllEmployeesUnique(List<Employee> listOfEmployees) {
        // Use flatMap() to flatten the lists into a single stream of elements
        Stream<Company> flatMappedStream = listOfEmployees.stream().flatMap(employee -> employee.getPastCompanies().stream());
        return flatMappedStream.distinct().collect(Collectors.toList());
    }
}
