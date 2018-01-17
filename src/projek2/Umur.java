/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Umur {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Sila masukkan umur anda: ");
        int umur=input.nextInt();
        
        if (umur<=45){
            System.out.println("Anda Masih muda dan cantik");
        }
        else{
            System.out.println("Anda sudah tua dan perlukan rehat");
        }
    }
    
}
