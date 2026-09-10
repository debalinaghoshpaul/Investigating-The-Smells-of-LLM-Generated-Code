// Employee class
class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        // Implement bonus calculation logic here
        return 0.0;
    }

    public String generatePerformanceReport() {
        // Implement performance report generation logic here
        return "";
    }
}

// Manager class
class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void manageProjects() {
        // Implement project management logic here
    }
}

// Developer class
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void developSoftware() {
        // Implement software development logic here
    }
}

// Programmer class
class Programmer extends Developer {
    private String specialization;

    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String specialization) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void writeCode() {
        // Implement code writing logic here
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects and test the functionality of the classes
        Manager manager = new Manager("John Doe", "123 Main St", 5000.0, "Manager", 5);
        Developer developer = new Developer("Jane Smith", "456 Elm St", 4000.0, "Developer", "Java");
        Programmer programmer = new Programmer("Mike Johnson", "789 Oak St", 3000.0, "Programmer", "Python", "Web Development");

        System.out.println("Manager: " + manager.getName());
        System.out.println("Developer: " + developer.getName());
        System.out.println("Programmer: " + programmer.getName());

        manager.manageProjects();
        developer.developSoftware();
        programmer.writeCode();
    }
}