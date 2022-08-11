package Homework1_Task5;

public class Address {
    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    public Address(){

    }
    public Address(int index, String country, String city, String street, int house, int apartment){
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
    public int getIndex() {
        return index;
    }
    public int setIndex(int index){
        this.index = index;
        return index;
    }

    public String getCountry(){
        return country;
    }
    public String setCountry(String country) {
        this.country = country;
        return country;
    }

    public String getCity(){
        return city;
    }
    public String setCity(String city) {
        this.city = city;
        return city;
    }

    public String getStreet(){
        return street;
    }
    public String setStreet(String street) {
        this.street = street;
        return street;
    }

    public int getHouse(){
        return house;
    }
    public int setHouse(int house){
        this.house = house;
        return house;
    }

    public int getApartment(){
        return apartment;
    }
    public void setApartment(int apartment){
        this.apartment = apartment;
    }

}
