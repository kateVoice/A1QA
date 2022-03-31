package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpBase {
    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee emp) {
        list.add(emp);
    }

    public void deleteById(long id) {
        list.removeIf((Employee emp) -> (emp.getId() == id));
    }

    public void deleteByName(String name, String surName) {
        list.removeIf((Employee emp) ->  emp.getName().equals(name) && emp.getSurName().equals(surName));
    }

    public void writeToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        for (Employee elem : list) {
            pw.println(elem.toString());
        }
        pw.close();
    }

    public void loadFromFile(String filename) throws FileNotFoundException {
        String inputFileName = filename;
        Scanner scan = new Scanner(new FileReader(inputFileName));
        List<String> emp = new ArrayList<>();
        while (scan.hasNextLine()) {
            emp.add(scan.nextLine());
        }
        for (String elem : emp) {
            System.out.println("\nNew Employee: ");
            System.out.println(elem);
        }
    }
}
