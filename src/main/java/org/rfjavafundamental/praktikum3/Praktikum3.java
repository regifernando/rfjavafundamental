package org.rfjavafundamental.praktikum3;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/9/2023 12:26 PM
@Last Modified 11/9/2023 12:26 PM
Version 1.0
*/


import java.util.Random;

public class Praktikum3 {
    public static void main(String[] args) {
        int minLength = 12;
        int maxLength = 25;
        StringBuilder result = new StringBuilder();

        String characters = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        Random random = new Random();
        int length = random.nextInt(minLength, maxLength+1);
        char firstChar = getRandomChar(characters);

        result.append(Character.toUpperCase(firstChar));
        byte flagging = (byte) (vowels.contains(Character.toString(firstChar).toLowerCase()) ? 1 : 2);

        for(int i = 1 ; i<=length; i++){
            if(i<=7){
                if(flagging == 1){
                    result.append(getRandomChar(consonants));
                    flagging = 2;
                }
                else{
                    result.append(getRandomChar(vowels));
                    flagging = 1;
                }
            }else {
                result.append(getRandomChar(characters));
            }
        }
        System.out.println(result);
    }

    public static char getRandomChar(String characters) {
        Random random = new Random();
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
}