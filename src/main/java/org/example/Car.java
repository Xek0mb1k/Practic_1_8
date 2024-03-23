package org.example;

public class Car {


    private final String carMake;
    private final int yearOfIssue;
    private final String registrationNumber;

    public Car(String carMake, int yearOfIssue, String registrationNumber) {
        this.carMake = carMake;
        this.yearOfIssue = yearOfIssue;
        this.registrationNumber = registrationNumber;

    }

    public String getCarMake() {
        return carMake;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


}
