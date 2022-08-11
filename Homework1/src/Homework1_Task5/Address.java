package Homework1_Task5;

public class Address {
    String index;
    String country;
    String city;
    String street;
    String house;
    String apartment;

    public Address(){

    }
    public Address(String index, String country, String city, String street, String house, String apartment){
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
    public String getIndex() {
        return index;
    }
    public String setIndex(String index){
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

    public String getHouse(){
        return house;
    }
    public String setHouse(String house){
        this.house = house;
        return house;
    }

    public String getApartment(){
        return apartment;
    }
    public void setApartment(String apartment){
        this.apartment = apartment;
    }

}
