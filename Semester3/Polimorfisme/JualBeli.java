/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author asus
 */
public class JualBeli {
    
    private String toko,supplier,barang;
    private int jumlah;
    private long harga_satuan,harga_total;

    protected String getToko() {
        return toko;
    }

    protected void setToko(String toko) {
        this.toko = toko;
    }

    protected String getSupplier() {
        return supplier;
    }

    protected void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    protected String getBarang() {
        return barang;
    }

    protected void setBarang(String barang) {
        this.barang = barang;
    }

    protected int getJumlah() {
        return jumlah;
    }

    protected void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    protected long getHarga_satuan() {
        return harga_satuan;
    }

    protected void setHarga_satuan(long harga_satuan) {
        this.harga_satuan = harga_satuan;
        harga_satuan = 0;
    }

    protected long getHarga_total() {
        return harga_total;
    }

    protected void setHarga_total(long harga_total) {
        this.harga_total = harga_satuan * jumlah;
    }
    
    protected void keterangan(){
        System.out.println("Parent class : Transaksi Jual Beli Supplier dan Toko");
    }
    
}
