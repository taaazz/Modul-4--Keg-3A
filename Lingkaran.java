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
public class Lingkaran implements BangunDatar {
    int jari;
    double phi=3.14;
    Scanner input = new Scanner(System.in);

    @Override
    public double luas() {
        System.out.print("Input Jari - Jari : ");
        jari = input.nextInt();
        
        double luas = phi * jari * jari;
        System.out.println("Luas Lingkaran adalah : " + luas);
    return luas;
    }

    @Override
    public double keliling() {
        System.out.print("Input Jari - Jari : ");
        jari = input.nextInt();
        
        double keliling = 2 * phi * jari;
        System.out.println("Keliling Lingkaran adalah : " + keliling);
        
    return keliling;
    }
}
