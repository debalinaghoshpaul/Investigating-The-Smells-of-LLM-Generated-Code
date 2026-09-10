import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortObjectsByAttribute {
    public static void main(String[] args) {
        // Create a list of objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));

        // Sort the list based on age using a lambda expression
        people.sort(Comparator.comparingInt(Person::getAge));

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}