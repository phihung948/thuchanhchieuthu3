/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author doduo
 */
public class lab2bai2 {
    
public static void main(String[] args){
      
        Scanner x = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap so phan tu cua mang: ");
        int n = x.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        //Xu?t s? nguyên t?
        XuatSoNguyenTo(arr);
    }

    static void XuatSoNguyenTo(int[] arr) {
        System.out.println("");
        System.out.println("So nguyen to: ");
        for (int i = 0; i < arr.length; i++) {
            if (SoNguyenTo(arr[i]) != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    static int SoNguyenTo(int n) {
        if (n < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return n;
        }
        return 0;
    }

}
