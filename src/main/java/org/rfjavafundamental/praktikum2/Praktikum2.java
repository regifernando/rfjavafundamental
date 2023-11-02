package org.rfjavafundamental.praktikum2;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/2/2023 9:31 PM
@Last Modified 11/2/2023 9:31 PM
Version 1.0
*/


import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        boolean isActive = true;

        System.out.println("\u001B[1mInput : \u001B[0m");
        while (isActive) {
            try {
                int number = scanner.nextInt();
                total += number;
                count++;
            } catch (Exception e) {
                isActive = false;
            }
        }

        if (count > 0) {
            double rataRata = (double) total / count;
            System.out.println("\u001B[1mOuput : \u001B[0m" + "Rata-rata: " + rataRata);
        } else {
            System.out.println("There's no input.");
        }
    }
}