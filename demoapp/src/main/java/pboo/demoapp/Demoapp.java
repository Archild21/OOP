/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pboo.demoapp;

/**
 *
 * @author LENOVO
 */
public class Demoapp {

    public static void main(String[] args) {
        int jumlah_looping =5; 
        int bil1=5; 
        int bil2=2; 
        demoobjectoriented Demo = new demoobjectoriented(); 
        Demo.helloWorld(jumlah_looping); 
        System.out.print("\n-Pemanggilan Fungsi Tambah-\n"); 
        System.out.print(" Hasil Operasi Tambah : "+Demo.tambah(bil1,bil2)+"\n");
        System.out.print(" Hasil Operasi Kali :"+Demo.kali(bil1, bil2)+"\n");
        System.out.println(" Hasil Operasi Bagi :"+Demo.bagi(bil1, bil2));
        System.out.print(" Hasil Operasi Pangkat :"+Demo.pangkat(bil1, bil2)+"\n");
    }
}
