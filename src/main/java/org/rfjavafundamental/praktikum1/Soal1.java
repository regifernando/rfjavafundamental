package org.rfjavafundamental.praktikum1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String input = scanner.nextLine();

        int totalAscii = hitungAscii(input);

        System.out.println("Output dari input " +input+ " adalah " + totalAscii);
    }

    public static int hitungAscii(String kata) {
        int totalAscii = 0;

        for (int i = 0; i < kata.length(); i++) {
            char character = kata.charAt(i);

            // Hanya menambahkan nilai ASCII jika karakter adalah huruf atau angka
            if (Character.isUpperCase(character) || Character.isDigit(character) || !Character.isLetterOrDigit(character)) {
                int ascii = (int) character;
                totalAscii += ascii;
            }
        }
        return totalAscii;
    }
}
