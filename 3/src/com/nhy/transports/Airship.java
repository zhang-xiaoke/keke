package com.nhy.transports;

import java.util.Date;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:06
 * @version: v1.0
 * @modified By:
 */
public class Airship extends AirTransport {
    private  String ownership;
    private  String GPSPosition;
    private  String price;
    private Date dateOfPurchase;
    private  String id;


    public Airship(String ownership, String GPSPosition, String price, Date dateOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.id = id;
    }
    public Airship() {

    }
}
