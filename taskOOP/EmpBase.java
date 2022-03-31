package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class EmpBase {
    private List<Employee> list = new ArrayList<>();


    public void addEmployee (Employee emp) {
        list.add(emp);
    }

    public void delete(long id, String name, String surName) {
        list.removeIf( (Employee emp) -> (emp.getId()==id && emp.getName().equals(name)) && (emp.getSurName().equals(surName)));
    }
    public void writeToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        for (Employee elem : list) {
            pw.print(elem.getId() + ", " + elem.getName()+ ", " +elem.getSurName() + ", "+elem.getSpec() + ", "
                    + elem.getIsMarr()+ ", " + elem.getPosition()+ ", " + elem.getAge() + ", " + elem.getCareerStartYear() + ", "
                    + elem.getActualWorkExperience() +
                    + elem.actualWorkExperience);
        }
        pw.close();
    }

    public void loadFromFile(String filename) throws FileNotFoundException {
        String inputFileName = filename;
        Scanner scan = new Scanner(new FileReader(inputFileName));
        List<String> emp = new ArrayList<>();
        System.out.println("\nNew Employee: ");
        while (scan.hasNextLine()) {
            emp.add(scan.nextLine());
        }
        for (String elem : emp) {
            System.out.println(elem);
        }
    }
}
