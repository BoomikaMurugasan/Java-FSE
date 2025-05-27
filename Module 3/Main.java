class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2020;
        car.displayDetails();
    }
}
