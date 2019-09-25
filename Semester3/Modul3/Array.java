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
public class Array {

    private String[] mhs;
    private int[] deret;
    private int hasilpenjumlahan;

    public String[] getMhs() {
        return mhs;
    }

    public void setMhs(String[] mhs) {
        this.mhs = mhs;
        mhs = null; // mengahpus variable parameter dari memori
    }

    public int[] getDeret() {
        return deret;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
        deret = null; // mengahpus variable parameter dari memori
    }

    public int getpenjumlahan() {
        return hasilpenjumlahan;
    }

    public void setpenjumlahan(int[] deret) {
        hasilpenjumlahan = 0;
        for (int i = 0; i < deret.length; i++) {
            hasilpenjumlahan += deret[i];
        }
        deret = null; // menghapus variabel parameter dari memori
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null; // menghapus variabel dari memori
    }

    public void tampil(String a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null; // mengahpus variabel dari memori
        data = null;
    }

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null; // mengahpus variabel dari memori
        data = null;
    }
    
    public void hapus(){ // menghapus dari memori untuk optimasi program
        mhs = null;
        deret = null;
        hasilpenjumlahan = 0;
    }
}
