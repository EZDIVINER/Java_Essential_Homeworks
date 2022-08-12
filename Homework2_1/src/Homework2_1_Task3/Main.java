package Homework2_1_Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1923);
        Car car3 = new Car(2003, 231.5);
        Car car4 = new Car(2018, 340.2, 2250);
        Car car5 = new Car(2012, 260.12, 1920, "Green");
        Car newCar2 = new Car(Integer.parseInt(userIn("car2 year")));
        Car newCar3 = new Car(Integer.parseInt(userIn("car3 year")), Float.parseFloat(userIn("car3 Speed")));

        System.out.println("Cars list");
        System.out.println("Car2: year - " + car2.year);
        System.out.println("Car3: year - " + car3.year + "," + " speed -  " +car3.speed);
        System.out.println("Car4: weight  - " + car4.weight);
        System.out.println("Car5: year - " + car5.year + "," + " speed  - " + car5.speed + "," +
                " weight  - " + car4.weight + "," + " speed - " + car5.color);
        System.out.println("Users cars");
        System.out.println("New Car2: year - " + newCar2.year);
        System.out.println("New Car3: year - " + newCar3.year + "," + " speed = " + newCar3.speed);

    }
    static String userIn(String name){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " +name );
        return in.nextLine();
    }
}

