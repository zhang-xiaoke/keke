package com.nhy.transports;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:49
 * @version: v1.0
 * @modified By:
 */
abstract class Submarine extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod(){
        System.out.println("You can't drive a submarine into the sea");
    }
    public void load(){}
    public void maintain(){}
    public void addGas(){}
}
