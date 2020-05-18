package com.nhy.transports;

import java.util.Date;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:44
 * @version: v1.0
 * @modified By:
 */
    abstract class  Transport{
        private String ownership;
        private String GPSPosition;
        private String price;
        private Date   dateOfPurchase;
        private String id;
        //驾驶方法
        public  abstract  void  drivingMethod();
        //装载物品方法
        public  abstract  void  load();
        //维修方法
        public  abstract  void  maintain();
        //加油方法
        public  abstract  void  addGas();


    public Transport(){}
    public Transport(String ownership, String GPSPosition, String price, Date dateOfPurchase, String id) {
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

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
