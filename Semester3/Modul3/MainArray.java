/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author asus
 */
public class MainArray {
    public static void main(String[] args) {
        Array ar = new Array();
//        String mahasiswa[] = {"Andy", "Danu","Dana","Dini","Doni"};
        int deret[] = {-5,-3,-6,-3,-4};
//        ar.tampil("Daftar Mahasiswa");
//        ar.setMhs(mahasiswa);
//        ar.tampil(ar.getMhs());
//        ar.tampil("================");
        ar.tampil("Deret :");
        ar.setDeret(deret);
        ar.tampil(ar.getDeret());
        ar.tampil("Penjumlahan :");
        ar.setpenjumlahan(deret);
        ar.tampil(ar.getpenjumlahan());
        
        //menghapus variabel dari memori untuk optimasi program
        ar.hapus();
//        mahasiswa = null;
        deret = null;
        ar = null;
    }
}
