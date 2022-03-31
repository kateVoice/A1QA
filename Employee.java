package com.company;
import java.time.LocalDate;
import java.util.*;

public class Employee {

    protected enum Specialization {
        MANAGER,
        ENGINEER;
    };

    protected enum IsMarried {
        SINGLE,
        MARRIED;
    };

    private long id;
    private String name;
    private String surName;
    private Specialization spec;
    private IsMarried isMarr;
    private String position;
    private int age;
    private int careerStartYear;
    int actualWorkExperience;

    public Employee(long id, String name, String surName, Specialization spec, IsMarried isMarr, String position, int age, int careerStartYear, int actualWorkExperience) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.spec = spec;
        this.isMarr = isMarr;
        this.position = position;
        this.age = age;
        this.careerStartYear = careerStartYear;
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        this.actualWorkExperience = year - careerStartYear;
    }

    public long getId() {
        return id;
    }

    public Specialization getSpec() {
        return spec;
    }

    public IsMarried getIsMarr() {
        return isMarr;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

     public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getCareerStartYear() {
        return careerStartYear;
    }
    public int getActualWorkExperience() {
        return actualWorkExperience;
    }
}
