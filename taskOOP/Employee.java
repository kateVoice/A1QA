package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    protected enum Specialization {
        MANAGER,
        ENGINEER;
    }

    ;

    protected enum IsMarried {
        SINGLE,
        MARRIED;
    }

    ;

    private final long id;
    private final String name;
    private final String surName;
    private final Specialization spec;
    private final IsMarried isMarr;
    private final String position;
    private final int age;
    private final int careerStartYear;
    private final int actualWorkExperience;

    public Employee(long id, String name, String surName, Specialization spec, IsMarried isMarr, String position, int age, int careerStartYear) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && careerStartYear == employee.careerStartYear && actualWorkExperience == employee.actualWorkExperience && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && spec == employee.spec && isMarr == employee.isMarr && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, spec, isMarr, position, age, careerStartYear, actualWorkExperience);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", spec=" + spec +
                ", isMarr=" + isMarr +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", careerStartYear=" + careerStartYear +
                ", actualWorkExperience=" + actualWorkExperience +
                '}';
    }
}
