package org.master.java.company.dto;

import lombok.Data;

import java.util.List;

@Data
public class Business{
    List<Employee> employees;

    String businessName;

    public Business(String businessName, List<Employee> employees) {
        this.employees = employees;
        this.businessName = businessName;
    }



}
