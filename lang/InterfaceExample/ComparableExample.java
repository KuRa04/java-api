package lang.InterfaceExample;

import java.util.Arrays;

public class ComparableExample implements Comparable<ComparableExample> {
    private String name;
    private int age;

    public ComparableExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(ComparableExample other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "ComparableExample{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        ComparableExample[] comparableExamples = {
                new ComparableExample("Alice", 30),
                new ComparableExample("Bob", 25),
                new ComparableExample("Charlie", 35)
        };

        System.out.println(comparableExamples[0].compareTo(comparableExamples[1]));

        Arrays.sort(comparableExamples);

        for (ComparableExample person : comparableExamples) {
            System.out.println(person);
        }
    }
}