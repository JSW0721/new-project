package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingPersonEx {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );
        //나이가 28세 이상인 사람들의 이름.
        people.stream().filter(p -> p.getAge() <= 28).map(Person::getName).toList();
        System.out.println(people);
    }

}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}