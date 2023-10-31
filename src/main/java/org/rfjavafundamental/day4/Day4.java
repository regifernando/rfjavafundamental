package org.rfjavafundamental.day4;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        double hasil = 75/8; // dominan data type ini akan menghasilkan int, tapi kalo 8.0 maka akan menghasilkan decimal.
        System.out.println(hasil);

        // gerbang logika
        // biner 0 & 1 => 1 = true, 0 = false
        System.out.println(5!=3); // true atau 1
        System.out.println(5==3); // false atau 0

        // and
        System.out.println();


        // xor
        System.out.println(true );

        // biner
        System.out.println(Integer.toBinaryString(50));
        // build in function -> fungsi yang sudah di sediakan oleh java / pengembang java
        // udf => user defined function -> fungsi yang di buat sendiri
        System.out.println("Biner 10 : " + Integer.toBinaryString(10));
        System.out.println("Biner 12 : " + Integer.toBinaryString(12));
        System.out.println(10 & 12);
        // 110010
        // 32168421
        // 32+16+2

        // String
        String strX = "Test";

        // tanda + untuk penggabungan string tidak di rekomendasikan
        // concat -> penggabungan string pake tanda + akan menjadi berat. lebih baik pake concat dll.
        System.out.println(strX.concat(" satu").concat(" dua"));

        // untuk penggabungan yang banyak lebih baik menggunakan StringBuilder untuk mengurangi pemakaian memory
        // tanda(+) alt+enter -> replace with string builder append
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(strX).append("satu").append("dua"));
        sb.setLength(0);// untuk mengembalikan memory
        System.out.println("Panjang String : ".concat(strX).length());
        // substring

        String strT = new String("Asdf"); // tidak di rekomendasikan
        String strY = "Asdf";
        String strZ = "asdf";
        System.out.println("Menggunakan == " + (strY == strT));
        System.out.println("Menggunakan equals "+strY.equals(strZ));
        System.out.println("Menggunakan equalsIgnoreCase "+strY.equalsIgnoreCase(strZ));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan Bilangan bulat :");
//        int intX = scanner.nextInt();
//        boolean cekBil = intX % 2 == 0 ? true : false;
//        System.out.println("apakah nilai "+intX+" adalah bilangan bulat ? " + ((cekBil == true) ? "benar" : "salah"));

        // tugas
        // 1
        System.out.println("Tessy".concat("Wahyuni".concat("Riwayati".concat("Hartati"))));

        // 2
        String str1 = "Tessy Wahyuni";

        String str2 = "Riwayati";

        //String str3 = str1 + str2 + Hartati;

        //3

        //4
        //String nama = "Sudarmadji";

        //System.out.println("m : " + nama.charAt(5));

        // 5
        String tahun = "1728";
        System.out.println("panjang : " + tahun.length() + "angka 8 berada pada index " + tahun.charAt(tahun.length()-1));

        // 8
        String profesi = "paranormal";
        System.out.println(profesi.charAt(5));

        // 9
        String nama = "Bolot Sulaiman";
        System.out.println(nama.substring(10,14));

        // 10

        String nama1 = "Sutarno";

        String nama2 = "sutarno";

        boolean persamaan = nama1.equals(nama2);

    }
}
