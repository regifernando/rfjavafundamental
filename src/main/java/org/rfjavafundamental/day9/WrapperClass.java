package org.rfjavafundamental.day9;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/2/2023 7:52 PM
@Last Modified 11/2/2023 7:52 PM
Version 1.0
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        boolean isValid = true;
        Boolean isOk = true; // => wrapper class / object

        // "true" dan true
        String strX = "TrUE";
        //boolean isBoolean = Boolean.parseBoolean(strX);
        boolean isBoolean = "true".equalsIgnoreCase(strX);
        System.out.println(isBoolean);


        List<Integer> list = new ArrayList<>();

        // Parsing String to Primitive
        String anu = "18";
        int angka = Integer.parseInt(anu);
        System.out.println(angka);

        double angka1 = Double.parseDouble(anu);
        System.out.println(angka1);

        try {
            anu = "18.5";
            angka = Integer.parseInt(anu);
            System.out.println(angka);
        }catch (Exception e){
            e.printStackTrace();
        }

        // best practice ngoding
        // 1
        List<String> listStr = new ArrayList<>();
        listStr.add("A");
        listStr.add("B");
        listStr.add("C");

        // bagusnya dibuat 1 variable
        int listSize = listStr.size();// ini akan membuat performance lebih cepat!

        for(int i=0; i<listSize; i++){

        }

        // 2
        String strABC = "ABCDEFGHIJ";
        int intABC = strABC.length();
        char chM = 'x';
        for(int i = 0; i< intABC; i++){

        }
    }

    public static void testSoalPraktikum(){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        System.out.print("Masukkan angka : ");

        while (input.hasNextInt()) {
            int angka = input.nextInt();
            total += angka;
            count++;
        }
        if (count > 0) {
            double rataRata = (double) total / count;
            System.out.println("Rata-rata: " + rataRata);
        } else {
            System.out.println("There's no data!");
        }
    }
}
