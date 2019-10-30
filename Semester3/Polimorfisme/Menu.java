/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

import Login.*;
import java.io.*;
public class Menu {
    protected Menu() throws IOException{
        Session.cekStatusLogin();
        tampil();
    }
    
    protected void tampil() throws IOException{
        Session.pembatas();
        System.out.println("Hello ("+Session.getUsername()+")"+Session.getNama());
        System.out.println("Pilih salah satu : "+
                "\n1. Pilih Polimorfisme "+
                "\n2. Logout");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        System.out.println("Pilihan anda :");
        pilih = Integer.parseInt(bf.readLine());
        switch(pilih){
            case 1: new Transaksi();
            case 2: Session.logout();
            default:Session.pembatas();
                System.out.println("Masukkan pilihan menu dengan benar! :");
                tampil();
        }
        bf = null;
    }
}
