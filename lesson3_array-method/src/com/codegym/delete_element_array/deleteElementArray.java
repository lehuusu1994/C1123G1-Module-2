package com.codegym.delete_element_array;

import java.util.Arrays;
import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        // Nhập số lượng của mảng :
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng :");
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }
        // Nhập phần tử cần xóa :
        System.out.println("Nhập phần tử cần xóa :");
        int x = sc.nextInt();
        // Tìm vị trí phn tử cần xóa :

        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Phần tử không tồn tại");
        } else {
            // xóa phần tử mảng
            int[] newArray = new int[N - 1];
            int newIndex = 0;

            for (int i = 0; i < N; i++) {
                if (i != index_del) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }

            }

            // Bước 7: In ra mảng mới
            System.out.print("Mảng sau khi xoá phần tử " + x + ": ");
            System.out.println(Arrays.toString(newArray));

        }
    }
}
