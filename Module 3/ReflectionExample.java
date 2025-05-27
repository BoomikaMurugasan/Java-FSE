import java.lang.reflect.Method;

public class ReflectionExample {
    public void sayHello() {
        System.out.println("Hello via Reflection!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionExample");
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method m = cls.getMethod("sayHello");
        m.invoke(obj);
    }
}
