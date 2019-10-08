/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author asus
 */
public class Film {

    private String judul,publish, kategori, aktor, sutradara,stok;

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
        aktor = null;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
        stok = null;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
        sutradara = null;
    }

    protected String getJudul() {
        return judul;
    }

    protected void setJudul(String judul) {
        this.judul = judul;
        judul = null;
    }

    protected String getPublish() {
        return publish;
    }

    protected void setPublish(String publish) {
        this.publish = publish;
        publish = null;
    }

    protected String getKategori() {
        return kategori;
    }

    protected void setKategori(String kategori) {
        if (kategori.equals("SU")) {
            this.kategori = "Semua Umur";
        } else if (kategori.equals("D")) {
            this.kategori = "Dewasa";
        } else if (kategori.equals("R")) {
            this.kategori = "Remaja";
        } else if (kategori.equals("A")) {
            this.kategori = "Anak-anak";
        }
        kategori = null;
    }
    
    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

}
