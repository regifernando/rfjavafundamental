package org.rfjavafundamental.day11And12;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/6/2023 7:17 PM
@Last Modified 11/6/2023 7:17 PM
Version 1.0
*/


import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String[] args) {
        // OOP adalah teknik pemograman yang menggunakan object. Sebuah object merepresentasikan segala sesuatu
        // yang ada di dunia nya yang dapat diidentifikasi secara jelas.
        // contoh siswa, meja, lingkaran, tabungan, dll. sebuah object memiliki state dan behaviour


        // contoh private class
        //PrivateClass privateClass = new PrivateClass();


        // Print IFunction
        IFunction functionOne = new FuncOneImpl();
        IFunction functionTwo = new FuncTwoImpl();

        functionOne.cetak();

        List<String> list = new ArrayList<>();
    }

    public static void encapsulation(){
        // Tujuan encapsulation diantaranya:
        // Untuk meningkatkan keamanan data;
        // Agar lebih mudah dalam mengontrol atribut dan dan method;
        // Class bisa kita buat menjadi read-only dan write-only;

    }
}

class PrivateClass{
    // cara buat private class adalah constructor dibuat private

    private PrivateClass(){}
    System system;
}