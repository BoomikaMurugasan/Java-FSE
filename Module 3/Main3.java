class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main3{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("John", 25);
        p1.display();
        p2.display();
    }
}
