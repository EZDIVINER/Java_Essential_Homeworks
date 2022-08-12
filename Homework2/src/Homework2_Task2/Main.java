package Homework2_Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1999);
        Car car2 = new Car(2012, "red");
        System.out.println("car year - "+car.year +","+ " color - " + car.color);
        System.out.println("car1 year - "+car1.year +","+ " color - " + car1.color);
        System.out.println("car2 year - "+car2.year +","+ " color - " + car2.color);
    }
}
