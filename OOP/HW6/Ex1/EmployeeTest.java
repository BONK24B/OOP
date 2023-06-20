package HW6.Ex1;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Andrej", LocalDate.of(1999, 8, 7), 3500);

        System.out.println(NetSalary.calculateNetSalary(emp));
    }
}
