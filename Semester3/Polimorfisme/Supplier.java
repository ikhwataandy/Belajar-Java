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
public class Supplier extends JualBeli {

    protected void keterangan() {
        System.out.println("Supllier :"
                + "\nSupplier " + getSupplier() + " menjual " + getBarang()
                + "\nKepada toko " + getToko() + " sebanyak " + getJumlah()
                + "\ndengan harga satuan " + getHarga_satuan() + "."
                + "\nUang yang diterima Supplier adalah " + getHarga_total() + " dan"
                + "\nJadi, uang toko berkurang " + getHarga_total() + " dan "
                + "Stok " + getBarang() + " bertambah " + getJumlah());

    }
}
