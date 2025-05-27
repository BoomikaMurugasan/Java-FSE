import java.util.List;
import java.util.stream.Collectors;

public class RecordsExample {
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        System.out.println("People aged 18 or older:");
        List<Person> adults = people.stream()
            .filter(p -> p.age() >= 18)
            .collect(Collectors.toList());

        adults.forEach(System.out::println);
    }
}
