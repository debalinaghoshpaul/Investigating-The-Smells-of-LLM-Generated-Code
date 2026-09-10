public class Person {
    private String name;
    private int age;
    private String country;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        // Create an instance of Person class
        Person person = new Person();

        // Set the values using setter methods
        person.setName("John Doe");
        person.setAge(30);
        person.setCountry("USA");

        // Display the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}
