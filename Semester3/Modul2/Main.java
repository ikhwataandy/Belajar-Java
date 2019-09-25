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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modul md = new Modul();

        //Bolpoint
        md.setNama("Bolpoint");
        md.setStok(10);
        md.setHarga_satuan(2000);
//        md.setHarga_barang();
        md.cetak("Nama Barang : " + md.getNama());
        md.cetak("Stok = " + md.getStok());
        md.cetak("Harga = " + md.getHarga_satuan());
        md.cetak("Harga Bolpoin :" + md.getHarga_barang()+"\n");
        //Pensil
        md.setNama("Pensil");
        md.setStok(10);
        md.setHarga_satuan(1000);
//        md.setHarga_barang();
        md.cetak("Nama Barang : " + md.getNama());
        md.cetak("Stok = " + md.getStok());
        md.cetak("Harga = " + md.getHarga_satuan());
        md.cetak("Harga Pensil :" + md.getHarga_barang()+"\n");
        //Penghapus
        md.setNama("Penghapus");
        md.setStok(10);
        md.setHarga_satuan(500);
//        md.setHarga_barang();
        md.cetak("Nama Barang : " + md.getNama());
        md.cetak("Stok = " + md.getStok());
        md.cetak("Harga = " + md.getHarga_satuan());
        md.cetak("Harga Penghapus :" + md.getHarga_barang()+"\n");
        
        md.cetak("Total Harga : "+md.getHarga_total());
    }

}
