/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan3A;

/**
 *
 * @author ASUS
 */
public class driver {
    public static void main(String[] args){
        Lingkaran L= new Lingkaran();
        Tabung T = new Tabung();
        L.luas();
        L.keliling();
        T.getVolume();
        
        System.out.println(" ");
        Persegi p = new Persegi();
        Limas l = new Limas(); 
        p.luas();
        p.keliling();
        l.getVolume();
        
        
        
    }
}
