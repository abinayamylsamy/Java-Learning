package com.example;

public class InheritanceVehicleCommon {

    public static void main(String[] args) {

        InheritanceVehicleCommon vc = new InheritanceVehicleCommon();
        vc.vehicleStart();
        vc.vehicleStop();
    }

    public void vehicleStart() {
        System.out.println("Vehicle Started");

    }

    public void vehicleStop() {
        System.out.println("Vehicle Stoped");
    }
}