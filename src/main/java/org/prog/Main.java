package org.example;

public class Main {
    public static void main(String[] args) {
        Plane Plane1 = new Plane("BusinessClass", 3);
        Plane Plane2 = new Plane("VacationClass", 4);
        Plane1.fly("Shytomyr");
        Plane2.fly("Goverla");
        String[] passengers = new String[4];
        passengers[0] = "Nik";
        passengers[1] = "Kima";
        passengers[2] = "Sara";
        passengers[3] = "Bill";
        Plane1.setPassengers(passengers);
        for (int i = 0; i < passengers.length; i++){
            System.out.println("Index of '" + passengers[i] + "' is " + i);}}}



