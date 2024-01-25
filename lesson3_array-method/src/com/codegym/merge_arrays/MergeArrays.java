package com.codegym.merge_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng 1 :");
        int N = sc.nextInt();
        int [] array1 = new int [N];

        for (int i = 0; i < N ; i++){
            System.out.print("Phần tử " + (i + 1) + ":");
            array1[i] = sc.nextInt();
        }

        System.out.println("Nhập số phần tử mảng 2 :");
        int M = sc.nextInt();
        int [] array2 = new int[M];
        for (int i = 0; i < M ; i++){
            System.out.print("Phần tử " + (i + 1) + ":");
            array2[i] = sc.nextInt();
        }

        int [] array3 = new int[N + M];

        for (int i = 0 ; i < array1.length ; i++) {
            array3 [i] = array1 [i];
        }
        for (int i = 0;i < array2.length ; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Mảng sao khi được gộp là :" +Arrays.toString(array3));
    }
}
