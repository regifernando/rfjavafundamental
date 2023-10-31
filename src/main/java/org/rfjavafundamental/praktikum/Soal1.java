package org.rfjavafundamental.praktikum;
/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 10/31/2023 8:18 PM
@Last Modified 10/31/2023 8:18 PM
Version 1.0
*/


import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String word = scanner.nextLine();

        int totalAscii = countAscii(word);


        //String boldItalicOrangeText = "\u001B[1m\u001B[3m\u001B[38;5;208m";

        //String resetFormatting = "\u001B[0m";

        //System.out.println("Output dari input " + boldItalicOrangeText + word + resetFormatting + " adalah " + boldItalicOrangeText + totalAscii + resetFormatting);

        System.out.println("Output : " + totalAscii);
    }

    public static int countAscii(String word) {
        int totalAscii = 0;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (Character.isUpperCase(character) || Character.isDigit(character) || !Character.isLetterOrDigit(character)) {
                int ascii = (int) character;
                totalAscii += ascii;
                //System.out.println("char : " + character + " ascii : " + ascii);
            }
        }
        return totalAscii;
    }
}
