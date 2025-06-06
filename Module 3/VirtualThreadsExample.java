public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread!"));
        }
        // Small sleep to allow threads to complete before main thread ends
        Thread.sleep(3000);
    }
}
