/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan3A;

/**
 *
 * @author ASUS
 */
public class Limas extends Persegi {
    int tinggi;
    double volume;

    public double getVolume(){
        System.out.print("tinggi : ");
        tinggi = input.nextInt();
        System.out.print("sisi : " );
        s = input.nextInt();
        
        volume = 1.0/3.0*s*s*tinggi;
        System.out.println("Volume Limas : "+volume);
    return 0;
    }
}
