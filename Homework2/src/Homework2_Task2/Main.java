package Homework2_Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1999);
        Car car2 = new Car(2012, "red");
        System.out.println("car year - "+car.year+"car color - "+ car.color);
        System.out.println("ca1 year - "+car1.year+"ca1 color - "+ car1.color);
        System.out.println("ca2 year - "+car2.year+"ca2 color - "+ car2.color);
    }
}
