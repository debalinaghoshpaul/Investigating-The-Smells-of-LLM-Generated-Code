import java.util.*;

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

public class SortObjectsByAttribute {

    public static void main(String[] args) {
        // Create a list of persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Mary", 25));
        persons.add(new Person("Bob", 40));
        persons.add(new Person("Alice", 35));

        // Sort the list by name
        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Print the sorted list
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        // Sort the list by age
        Collections.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());

        // Print the sorted list
        for (Person person : persons) {
            System.out.println(person.getAge());
        }
    }
}
