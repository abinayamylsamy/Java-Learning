package com.example;

public class InheritanceTruck extends InheritanceVehicleCommon {

    public static void main(String[] args) {

        InheritanceTruck itk = new InheritanceTruck();
        itk.vehicleStart();
        itk.vehicleStop();
    }

    public void loadCapacity() {
        System.out.println("load Capacity");
    }
}
