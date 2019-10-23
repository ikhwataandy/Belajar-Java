/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class MahasiswaChild extends Mahasiswa {
    
    private static String univ;
    
    protected MahasiswaChild(String univ){
        this.univ = univ;
    }
  
    protected MahasiswaChild(int nim,String nama,String alamat, String jurusan){
        super(nim,nama,alamat,jurusan);
    }
    
    
    
    protected void MasukkanData() {
        
        boolean kondisi = true;
        while (kondisi) {
            
            this.tampil("\nData Mahasiswa ");
            this.setNim(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nim: ")));
            this.setNama(JOptionPane.showInputDialog("Masukkan Nama Mahasiswa : "));
            this.setAlamat(JOptionPane.showInputDialog("Masukkan alamat : "));
            this.setJurusan(JOptionPane.showInputDialog("Masukkan Jurusan : "));
            this.displayMahasiswa();
            String tanya = JOptionPane.showInputDialog("Jika Y = lanjut, T = berhenti");
            if (tanya.equalsIgnoreCase("Y")) {
                kondisi = true;
            } else if (tanya.equalsIgnoreCase("T")) {
                kondisi = false;
            }
        }
        
    }
    
    protected void displayMahasiswa(){
        this.tampil("\n Nama Kampus : "+get());
        this.tampil("\n Nim         : "+super.getNim());
        this.tampil("\n Nama        : "+super.getNama());
        this.tampil("\n ALamat      : "+super.getAlamat());
        this.tampil("\n Jurusan     : "+getJurusan());
    }
}
