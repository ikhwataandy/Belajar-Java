/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author asus
 */
public class MainTugas1 {

    public static void main(String[] args) {
        Tugas1 tg = new Tugas1();
        int bilangan[] = {-5,-3,-6,-3,-4};
        tg.setBilangan(bilangan);
        tg.cetak(tg.getBilangan());
        tg.setMax(bilangan);
        tg.cetak(tg.getMax());
        tg.setMin(bilangan);
        tg.cetak(tg.getMin());
        tg.setRatarata(bilangan);
        tg.cetak(tg.getRatarata());
        tg.setCari(-3);
        tg.cetakindex(tg.getCari());
        
        
    }

}
