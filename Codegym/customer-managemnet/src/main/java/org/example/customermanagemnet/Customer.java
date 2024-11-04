package org.example.customermanagemnet;

public class Customer {
    private String name;
    private String dob;
    private String address;
    private String photo;

    public Customer(String name, String dob, String address, String photo) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoto() {
        return photo;
    }
}
