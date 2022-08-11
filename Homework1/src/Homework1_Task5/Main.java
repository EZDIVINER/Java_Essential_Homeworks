package Homework1_Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task5");
        
        Address address1 = new Address(userIn("Index"), userIn("Country"), userIn("City"),
                userIn("Street"), userIn("House"), userIn("Apartment"));
        String myIndex = address1.getIndex();
        String myCountry = address1.getCountry();
        String myCity = address1.getCity();
        String myStreet = address1.getStreet();
        String myHouse = address1.getHouse();
        String myApartment = address1.getApartment();

        System.out.println("Address: \n" + "Index - " + myIndex + "\n" + "Country - " + myCountry + "\n" + "City - " + myCity
                + "\n" + "Street - " + myStreet + "\n" + "House - " + myHouse + "\n" + "Apartment - " + myApartment);
    }
    static String userIn(String name){
        Scanner in = new Scanner(System.in);
        System.out.println (name + " - ");
        return in.nextLine();
    }
}
