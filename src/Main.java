import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        java.util.Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = 100_000 +  50_100 * random.nextDouble();
            employees[i] = new Employee("Сотрудник " + i, salary, random.nextInt(2, 6));
        }
        printAllEmployees(employees);
        System.out.println();
        System.out.println(getMaxSalaryPerson(employees));
        System.out.println(getMinSalaryPerson(employees));
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getExpenses(Employee[] employees) {
        double expenses = 0;
        for (Employee employee : employees) {
            expenses += employee.getSalary();
        }
        return expenses;
    }

    public static Employee getMinSalaryPerson (Employee[] employees){
        Employee minEmployeeSalary = null;
        for (Employee employee : employees) {
            if (minEmployeeSalary == null || minEmployeeSalary.getSalary() > employee.getSalary())
                minEmployeeSalary = employee;
        }
        return minEmployeeSalary;
    }

    public static Employee getMaxSalaryPerson(Employee[] employees) {
        Employee maxEmployeeSalary = null;
        for (Employee employee : employees) {
            if (maxEmployeeSalary == null || maxEmployeeSalary.getSalary() < employee.getSalary())
                maxEmployeeSalary = employee;
        }
        return maxEmployeeSalary;
    }
}

