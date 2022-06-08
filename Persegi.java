/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan3A;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Persegi implements BangunDatar {
    int s ;
    Scanner input = new Scanner(System.in);
    
    @Override
    public double luas() {
        System.out.print("Input sisi : ");
        s = input.nextInt();
        
        int luas = s*s;
        System.out.println("Luas Persegi :"+luas);
        return luas;
    }

    @Override
    public double keliling() {
        System.out.print("Input sisi : ");
        s = input.nextInt();
        
        int keliling = 4*s;
        System.out.println("Luas Persegi :"+keliling);
    return keliling;
    }
    
}
