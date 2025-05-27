import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted list:");
        list.forEach(System.out::println);
    }
}
