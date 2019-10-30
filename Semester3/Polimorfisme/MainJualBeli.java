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
public class MainJualBeli extends JualBeli {

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

        toko = null;
        supplier = null;
        barang = null;
        jumlah = 0;
        harga_satuan = 0;
    }

    public static void main(String[] args) {
        String toko, supplier, barang;
        int jumlah;
        long harga_satuan;

        toko = "Barokah";
        supplier = "PT.Jaya Wijaya";
        barang = "Pensil";
        jumlah = 100;
        harga_satuan = 1500;

        JualBeli[] ob = {
            new Supplier(),
            new Toko()
        };
        
        MainJualBeli mb = new MainJualBeli();
        //menampilkan method keterangan() pada class jual beli
        mb.keterangan();
        System.out.println("=============================");
        
        // overriding
        // menumpuk method keterangan() pada parent class 
        //pada method keterangan pada childnya
        // yaitu kelas supplier dan toko
        mb.tampil(ob, toko, supplier, barang, jumlah, harga_satuan);
    }
}
