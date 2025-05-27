import java.util.concurrent.*;
import java.util.*;

public class ExecutorServiceCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> "Task 1 completed";
        Callable<String> task2 = () -> "Task 2 completed";
        Callable<String> task3 = () -> "Task 3 completed";

        List<Callable<String>> tasks = List.of(task1, task2, task3);
        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
