package homework3_Task3;

public class Car extends Vehicle{

    public Car(int price, int speed, int year){
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public Car(){
        this(400000,350,2022);
    }
    public void showInfo(){
        System.out.println("Car info "+"\nPrise - "+ price+ "\nSpeed - "+ speed+ "\nYear - "+ year);
        System.out.println(" ");
    }

}
