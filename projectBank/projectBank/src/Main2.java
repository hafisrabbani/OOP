
import projectbank.Tabungan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nitro
 */
public class Main2 {
    public static void main(String[] args) {
        Tabungan syahrul = new Tabungan(5000);
        Tabungan budi = new Tabungan(1000);
        
        syahrul.bunga = 10;
        System.out.println("Bunga syahrul " + syahrul.bunga);
        System.out.println("Bunga budi " + budi.bunga);
        
        budi.bunga = 5;
        System.out.println("Bunga syahrul " + syahrul.bunga);
        System.out.println("Bunga budi " + budi.bunga);
        
        Tabungan.bunga = 15;
        System.out.println("Bunga syahrul " + syahrul.bunga);
        System.out.println("Bunga budi " + budi.bunga);
        
        
    }
}
