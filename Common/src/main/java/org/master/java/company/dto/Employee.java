package org.master.java.company.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Employee {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private BigDecimal salary;

}
