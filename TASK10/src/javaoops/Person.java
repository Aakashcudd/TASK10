package javaoops;

public class Person {
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person person = new Person("MUTHU", 50);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());
}
    }
