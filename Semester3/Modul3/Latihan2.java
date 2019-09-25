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
public class Latihan2 {
    private int [] data;
    private int []nilaiubah;
    private double[] perkalian;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getNilaiUbah() {
        return nilaiubah;
    }

    public void setNilaiUbah(int a,int b) {
        nilaiubah = new int[data.length];
        for (int i = 0; i < data.length; i++) {
           nilaiubah[i] = data[i]; 
            if (nilaiubah[i] == a) {
                nilaiubah[i] =b;
            }
        }
    }
    
    public void cetak(String a){
        System.out.println(a);
    }
    public void cetak (int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    
    public void cetak (double[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public double[] getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(int[]a,double nilai) {
        perkalian = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            perkalian[i] = (double)a[i] * nilai;
        }
    }

    
    
}
