package com.nhy.transports;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:47
 * @version: v1.0
 * @modified By:
 */
abstract class Airship extends AirTransport {
    @Override
    public void drivingMethod(){
        System.out.println("Driving with airworthiness certificate");
    }
    public void load(){}
    public void maintain(){}
    public void addGas(){}
}
