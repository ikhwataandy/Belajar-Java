/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class DetailFilm extends Film{
    private int jmlfilm;
    

    public int getJmlfilm() {
        return jmlfilm;
    }

    public void setJmlfilm(int jmlfilm) {
        this.jmlfilm = jmlfilm;
        jmlfilm = 0;
    }
    
    protected void cetak(String a) {
        System.out.print(a);
        a = null;
    }
    
    protected void displayFilm() {
        this.cetak("\nJudul      : " + super.getJudul());
        this.cetak("\nNama Aktor : " + super.getAktor());
        this.cetak("\nSutradara  : " + super.getSutradara());
        this.cetak("\nPublisher  : " + super.getPublish());
        this.cetak("\nKategori   : " + super.getKategori());
        this.cetak("\nStok       : " + super.getStok());
    }
    
    protected void MasukkanData(){
        int perulangan =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Data"));
        
        for (int i = 1; i <= perulangan; i++) {
            this.cetak("\nData Film ke-" + i);
            this.setJudul(JOptionPane.showInputDialog("Masukkan judul ke : "+i));
            this.setAktor(JOptionPane.showInputDialog("Masukkan Nama Aktor ke : "+i));
            this.setSutradara(JOptionPane.showInputDialog("Masukkan Nama Sutradara ke : "+i));
            this.setPublish(JOptionPane.showInputDialog("Masukkan nama Publisher ke : "+i));
            this.setKategori(JOptionPane.showInputDialog("Masukkan Kategori ke "+i));
            this.setStok(JOptionPane.showInputDialog("Masukkan Stok ke : "+i));
            
            this.displayFilm();
             System.exit(0);
        }
       
    }
    
//    public void hapus(){
//        this.jmlfilm = 0;
//        this.
//    }
    
    
}
