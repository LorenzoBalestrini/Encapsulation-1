package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

      House house = new House();
      Scanner scanner = new Scanner(System.in);

        System.out.println("Set the number of floors: ");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Set the address: ");
        house.setAddress(scanner.nextLine());

        System.out.println("Set the residents' names: ");
        house.setResidentNames(scanner.nextLine().split(","));

        String houseDetails = String.format("Number of floors: %d - Address: %s - Residents' names: %s", house.getFloorsNumber(), house.getAddress(), Arrays.toString(house.getResidentNames()));

        System.out.println(houseDetails);


        



    }

}
