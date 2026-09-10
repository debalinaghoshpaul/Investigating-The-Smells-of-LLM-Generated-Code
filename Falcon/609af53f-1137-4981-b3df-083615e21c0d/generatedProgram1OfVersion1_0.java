public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printNameAndAge() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        person1.setName("John");
        person1.setAge(30);

        person2.setName("Jane");
        person2.setAge(25);

        person1.printNameAndAge();
        person2.printNameAndAge();
    }
}

