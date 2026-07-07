class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String position, double salary) {
        this.employeeId = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

public class EmployeeManagementSystem {

    Employee[] employees = new Employee[10];
    int count = 0;

    void addEmployee(Employee e) {
        employees[count++] = e;
    }

    void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i].name);
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    void traverseEmployees() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].employeeId + " "
                    + employees[i].name);
        }
    }

    public static void main(String[] args) {

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.addEmployee(new Employee(101, "Rahul", "Manager", 50000));
        ems.addEmployee(new Employee(102, "Priya", "Developer", 40000));

        ems.traverseEmployees();

        ems.searchEmployee(102);
    }
}