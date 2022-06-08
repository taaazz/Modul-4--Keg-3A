 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan3A;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran {
    int tinggi;
    double volume;

    public double getVolume(){
        System.out.print("tinggi :");
        tinggi = input.nextInt();
        System.out.print("jari jari :");
        jari = input.nextInt();
        
        volume = phi*jari*jari*tinggi;
        System.out.println("Volume Tabung : "+volume);
    return 0;
    }
    
    
}
