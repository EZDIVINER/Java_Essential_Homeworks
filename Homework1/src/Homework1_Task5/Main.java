package Homework1_Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task5");

        Scanner in = new Scanner(System.in);

        System.out.println("Index - ");
        int index = in.nextInt();

        System.out.println("Country - ");
        String country = in.nextLine();

        System.out.println("City - ");
        String city = in.nextLine();

        System.out.println("Street - ");
        String street = in.nextLine();

        System.out.println("House - ");
        int house = in.nextInt();

        System.out.println("Apartment - ");
        int apartment = in.nextInt();

        Address address1 = new Address(index, country, city, street, house, apartment);

        int myIndex = address1.getIndex();
        String myCountry = address1.getCountry();
        String myCity = address1.getCity();
        String myStreet = address1.getStreet();
        int myHouse = address1.getHouse();
        int myApartment = address1.getApartment();

        System.out.println("Address: \n" + "Index - " + myIndex + "\n" + "Country - " + myCountry + "\n" + "City - " + myCity
                + "\n" + "Street - " + myStreet + "\n" + "House - " + myHouse + "\n" + "Apartment - " + myApartment);


    }
}
