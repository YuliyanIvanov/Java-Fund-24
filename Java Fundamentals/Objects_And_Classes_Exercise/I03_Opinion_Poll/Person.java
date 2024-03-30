package Objects_And_Classes_Exercise.I03_Opinion_Poll;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }
}
