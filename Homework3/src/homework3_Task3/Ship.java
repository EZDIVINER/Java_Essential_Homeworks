package homework3_Task3;

public class Ship extends Vehicle{
    int shipCountPass;
    String port;

    public Ship(int price, int speed, int year, int shipCountPass, String port){
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.shipCountPass = shipCountPass;
        this.port = port;
    }
    public Ship(){
        this(170000000,80, 1987,1000,"Panama");
    }
    public void showInfo() {
        System.out.println("Ship info " + "\nPrise - " + price + "\nSpeed - " + speed + "\nYear - " + year +
                "\nNumber of passengers - " + shipCountPass + "\nHome port - " + port);
        System.out.println(" ");
    }

}
