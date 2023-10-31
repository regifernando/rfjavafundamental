package org.rfjavafundamental.day6;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        // cara kerja looping
        //

        String strZ = "ini untuk di scan";
        for(int i =0; i<strZ.length(); i++){
            System.out.println(strZ.charAt(i));
        }
        // kalo gunakan for kita tau start nya kapan dan berhentinya kapan
        // kalo while tidak tahu kondisinya kapan akan berhenti
        // do while
        boolean isValid = true;
        int loop = 0;
        while (isValid){
            if(loop == 3){
                isValid = false;
            }
            loop++;
        }

        // looping ada for, while, do while
        // do while cocok untuk pengecekan atm
        boolean isGood = false;
        Scanner sc = new Scanner(System.in);
        String strInput = "";
        do{
            System.out.println("Masukkan kata");
            strInput = sc.nextLine();
            if(strInput.length()>5){
                isGood = false;
            }
        }while (isGood);

        // kalo kita buat method return list / bagaimana mau clear itu ?


        double maxHeapMemory = Runtime.getRuntime().maxMemory();
    }
}
