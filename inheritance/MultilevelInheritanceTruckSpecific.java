package com.example.inheritance;

public class MultilevelInheritanceTruckSpecific extends InheritanceTruck {
    public static void main(String[] args) {

        MultilevelInheritanceTruckSpecific itks = new MultilevelInheritanceTruckSpecific();
        itks.loadCapacity();
        itks.vehicleStart();
        itks.vehicleStop();
    }
}
