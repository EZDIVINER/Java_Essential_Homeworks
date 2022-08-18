package Homework2_2_Task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;


    public Car(){
        this(1999, 202.3, 2000,"Black");
    }
    
    public Car(int year){
        this(year, 202.3, 2000,"Black");
    }
    public Car(int year, double speed){
        this(year, speed, 1500, "Green");
    }
    public Car (int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Yellow";
    }
    public Car (int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
