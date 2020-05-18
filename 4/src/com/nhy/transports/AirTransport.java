package com.nhy.transports;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:45
 * @version: v1.0
 * @modified By:
 */
abstract class AirTransport extends Transport {
    @Override
    public void drivingMethod () {System.out.println("Driving with flight licence");}
    public void load(){}
    public void maintain(){}
    public void addGas(){}

}
