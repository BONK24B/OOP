package HW6.Ex1;

public class NetSalary {
    private static double coeffitiency = 0.25;

    public static int calculateNetSalary(Employee emp) {
        int tax = (int) (emp.getSalary() * coeffitiency);//calculate in otherway
        return emp.getSalary() - tax;
    }
}
