package com.company.transport;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/4/7 15:15
 * @version: v1.0
 * @modified By:
 */
public class Submarine extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod(){
        System.out.println("You can't drive a submarine into the sea");
    }
}
