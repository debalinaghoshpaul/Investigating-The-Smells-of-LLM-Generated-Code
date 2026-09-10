// Person.java
// Base class Person with getFirstName() and getLastName() methods

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


// Employee.java
// Subclass Employee that extends Person and adds getEmployeeId() and overrides getLastName() methods

public class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")"; // Override the getLastName() method to include the employee's job title
    }
}


// Main.java
// Main class to test the Person and Employee classes

public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        // Create an Employee object
        Employee employee = new Employee("Jane", "Smith", 12345, "Software Engineer");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " (Employee ID: " + employee.getEmployeeId() + ")");
    }
}
