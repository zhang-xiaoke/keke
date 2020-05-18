package com.nhy.person;

import com.nhy.transports.Aircraft;
import com.nhy.transports.Airship;
import com.nhy.transports.Automobile;
import com.nhy.transports.Bicycle;
import com.nhy.transports.HotAirBallon;
import com.nhy.transports.Hovercraft;
import com.nhy.transports.Motorcycle;
import com.nhy.transports.Ship;
import com.nhy.transports.Submarine;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/17 22:09
 * @version: v1.0
 * @modified By:
 */
public class Person {
    private  String p_Age;
    private  String p_Sex;
    private  String id;
    private  String p_Name;


    public Person(){

    }

    public Person(String p_Age, String p_Sex, String id, String p_Name) {
        this.p_Age = p_Age;
        this.p_Sex = p_Sex;
        this.id = id;
        this.p_Name = p_Name;
    }

    public String getP_Age() {
        return p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public String getId() {
        return id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Age(String p_Age) {
        this.p_Age = p_Age;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public void driveTransport(Aircraft aircraft){

    }
    public void driveTransport(Airship airship){

    }
    public void driveTransport(HotAirBallon hotAirBallon){

    }
    public void driveTransport(Automobile automobile){

    }
    public void driveTransport(Bicycle bicycle){

    }
    public void driveTransport(Hovercraft hovercraft){

    }
    public void driveTransport(Motorcycle motorcycle){

    }
    public void driveTransport(Submarine submarine){

    }
    public void driveTransport(Ship ship){

    }
}
