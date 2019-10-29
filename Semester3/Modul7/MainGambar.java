/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author asus
 */
public class MainGambar extends Bentuk {

    private void tampil(Bentuk[] ob) {
        //polimorfisme
        //memanggil method yang sama yaitu method gambar dan hapus
        for (int i = 0; i < ob.length; i++) {
            ob[i].gambar();
            ob[i].hapus();
            System.out.println("=========");
        }
    }

    public static void main(String[] args) {
        Bentuk[] ob = {new Lingkaran(),
            new Segitiga(),
            new Elips()

        };
        MainGambar mb = new MainGambar();
        //Menampilkan method gambar dan hapus pada method bentuk atau superclass
        mb.gambar();
        mb.hapus();
        System.out.println("=========");
        
        //overriding
        //menumpuk method dari gambar dan hapus dengan gambar hapus
        //dari subclass
        mb.tampil(ob);
    }
}
