package org.rfjavafundamental.day11And12;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/6/2023 9:18 PM
@Last Modified 11/6/2023 9:18 PM
Version 1.0
*/


public class Encapsulation {
    //
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("John", 20);

        // Mengakses data dengan metode akses
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Umur: " + mahasiswa1.getUmur());

        // Mengubah data dengan metode mutator
        mahasiswa1.setNama("Doe");
        mahasiswa1.setUmur(21);

        System.out.println("Nama (setelah perubahan): " + mahasiswa1.getNama());
        System.out.println("Umur (setelah perubahan): " + mahasiswa1.getUmur());
    }
}

class Mahasiswa {
    private String nama;
    private int umur;

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode akses untuk nama
    public String getNama() {
        return nama;
    }

    // Metode mutator untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode akses untuk umur
    public int getUmur() {
        return umur;
    }

    // Metode mutator untuk umur
    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        }
    }
}
