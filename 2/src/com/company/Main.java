package com.company;

import com.company.person.Person;
import com.company.transport.Aircraft;
import com.company.transport.Automobile;
import com.company.transport.Ship;

public class Main {

    public static void main(String[] args) {
    //write your code here
        Person tom = new Person();
        tom.setId("201902160");

        Aircraft tomAircraft = new Aircraft();
        tomAircraft.setTransportId("tomAircraft");
        tomAircraft.setTransportBrand("Boeing");

        Automobile tomAutomobile = new Automobile();
        tomAutomobile.setTransportId("tomAutomobile");
        tomAutomobile.setTransportBrand("Benz");

        Ship tomShip = new Ship();
        tomShip.setTransportId("tomShip");
        tomShip.setTransportBrand("Larson");

        tom.drivingTransport(tomAircraft);
        System.out.println("\n");
        tom.drivingTransport(tomAutomobile);
        System.out.println("\n");
        tom.drivingTransport(tomShip);
        System.out.println("\n");
    }
}
