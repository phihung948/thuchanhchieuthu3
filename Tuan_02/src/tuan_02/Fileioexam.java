/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Hung
 */
public class Fileioexam {
    public static void main(String args[]) throws IOException
    {
        //File duoc tao luu cung vi tri voi project chương trinh
       try (
               //Tao moi 1 file abc.txt de ghi du lieu (output)
               FileOutputStream os =  new FileOutputStream("abc.txt")){
               //File duoc tao luu cung vi tri file chuong trinh
               String s = "Chao cac ban den voi chuong trinh doc xuat file";
               for(int i = 0; i < s.length(); i++)
                   os.write(s.charAt(i));
       } 
       try (// Mo 1 file abc.txt de doc vao chuong trinh (intput)
               FileInputStream is = new FileInputStream("abc.txt")) {
               int ibyts = is.available();
               System.out.println("File co tat ca " + ibyts + "ky tu");
               byte ibuf[] = new byte[ibyts];
               int byrd = is.read(ibuf, 0, ibyts);
               System.out.println("Tong so ky tu duoc doc la " + byrd);
               System.out.println("Chuoi ky tu la " + new String(ibuf));
       }
       //Xoa file neu co
       File fl = new File("abc.txt");
       fl.delete();
               
    }
    
}
