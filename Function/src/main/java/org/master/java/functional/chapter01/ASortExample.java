package org.master.java.functional.chapter01;

import org.master.java.company.dto.Employee;
import org.master.java.company.utils.EmployeeUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ASortExample {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtils.getListOfEmployees();
        sortByFirstNameAndPrintEmployees(employees);
        System.out.println("#################################");
        sortByLastNameAndPrintEmployeesFunctional(employees);

    }

    private static void sortByLastNameAndPrintEmployeesFunctional(List<Employee> employees) {
        Collections.sort(employees, (n1, n2) -> n1.getLastName().compareTo(n2.getLastName()));
        employees.stream().forEach(System.out::println);
    }

    private static void sortByFirstNameAndPrintEmployees(List<Employee> employees) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee n1, Employee n2) {
                return n1.getFirstName().compareTo(n2.getFirstName());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
