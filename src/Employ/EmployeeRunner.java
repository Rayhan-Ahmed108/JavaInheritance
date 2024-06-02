package Employ;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Siam",8000);
        employee.setName("David");
        employee.setBaseSalary(50000);
        System.out.println(employee.getBaseSalary());
    }
}
