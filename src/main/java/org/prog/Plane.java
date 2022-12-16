package org.prog;

import java.util.Arrays;

public class Plane {
    public String serialNumber;
    public String passenger;
    public String CurrentPassenger;
    public int passengerSeat;
    public Plane (String sN) {
        serialNumber = sN;
        passengerSeat = 0;}
    public  void passengerTakesSeat(passenger[] otherPassengers) {
        for (int i = 0;i < otherPassengers.length; i++){
            if (passengerSeat != 0 && otherPassengers[i].passengerSeat
                    != 0)
                System.out.println("Two passengers per one seat!");
            else{
                System.out.println("Seats are distributed according to the" +
                        "number of passengers correct!");
            }
        }
    }
public void setCurrentPassenger(String newPassenger) {
    switch (newPassenger) {
        case ("passenger1"):
            passengerSeat = 1;
            CurrentPassenger = newPassenger;
            break;
        case ("passenger2"):
            passengerSeat = 2;
            CurrentPassenger = newPassenger;
            break;
        case ("passenger3"):
            passengerSeat = 3;
            CurrentPassenger = newPassenger;
            break;
        default:
            System.out.println("seats is over");
    }
}
public String getCurrentPassenger() {
        return CurrentPassenger;
    }
}
