package Homework2_2_Task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car(){
        this.year = 2021;
        this.speed = 304.2;
        this.weight = 15233;
        this.color = "Red";
    }
    public Car(int year){
        this.year = year;
        this.speed = 304.2;
        this.weight = 15233;
        this.color = "Red";
    }
    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 1233;
        this.color = "Green";
    }
    public Car (int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Red";
    }
    public Car (int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
