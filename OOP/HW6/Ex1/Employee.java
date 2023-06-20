package HW6.Ex1;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate dob;
    private int baseSalary;

    public Employee(String name, LocalDate dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public int getSalary(){
        return baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
