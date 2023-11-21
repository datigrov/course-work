import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        java.util.Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = random.nextDouble() * 100_000 + 100_100;
            employees[i] = new Employee("Сотрудник " + i, salary, random.nextInt(2, 6));
        }
        printAllEmployees(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /*public static double getExpenses(Employee[] employees) {
        double expenses = 0;
        for (int i = 0; i < employees.length; i++) {

        }*/


}

