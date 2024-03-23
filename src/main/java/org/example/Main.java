package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Practical task 1.8");

        CarManagement carManagement = new CarManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add new car");
            System.out.println("2. Remove car");
            System.out.println("3. Remove all cars");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter model: ");
                    String carName = scanner.nextLine();

                    System.out.print("Enter year: ");
                    String year = scanner.nextLine();

                    System.out.print("Enter registration number: ");
                    String regNumber = scanner.nextLine();

                    carManagement.addCar(carName, Integer.parseInt(year), regNumber);
                    break;
                case 2:
                    System.out.print("Enter registration number of the car to remove: ");
                    String regNum = scanner.nextLine();
                    carManagement.removeCar(regNum);
                    break;
                case 3:
                    carManagement.removeAllCars();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

