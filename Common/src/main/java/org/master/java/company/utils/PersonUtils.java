package org.master.java.company.utils;

import org.master.java.company.dto.Person;
import org.master.java.company.dto.PersonRecord;

import java.util.ArrayList;
import java.util.List;

public class PersonUtils {
    public static List<PersonRecord> getPersonRecordList(){
        List<PersonRecord> records = new ArrayList<>();
        PersonRecord rec = new PersonRecord("Jon", "Doe");
        records.add(rec);
        return records;
    }

    public static List<Person> getPersonList(){
        List<Person> records = new ArrayList<>();
        Person rec = new Person("Jon", "Doe");
        records.add(rec);
        return records;
    }
}
