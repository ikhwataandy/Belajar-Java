/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author asus
 */
public class Modul {

    private int stok;
    private double harga_satuan, harga_total, harga_barang;
    private String nama;

    public int getStok() {
        return stok;
    }

    public void cetak(String a) {
        System.out.println(a);
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(double harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public double getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(double harga_barang) {
        this.harga_total = harga_total+harga_barang;
    }

    public double getHarga_barang() {
        return harga_barang =this.stok * this.harga_satuan;
    }

//    public void setHarga_barang() {
//        this.harga_barang =this.harga_barang = stok * harga_satuan;
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
