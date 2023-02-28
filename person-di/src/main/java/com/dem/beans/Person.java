package com.dem.beans;

public class Person {
    private String name;
    private Address address;

    public Person( Address address) {

        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String personInfo(){
        return  name+" "+address.getStreetName();
    }

}
