package org.master.java.company.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Employee implements Comparable{
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private BigDecimal salary;

    @Override
    public int compareTo(Object o) {
        return getFirstName().compareTo(((Employee)o).getFirstName());
    }
}
