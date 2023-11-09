package org.rfjavafundamental.example;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/8/2023 9:35 AM
@Last Modified 11/8/2023 9:35 AM
Version 1.0
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HitungHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        scanner.close();

        // Membuat kamus (Map) untuk menyimpan jumlah kemunculan setiap huruf
        Map<Character, Integer> letterCount = new HashMap<>();

        // Mengubah kalimat menjadi huruf kecil agar tidak ada perbedaan antara huruf besar dan kecil
        kalimat = kalimat.toLowerCase();

        // Iterasi melalui setiap karakter dalam kalimat
        for (char karakter : kalimat.toCharArray()) {
            // Periksa apakah karakter adalah huruf
            if (Character.isLetter(karakter)) {
                // Periksa apakah karakter sudah ada dalam kamus letterCount
                if (letterCount.containsKey(karakter)) {
                    // Jika sudah ada, tambahkan 1 ke jumlahnya
                    letterCount.put(karakter, letterCount.get(karakter) + 1);
                } else {
                    // Jika belum ada, inisialisasi dengan 1
                    letterCount.put(karakter, 1);
                }
            }
        }

        int jumlah = 0;
        char tempHuruf = '\0';
        int index = 0;
        int tempIndex = 0;
        // Mencetak hasil perhitungan
        for (char huruf = 'a'; huruf <= 'z'; huruf++) {
            jumlah = letterCount.getOrDefault(huruf, 0);
            index +=1;
            System.out.println(index +" = "+huruf + ": " + jumlah);
            if(jumlah != 0){
                tempIndex += index;
                tempHuruf += huruf;
            }
        }
        System.out.println("total index adalah : " + tempIndex + " dan huruf:" + tempHuruf);

    }
}
