/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_02;
import javax.swing.JOptionPane;
public class Exception_1 {
    public static void main(String[] args){
        int n;
        try{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap so nguyen:",""));
        }
        catch(java.lang.NumberFormatException e1){
            System.out.println(e1.toString());
        }
        finally{
            System.out.println("Have good fun");
        }
    }
}
