package Homework1_Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task2");
        Scanner in = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Введите длину первой стороны");
        rectangle.side1 = in.nextDouble();
        System.out.println("Введите длину второй стороны");
        rectangle.side2 = in.nextDouble();

        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator(rectangle.side1, rectangle.side2));
        System.out.println("Периметр прямоугольника : " + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));

    }
}
