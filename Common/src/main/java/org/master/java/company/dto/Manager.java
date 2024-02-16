package org.master.java.company.dto;

import lombok.Data;

import java.util.List;
@Data
public class Manager extends Employee{
    private List<Employee> employeeList;
}
