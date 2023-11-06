package org.rfjavafundamental.variouslogic;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/6/2023 7:10 PM
@Last Modified 11/6/2023 7:10 PM
Version 1.0
*/



import java.util.Scanner;

public class Palindrome {

    //Masam - masaM
    //Kakak - kakaK

    //0->4
    //1->3
    //2->2
    //3->1
    //4->0
    // var x = Masam;
    // var y = masaM;
    // compare x == y ? true -> palindrom , false -> bukan palindrom

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan kata palindrom yang ingin diproses : ");
        String strText = scn.nextLine();//Input text palindrom
        System.out.println("Length Inputan -> "+strText.length());
        String poli = "";
        StringBuilder strBuilder = new StringBuilder();
        String strTest ="";

        System.out.println(strText.length());
        //Kakak - kakaK <-- INPUTAN
        strBuilder.setLength(0);//Hapus seluruh isi strBuilder
        for(int i=strText.length();i>0;i--)
        {
            System.out.println(strText.substring(i-1, i)+" i = "+i);
            strTest = strText.substring(i-1, i);
			/*
			i = 5, strTest = k , strBuilder = k -> poli = k
			i = 4 , strTest = a , strBuilder = ka -> poli = ka
			i = 3 , strTest = k , strBuilder =  kak -> poli = kak
			i = 2 , strTest = a , strBuilder = kaka -> poli = kaka
			i = 1 , strTest = K , strBuilder = kakaK -> poli = kakaK
			 */
            poli = strBuilder.append(strTest).toString();
        }
        /*
         * 0-K
         * 1-a
         * 2-k
         * 3-a
         * 4-k
         *
         * 1-K
         * 2-a
         * 3-k
         * 4-a
         * 5-k
         */
        //Kakak - kakaK
        //0-1-2-3-4 - 4-3-2-1-0
        //TEST = TEST
        //JERUK = JERUK
        //KAKAK = KAKAK
        strBuilder.setLength(0);//Hapus seluruh isi strBuilder
        if(strText.equalsIgnoreCase(poli)){
            System.out.println("==== "+strText+" adalah Palindrome =====");
        }
        else
        {
            System.out.println("==== "+strText+" bukan Palindrome =====");
        }
    }
}
