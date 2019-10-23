/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author asus
 */
public class Mahasiswa {
    
    protected String nama, alamat, jurusan;
    private int nim;
    
    protected Mahasiswa() {
        
    }
    
    protected Mahasiswa(int nim, String nama, String alamat,String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
//        this.jurusan = jurusan;
        setJurusan(jurusan);
    }
    
    protected String getNama() {
        return nama;
    }
    
    protected void setNama(String nama) {
        this.nama = nama;
    }
    
    protected String getAlamat() {
        return alamat;
    }
    
    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    protected int getNim() {
        return nim;
    }
    
    protected void setNim(int nim) {
        this.nim = nim;
    }
    
    protected void setJurusan(String jurusan) {
        
        if (jurusan.equals("61")) {
            this.jurusan = "Matematika";
        } else if (jurusan.equals("62")) {
            this.jurusan = "Biologi";
        } else if (jurusan.equals("63")) {
            this.jurusan = "Kimia";
        } else if (jurusan.equals("64")) {
            this.jurusan = "Fisika";
        } else if (jurusan.equals("65")) {
            this.jurusan = "Teknik Informatika";
        } else if (jurusan.equals("66")) {
            this.jurusan = "Teknik Arsitektur";
        }
        this.jurusan = jurusan;
        nama = null;
        jurusan = null;
    }
    
    protected void tampil(String a) {
        System.out.println(a);
    }
}
