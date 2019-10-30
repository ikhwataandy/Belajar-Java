/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author asus
 */
public class Transaksi extends JualBeli {

    protected Transaksi() throws IOException {
        Session.cekStatusLogin();
        cetak();
    }

    protected void tampil(JualBeli[] ob, String toko, String supplier, String barang, int jumlah, long harga_satuan) {
        //polimorfisme
        //memanggil method yang sama pada masing" class
        for (int i = 0; i < ob.length; i++) {
            ob[i].setToko(toko);
            ob[i].setSupplier(supplier);
            ob[i].setBarang(barang);
            ob[i].setJumlah(jumlah);
            ob[i].setHarga_satuan(harga_satuan);
            ob[i].setHarga_total(harga_satuan);
            ob[i].keterangan();
            System.out.println("==============================");
        }
    }

    protected void cetak() throws IOException {
        Login.Session.pembatas();
        System.out.println("Hello (" +Session.getUsername() + ")" +Session.getNama());
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String toko, supplier, barang;
        int jumlah;
        long harga_satuan;
        
        System.out.print("Nama toko :");
        toko = bf.readLine();
        System.out.println("Nama Supplier :");
        supplier = bf.readLine();
        System.out.println("Nama Barang : ");
        barang = bf.readLine();
        System.out.println("Jumlah : ");
        jumlah = Integer.parseInt(bf.readLine());
        System.out.println("Harga Satuan : ");
        harga_satuan = Integer.parseInt(bf.readLine());
        
        JualBeli[] ob = {
            new Supplier(),
            new Toko()
        };
        
        tampil(ob, toko, supplier, barang, jumlah, harga_satuan);

        new Menu();
        bf = null;
    }
}
