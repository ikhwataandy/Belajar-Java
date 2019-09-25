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
public class Tugas1 {

    private int[] bilangan;
    private double ratarata;
    private int min;
    private int max;
    private int cari2[] = new int[5];

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        System.out.println("Bilangan nya :");
        this.bilangan = bilangan;
    }

    public double getRatarata() {
        return ratarata;
    }

    public void setRatarata(int[] bilangan) {
        System.out.println("\nRata Rata :");
        int i;
        for (i = 0; i < bilangan.length; i++) {
            ratarata += bilangan[i];
        }
        ratarata = (ratarata /bilangan.length);
        this.ratarata = ratarata;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int[] bilangan) {
        System.out.println("\nNilai Max nya adalah :");
        min = bilangan[0];
        for (int i = 0; i < bilangan.length; i++) {
            if (min > bilangan[i]) {
                min = bilangan[i];
            }
        }
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int[] bilangan) {
        System.out.println("\nNilai Max nya adalah :");
        max = bilangan[0];
        for (int i = 0; i < bilangan.length; i++) {
            if (max < bilangan[i]) {
                max = bilangan[i];
            }
        }
        this.max = max;
    }

    public int[] getCari() {
        return cari2;
    }

    public void setCari(int cari) {
        int index = 0;
        System.out.println("\nIndex :");
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == cari) {
                cari2[index] = i;
                index++;
            }
        }
    }

    public void cetak(String a) {
        System.out.println(a);
        a = null; // menghapus variabel dari memori
    }
    
    public void cetak(double a) {
        System.out.println(a);
    }
    
    public void cetak(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
//        a = null; // mengahpus variabel dari memori
//        data = null;
    }
    
    public void cetakindex(int[] cari) {
        for (int i = 0; i < cari.length; i++) {
            if (cari[i] != 0) {
             System.out.print(cari[i]);
                System.out.print(" ");   
            }            
        }
    }
}
