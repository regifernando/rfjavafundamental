package org.rfjavafundamental.day8;

/*
IntelliJ IDEA 2023.2.3 (Ultimate Edition)
Build #IU-232.10072.27, built on October 11, 2023
@Author Admin a.k.a. Regi Fernando
Java Developer
Created on 11/1/2023 7:08 PM
@Last Modified 11/1/2023 7:08 PM
Version 1.0
*/


import java.util.Objects;

public class Array {
    public static void main(String[] args) {
        // Array Berfungsi untuk menyimpan kumpulan(list) data yang sejenis
        Object[] data= new Object[7];
        data[0] = "Hello, World";
        data[1] = 123;
        data[2] = true;
        data[3] = 123.22;
        data[4] = 123.1f;
        data[5] = false;
        data[6] = 7;
        for(var dat : data){
            if (dat instanceof String) {
                System.out.println("String: " + dat);
            } else if (dat instanceof Integer) {
                System.out.println("Integer: " + dat);
            } else if (dat instanceof Boolean) {
                System.out.println("Boolean: " + dat);
            } else if(dat instanceof Double){
                System.out.println("Double: " + dat);
            } else if(dat instanceof Float){
                System.out.println("Float: " + dat);
            } else {
                System.out.println("Unknown data type: " + dat);
            }
        }


        // array 2 dimensi
        int [][] array2dimensi = new int[2][2];
        array2dimensi[0][0] = 1;
        array2dimensi[0][1] = 4;
        array2dimensi[1][0] = 7;
        array2dimensi[1][1] = 5;

        for (int i=0; i< array2dimensi.length; i++){
            for (int j = 0; j<array2dimensi[i].length; j++){
                System.out.print(array2dimensi[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("==============");
        // array multi dimensi
        int [][] myArr = {{1,2,3,4},{5,6},{7,8,9}};// harus cara ini kalau arraynya tdk simetris
        for (int i=0;i < myArr.length; i++){
            for(int j=0; j < myArr[i].length; j++){
                System.out.print(myArr[i][j] + "|");
            }
            System.out.println();
        }

        // mencari nilai terbesar dan ditaruh paling belakang
        int[] selectionSortArray = {17, 13, 40, 24, 33, 5};

        System.out.println("Original array:");
        for (int num : selectionSortArray) {
            System.out.print(num + " ");
        }

        selectionSort(selectionSortArray);

        System.out.println("\nArray after Selection Sort:");
        for (int num : selectionSortArray) {
            System.out.print(num + " ");
        }

        // binary search
        // data akan di urutkan
        // diambil nilai tengah
        // di cek apakah nilai yang di search lebih besar atau lebih kecil dari nilai median
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i+1 ; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
