package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarManagement {
    private final List<Car> carList;

    public CarManagement() {
        carList = new ArrayList<>();
        carList.add(new Car("Volvo s90", 2015, "x001xx"));
        carList.add(new Car("Lada Vesta", 2020, "x002xx"));
        carList.add(new Car("Kia Rio", 2012, "x003xx"));
    }

    public void addCar(String carMake, int yearOfIssue, String registrationNumber) {
        for (Car car : carList) {
            if (car.getRegistrationNumber().equals(registrationNumber)) {
                System.out.println("Car with registration number " + registrationNumber + " already exists.");
                return;
            }
        }
        carList.add(new Car(carMake, yearOfIssue, registrationNumber));
        System.out.println("Car added successfully.");
        printList();
    }

    public void removeCar(String registrationNumber) {
        for (Car car : carList) {
            if (car.getRegistrationNumber().equals(registrationNumber)) {
                carList.remove(car);
                System.out.println("Car with registration number " + registrationNumber + " removed successfully.");
                printList();
                return;
            }
        }

        System.out.println("Car with registration number " + registrationNumber + " not found.");
    }

    public void removeAllCars() {
        carList.clear();
        System.out.println("All cars removed successfully.");
    }

    public void printList(){

        System.out.println("\n============= ALL CARS =============");
        for (Car car : carList) {
            System.out.println(car.getCarMake() + ", " + car.getYearOfIssue() + ", " + car.getRegistrationNumber());
        }
        System.out.println();
    }
}