package org.rfjavafundamental;

import org.rfjavafundamental.array.ArrayJC;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Variable Casting
        // Implicit & Eksplisit
        // tipe data short ke int
        // short 32767 => int 32767

        // Implicit mengubah data tipe data kecil ke tipe data yang lebih besar
        // char memiliki 2 value pertama value sebagai character dan kedua value sebagai angka
        char chA = 'A';
        int intA = chA; // akan mendapatkan value code ascii
        // kalo casting dari kecil ke besar tidak ada masalah
        // apakah bisa number yang dikirim ke java dijadikan string ?

        //Long Lng = 922337203685;
        short shA = 32767;
        byte bytA = (byte) shA;

        // tipe data short, byte, dll berpengaruh di memory ga ya ? ya berpengaruh!
        // misalnya umur => byte/short
        // kecuali money harus pake decimal karna banyak.

        // pasing by reference
        ArrayJC arrayJC = new ArrayJC();
        System.out.println(arrayJC);
        ArrayJC arrayJC1 = arrayJC;
        System.out.println(arrayJC1);
        arrayJC = new ArrayJC();//
        System.out.println(arrayJC);

        // cara untuk manage garbage collector adalah di clear. misalnya list.clear() atau di instansiasi baru ;


        double myVal = (5+(10%5)) - ((3*4)/6);
        int a = 1200;
        System.out.println("nilai a adalah : " + a);
        a = a +1;
        System.out.println("a = a + 1 => " + a);
        a +=1;
        System.out.println("a += 1 => " + a);

        // debug f8
        // f9 next pinned debug

    }
}