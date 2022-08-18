package Homework2_Task2;

public class Car {
    int year;
    String color;
//    Конструктор по умолчанию
    public Car(){

    }
//    Конструктор с одним параметром
    public Car(int year){
        this.year = year;

    }
//    Конструктор с 2 параметрами
    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }
}
