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

        double hasil = 75 / 8;
        System.out.println(hasil);

        //int count = 2 = 2;
        System.out.println("hasil 2 = 2  : " );

        int angka1 = 5;
        angka1--;
        int angka2 = 5;
        angka2 /= angka2;
        int angka3 = 5;
        angka3 += angka3;
        int angka4 = 5;
        angka4++;
//
//        boolean cek = 2==2;
//        boolean cek1 = 2>2;
//        boolean cek2 = 2==-2;
//        boolean cek3 = 2!='2';
//
//        System.out.print("Tessy");
//
//        System.out.print("Wahyuni");
//
//        System.out.print("Riwayati");
//
//        System.out.print("Hartati");

        double satu = 8.3;
        double dua = 4.4;
        int jumlEntry = (int)(satu + dua);
        System.out.println("Hasil : " + jumlEntry);

        int perhitungan = 10+2/(1*2);
        System.out.println("Hasil Perhitungan adalah : " + perhitungan);

//        int x = 20;
//
//        int c = x;
//
//        x = x + 1;
//
//        c = c + x;
//        System.out.println(c);

        char yChar = 'Y';

        int yInt = (int) yChar;

        int x = 10 & 12;

        System.out.println(x);
        String strSambung = "8"+3;
        System.out.println(strSambung);

        String strThird = "Welcome";

        System.out.println(strThird.substring(4));

        for(int ab = 1; ab< 5; ab++){
            System.out.print(ab + ",");
        }

        System.out.println();
        int [][] angkaKu = {{1,2,3,4},{5,6,7}};

        int xx= angkaKu[1][2];

        System.out.println("xx : " +xx);


        String istri[] = new String[4];

        System.out.println(istri.length);

        int[] arr = {6, 3, 1, 2};
        System.out.println(arr[3]);

        System.out.println("Result Question 8 : " + question8());
        System.out.println("Result Question 9 : " + question9());

    }

    static int question8() {
        int[] array = {2, 7, 3, 5, 8, 9};

        int kuncen = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > kuncen)

                kuncen = array[i];

        }

        System.out.print(kuncen);
        return kuncen;
    }

    static int question9(){
        int [] tahun = new int [7];

        tahun[0] = 2004;

        tahun[1] = 2006;

        System.out.println(tahun[0] + " " + tahun[1] + " " + tahun[7]);
        return tahun[0] + tahun[1] + tahun[7];
    }

}