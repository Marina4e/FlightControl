package org.prog;

import java.util.Arrays;

public class Main {
    private static Object boardingPassengers;

    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();
        Plane plane1 = new Plane("Plane-1");
        Plane plane2 = new Plane("Plane-2");

        plane1.setCurrentPassenger("passenger5");
        System.out.println(plane1.getCurrentPassenger());
        passenger Bob = new passenger();
        passenger Nik = new passenger();
        passenger Santa = new passenger();
        passenger[] crossingPassengers = {Bob,Nik,Santa};

        FlightControl.boardingPassengers(Bob,1);
        FlightControl.boardingPassengers(Nik,2);
        FlightControl.boardingPassengers(Santa,3);
        
        takeSeat(boardingPassengers);
    }
    private static void takeSeat(Object boardingPassengers) {
    }
}

