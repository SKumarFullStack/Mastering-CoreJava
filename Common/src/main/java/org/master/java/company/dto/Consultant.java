package org.master.java.company.dto;

import lombok.Data;

@Data
public class Consultant extends Employee {
    private Company company;
}
