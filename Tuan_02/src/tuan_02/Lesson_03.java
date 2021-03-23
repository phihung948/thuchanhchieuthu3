/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan_02;

import java.util.Scanner;

/**
 *
 * @author doduo
 */
public class Lesson_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner x = new Scanner(System.in);
        System.out.print("Nhap M: ");
        int m = x.nextInt();
        System.out.print("Nhap N: ");
        int n = x.nextInt();

        //Mang random
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //phạm vi [0,50]
                arr[i][j] = (int) (Math.random() * 50);
            }
        }
        //Xuat ma tran
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        //tong dòng
        System.out.print("Dong so: ");
        int d = x.nextInt();
        int Tong = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == d) {
                    Tong += arr[i][j];
                }
            }
        }
        System.out.println("Tong dong " + d + " la: " + Tong);
    }
}