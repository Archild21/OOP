/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboo.demoapp;

/**
 *
 * @author LENOVO
 */
public class demoobjectoriented {
    public void helloWorld(int jmlh_looping){ 
        System.out.print ("\n-Display Hello World-\n"); 
            for(int i=0;i< jmlh_looping;i++){ 
                System.out.print ((i+1)+". Hello World....\n"); 
        } 
    } 
    public int tambah(int bil1, int bil2){ 
        return(bil1+bil2); 
    }
    public int kali(int bil1, int bil2){
        return bil1*bil2;
    }
    public float bagi(float bil1, int bil2){
        return bil1/bil2;
    }
    public int pangkat(int bil1, int bil2){
        int hasil = 1;
        for(int x = 1;x <= bil2;x++){
            hasil = hasil * bil1;
        }
        return hasil;
    }
}

