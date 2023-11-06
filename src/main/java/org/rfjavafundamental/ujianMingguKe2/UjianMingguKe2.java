package org.rfjavafundamental.ujianMingguKe2;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/4/2023 7:52 PM
@Last Modified 11/4/2023 7:52 PM
Version 1.0
*/


import java.util.Random;
import java.util.Scanner;

public class UjianMingguKe2 {
    public static void main(String[] args) {
        soal26();
    }

    static void soal26(){
        int intLoop = 0;
        for(int i =0; i<10; i++){
            intLoop++;
            for(int j = 0; j< 20; j++){
                intLoop++;
            }
        }
        System.out.println(intLoop);
    }
    static void soal25(){
        int intLoop = 0;
        boolean isGood = true;
        do{
            intLoop++;
            continue;
        }while (!isGood);
        System.out.println(intLoop);
    }
    static void soal21And22(){
        String strThird = "Welcome";
        //System.out.println(strThird.substring(1,5)); // 21
        System.out.println(strThird.substring(6,7)); // 22
    }
    static void soal17(){
        int intLoop = 0;
        boolean isGood = true;
        do{
            intLoop++;
        }while (!isGood);
        System.out.println(isGood);
    }
    static void soal16(){
        String a = "TEA";
        String b = "TOE";

        System.out.println(b.compareTo(a));
    }

    static void soal15(){
        int intLoop = 0;
        for(int i=0; i<10; i++){
            intLoop ++;
            for(int j = 0; j < 20; j++){
                if(j==10){
                    break;
                }
                intLoop++;
            }
        }
        System.out.println(intLoop);
    }

    static void soal14(){
        int intLoop = 0;
        for(int i = 0; i<5; i++){
            intLoop++;
            continue;
        }
        //System.out.println(i);
    }
    static void soal12(){
        int intLoop = 0;
        boolean isGood = true;
        do {
            intLoop++;
        }while (!isGood);
        System.out.println(isGood);
    }

    static void soal11(){
        String strThird = "Welcome";
        System.out.println(strThird.substring(4));
    }
    static void soal9(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan kata yang ingin di proses : ");
        String strText = "Katak";//scn.next(); // input text
        String poli = "";
        StringBuilder strBuilder = new StringBuilder();
        String strTest = "";

        strBuilder.setLength(0); // hapus seluruh isi builder
        for(int i = strBuilder.length(); i> 0; i--){
            System.out.println(strText.substring(i-1,i)+" i = "+i);
            strTest = strText.substring(i-1,i);
            poli = strBuilder.append(strTest).toString();
        }

        strBuilder.setLength(0);
        if(strText.equalsIgnoreCase(poli)){
            System.out.println("Merupakan Anagram");
        }
        else{
            System.out.println("Bukan Anagram");
        }
    }
    static void soal7(){
        int intLoop = 0;
        for(int i = 0; i<5; i++){
            intLoop++;
            if(intLoop > 5){
                break;
            }
        }
        System.out.println(intLoop);
    }
    static void soal6(){
        int intLoop = 0;
        for(int i = 0; i<5; i++){
            if(intLoop < 5){
                continue;
            }
            intLoop++;
        }
        System.out.println(intLoop);
    }

    static void soal4(){
        int intChoose = 3;
        intChoose = 2;
        switch (intChoose){
            case 1:
                System.out.println("Ini satu");
                break;
            case 2:
                System.out.println("Ini dua");
                break;
            default:
                System.out.println("Selain satu dan dua");
                break;
        }
    }
    static void soal3(){
        Random ran = new Random();
        for(int i = 0; i< 10; i++){
            System.out.println("Random Number " +i+ "->" + ran.nextInt(70,100));
        }
    }

    static void soal2(){
        int intLoop = 0;
        for(int i = 0; i< 10; i++){
            for(int j = 0; j< 20; j++){
                if(j==10){
                    continue;
                }
                intLoop ++;
            }
        }
        System.out.println(intLoop);
    }
    static void soal1(){
        if((5<3) && ( 7 != 2)){
            System.out.println("OK");
        } else if ((4 == 4) || (3 > 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
