package homework3_Task3;

public class Plane extends Vehicle {
    int heightFly;
    int planCountPass;

    public Plane(int price, int speed, int year, int heightFly, int planCountPass){
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.heightFly = heightFly;
        this.planCountPass = planCountPass;
    }
    public Plane() {
        this(160000000, 607, 2013,10500, 450);
    }

    public void showInfo(){
        System.out.println("Plane info "+"\nPrise - "+ price+ "\nSpeed - "+ speed+ "\nYear - "+ year+
                "\nHeight fly - "+ heightFly+"\nNumber of passengers - "+ planCountPass );
        System.out.println(" ");
    }
}
