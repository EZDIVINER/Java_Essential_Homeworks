package Homework2_2_Task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1323);
        Car car2_1 = new Car(2011);
        Car car3 = new Car(2031, 402.6);
        Car car3_1 = new Car(2022, 235.4);
        Car car4 = new Car(2012, 350.1, 1231);
        Car car5 = new Car(2018, 210.23, 1452,"Pink");

        System.out.println("Car1: year - "+car1.year+", speed - "+car1.speed+", weight - "+car1.weight+", color - "+car1.color);
        System.out.println("Car2: year - "+car2.year+", speed - "+car2.speed+", weight - "+car2.weight+", color - "+car2.color);
        System.out.println("Car2_1: year - "+car2_1.year+", speed - "+car2_1.speed+", weight - "+car2_1.weight+", color - "+car2_1.color);
        System.out.println("Car3: year - "+car3.year+", speed - "+car3.speed+", weight - "+car3.weight+", color - "+car3.color);
        System.out.println("Car3_1: year - "+car3_1.year+", speed - "+car3_1.speed+", weight - "+car3_1.weight+", color - "+car3_1.color);
        System.out.println("Car4: year - "+car4.year+", speed - "+car4.speed+", weight - "+car4.weight+", color - "+car4.color);
        System.out.println("Car5: year - "+car5.year+", speed - "+car5.speed+", weight - "+car5.weight+", color - "+car5.color);
    }
}
