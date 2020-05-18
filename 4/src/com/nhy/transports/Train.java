package com.nhy.transports;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:48
 * @version: v1.0
 * @modified By:
 */
abstract class Train extends  LandTransport {
    @Override
    public void drivingMethod(){
        System.out.println("Driving with railway rolling stock driving license");
    }
    public void load(){}
    public void maintain(){}
    public void addGas(){}
}
