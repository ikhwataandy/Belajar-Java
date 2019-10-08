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
public class Mobil extends Kendaraan{
    private long harga;
    protected String namaClass = "Mobil";

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getNamaClass() {
        return namaClass;
    }

    public void setNamaClass(String namaClass) {
        this.namaClass = namaClass;
    }
    
    public String keterangan(){
        return (namaClass+" : Ini adalah class "+namaClass);
    }
    
    public String keterangan_kendaraan(){
        return super.namaClass+" : "+super.keterangan();
    }
}
