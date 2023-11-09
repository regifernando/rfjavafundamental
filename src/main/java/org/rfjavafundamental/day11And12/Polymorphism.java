package org.rfjavafundamental.day11And12;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/7/2023 7:46 PM
@Last Modified 11/7/2023 7:46 PM
Version 1.0
*/


public class Polymorphism {
    public static void main(String[] args) {
        // OverLoading
        // Aturan Method Overloading
        // Nama Method harus sama
        // Parameter harus berbeda
        // Return boleh sama, juga boleh berbeda
        Calculation calculation = new Calculation(); // => Overloading

        // Overiding
        Animals h = new Animals();
        Animals c = new Cat();
        h.gerak();
        c.gerak();
    }
}

class Calculation{
    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String args[]){
        Calculation obj=new Calculation();
        obj.sum(10,10,10);
        obj.sum(20,20);
    }
}



class Animals {
    public void gerak() {
        System.out.println("Hewan bisa bergerak");
    }
}

class Cat extends Animals {
    public void gerak() {
        System.out.println("Kucing berjalan");
    }
}
