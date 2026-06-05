class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    double calculatePay() {
        return contractAmount;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Ariba", 1, "SWE", 50000);
        Employee e2 = new PartTimeEmployee("Upoma", 2, "IT", 200, 20);
        Employee e3 = new ContractEmployee("Samia", 3, "HR", "ProjectABC", 35000);

        System.out.println("Full Time Pay:" + e1.calculatePay());
        System.out.println("Part Time Pay:" + e2.calculatePay());
        System.out.println("Contract Pay:" + e3.calculatePay());
    }
}
