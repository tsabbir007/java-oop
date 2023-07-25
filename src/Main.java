public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Elon Mask", "Volvo", 1000, "Black");
        car1.printInfo();

        Car.company = "BMW";

        Car car2 = new Car("Zucker Burg", "Toyota", 800, "Red");
        car2.printInfo();

    }
}
