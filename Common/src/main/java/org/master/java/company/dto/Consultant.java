package org.master.java.company.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Consultant extends Employee {
    private Company company;
}
