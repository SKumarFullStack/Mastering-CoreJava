package org.master.java.company.utils;

import org.master.java.company.dto.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
    public static List<Employee> getListOfEmployees(){
        List<Employee> employees = new ArrayList<>();
        Employee.EmployeeBuilder builder = Employee.builder()
                .id(1)
                .firstName("Arun")
                .middleName("K")
                .lastName("Naik")
                .salary(new BigDecimal(1000.50));

        employees.add(builder
                .id(2)
                .firstName("Aruna")
                .lastName("Kumari")
                .salary(new BigDecimal(2000.50))
                .build());
        employees.add(builder
                .id(3)
                .firstName("Jaya")
                .lastName("Bhaduri")
                .salary(new BigDecimal(1500.50))
                .build());
        employees.add(builder
                .id(4)
                .firstName("Rekha")
                .lastName("Kumari")
                .salary(new BigDecimal(1008.50))
                .build());
        employees.add(builder
                .id(5)
                .firstName("Mina")
                .lastName("Kumari")
                .salary(new BigDecimal(7000.50))
                .build());
        employees.add(builder
                .id(6)
                .firstName("Aruna")
                .lastName("Irini")
                .salary(new BigDecimal(4000.50))
                .build());
        employees.add(builder
                .id(7)
                .firstName("Amit")
                .lastName("Kumar")
                .salary(new BigDecimal(1030.50))
                .build());
        employees.add(builder
                .id(8)
                .firstName("Madhuri")
                .lastName("Dikshit")
                .salary(new BigDecimal(6000.50))
                .build());
        employees.add(builder
                .id(9)
                .firstName("Karishma")
                .lastName("Kapoor")
                .salary(new BigDecimal(1900.50))
                .build());
        employees.add(builder
                .id(10)
                .firstName("Karina")
                .lastName("Kapoor")
                .salary(new BigDecimal(1070.50))
                .build());
        employees.add(builder
                .id(11)
                .firstName("Alia")
                .lastName("Bhatt")
                .salary(new BigDecimal(3900.50))
                .build());
        employees.add(builder
                .id(12)
                .firstName("Ranbir")
                .lastName("Kapur")
                .salary(new BigDecimal(2700.50))
                .build());


        return employees;
    }
}
