/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author asus
 */
public class Kendaraan {
    private String merk,warna;
    protected String namaClass = "Kendaraan";

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNamaClass() {
        return namaClass;
    }

    public void setNamaClass(String namaClass) {
        this.namaClass = namaClass;
    }
    
    public void tampil(String a){
        System.out.println(a);
    }
    
    protected String keterangan(){
        return ("Ini adalah class "+namaClass);
    }
    
    
}
