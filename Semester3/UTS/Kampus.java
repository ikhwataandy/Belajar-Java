/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Kampus {
    private int nim;
    private String nama,alamat,jurusan;

    protected int getNim() {
        return nim;
    }

    protected void setNim(int nim) {
        this.nim = nim;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getJurusan() {
        return jurusan;
    }

    protected void setJurusan(String jurusan) {
        switch (jurusan) {
            case "01":
                this.jurusan = "Matematika";
                break;
            case "02":
                this.jurusan = "Fisika";
                break;
            case "03":
                this.jurusan ="Kimia";
                break;
            case "04":
                this.jurusan = "Biologi";
                break;
            case "06":
                this.jurusan = "Teknik Informatika";
                break;
            default:
                break;
        }
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    protected void tampil(String a){
        System.out.println(a);
    }
    
    protected void tampil(){
        this.tampil("Nim : "+getNim());
        this.tampil("Nama : "+getNama());
        this.tampil("Alamat : "+getAlamat());
        this.tampil("Jurusan : "+getJurusan());
    }
    
    protected void insertData(){
        boolean kondisi = true;
        while(kondisi){
            this.tampil("Data Mahasiswa :");
            this.setNim(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nim : ")));
            this.setNama(JOptionPane.showInputDialog("Masukkan Nama :"));
            this.setAlamat(JOptionPane.showInputDialog("Masukkan Alamat mahasiswa :"));
            this.setJurusan(JOptionPane.showInputDialog("Masukkan Jurusan :"));
            this.tampil();
            String tanya = JOptionPane.showInputDialog("Jika Y = lanjut, T = berhenti");
            if (tanya.equalsIgnoreCase("Y")){ 
                kondisi = true;
            }else if(tanya.equalsIgnoreCase("T")){
                kondisi = false;
            }
            
        }
    }
    
}
