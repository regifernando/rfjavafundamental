package org.rfjavafundamental.day13;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/8/2023 7:30 PM
@Last Modified 11/8/2023 7:30 PM
Version 1.0
*/


import java.util.HashMap;

public class Collection {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Regi",29);
        people.put("Astri",30);
        people.put("Joel", 4);
        people.put("Joel", 5);
        people.put("Joel", 4);
        for (Object o : people.keySet()){
            System.out.println(people.get(o));
        }
    }

    public static void genericCollection(){
        Kuliah kul = new Kuliah();
        kul.setId(1L);
        kul.setPengajar("Admin");
        kul.setMataPelajaran("Networking");

        Kuliah[] kuliahArr = new Kuliah[2];
        kuliahArr[0] = new Kuliah(); // set alamat di memory
        kuliahArr[0].setId(1L);
        kuliahArr[0].setMataPelajaran("Programming");
        kuliahArr[0].setPengajar("Regi Fernando Najoan");

        kuliahArr[1] = new Kuliah(); // set alamat di memory
        kuliahArr[1].setId(2L);
        kuliahArr[1].setMataPelajaran("OOP");
        kuliahArr[1].setPengajar("Regi Fernando Najoan");
        System.out.println("ID \t Mata Pelajaran \t Pengajar");
        for(int i=0; i< kuliahArr.length; i++){
            System.out.print(kuliahArr[i].getId()+"\t");
            System.out.print(kuliahArr[i].getMataPelajaran()+"\t\t");
            System.out.print(kuliahArr[i].getPengajar());
            System.out.println();
        }
        kuliahArr = null; // membersihkan data di memory

    }
}
