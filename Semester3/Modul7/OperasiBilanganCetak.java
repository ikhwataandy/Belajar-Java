/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author asus
 */
public class OperasiBilanganCetak extends OperasiBilangan{
    private void cetakSemua(OperasiBilangan[]ob,double a, double b){
        for (int i = 0; i < ob.length; i++) {
            ob[i].setA(a);
            ob[i].setB(b);
            ob[i].setC();
            ob[i].tampil();
            System.out.println("==========");
            
        }     
    }
    
    public static void main(String[] args) {
        OperasiBilangan[] obj = {new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };
        
        double a=10.5;
        double b = 0.5;
        
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(obj, a, b);
    }
}
