public class Employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();
        System.out.println("Manager's salary: " + manager.calculateSalary());
        System.out.println("Programmer's salary: " + programmer.calculateSalary());
    }

    public double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {
    public double calculateSalary() {
        return 10000;
    }
}

class Programmer extends Employee {
    public double calculateSalary() {
        return 8000;
    }
}

class Employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();
        System.out.println("Manager's salary: " + manager.calculateSalary());
        System.out.println("Programmer's salary: " + programmer.calculateSalary());
    }

    public double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {
    public double calculateSalary() {
        return 10000;
    }
}

class Programmer extends Employee {
    public double calculateSalary() {
        return 8000;
    }
}
### 