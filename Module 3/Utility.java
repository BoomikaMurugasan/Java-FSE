package com.utils;

public class Utility {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
module com.utils {
    exports com.utils;
}
module com.greetings {
    requires com.utils;
}
