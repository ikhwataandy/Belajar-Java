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
public class Toko extends JualBeli{
    protected void keterangan(){
        System.out.println("Toko : "
        +"\nToko "+getToko()+" membeli "+getBarang()
        +"\nKepada Supplier "+getSupplier()+" sebanyak "+getJumlah()
        +"\ndengan harga satuan "+getHarga_satuan()+"."
        +"\nUang yang diberikan kepada supplier adalah "+getHarga_total()+"."
        +"\nJadi, uang toko berkurang "+getHarga_total()+" dan "
        +"stok "+getBarang()+" berkurang "+getJumlah());
    }
}
