package com.company.transport;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/4/7 15:15
 * @version: v1.0
 * @modified By:
 */
public class Transport {
    private String ownership;
    private String GPSPosition;
    private String price;
    private String dateOfPurchase;
    private String id;

    public void drivingMethod ()
    {System.out.println("Transport drivingMethod");}
    public Transport(){

    }

    public Transport(String ownership, String GPSPosition, String price, String dateOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.id = id;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

