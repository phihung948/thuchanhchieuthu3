/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan_02;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author doduo
 */
public class Fileioexam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        //tao doi tuong file
        String fileName = "";
        File f = new File("");
        fileName = f.getAbsolutePath() + "\\src\\data.txt";
        f= new File(fileName);
        if (f.exists())
        {
            System.out.println("File da ton tai");
            System.exit(0);
        }
        //Ghi du lieu vao file
        PrintWriter pw = new PrintWriter(f);
        pw.print("Coppy Duong Thanh Phet  - ");
        pw.println(2015);
        pw.print("http://thayphet.net");
        System.out.println("Da ghi file xong");
        //doc file
        Scanner inp = new Scanner(f);
        while (inp.hasNext())
        {
            String ten = inp.next();
            System.out.println(ten + " ");
            int maso = inp.nextInt();
            System.out.println(maso);
        }
    }
    
}