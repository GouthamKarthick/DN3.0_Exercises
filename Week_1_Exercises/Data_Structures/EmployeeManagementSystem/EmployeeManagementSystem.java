package EmployeeManagementSystem;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Array is full, cannot add more employees.");
            return;
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);
        ems.addEmployee(new Employee("E1", "Alice", "Manager", 90000));
        ems.addEmployee(new Employee("E2", "Bob", "Developer", 80000));
        ems.addEmployee(new Employee("E3", "Charlie", "Analyst", 70000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee E2:");
        Employee e = ems.searchEmployee("E2");
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee E003:");
        ems.deleteEmployee("E3");
        ems.traverseEmployees();
    }
}

