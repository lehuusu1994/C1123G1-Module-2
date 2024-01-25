package com.codegym.find_min_element_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindMinElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng :");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0 ; i < size ; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " : ");
            arr [i] = sc.nextInt();
        }
        System.out.println("Giá trị nhỏ nhất trong mảng :" + minValue(arr));
    }
    public  static  int minValue (int [] arr){
        int min = arr[0];
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i] ;
        }
        return min;
    }
}
