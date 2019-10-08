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
public class MainCoba extends Mobil {
    public static void main(String[] args) {
        MainCoba mc = new MainCoba();
        String merk,warna,harga;
        
        merk = JOptionPane.showInputDialog("Merk Mobil :");
        mc.setMerk(merk);
        mc.tampil("Merk Mobil : "+mc.getMerk());
        
        warna = JOptionPane.showInputDialog("Warna Mobil : ");
        mc.setWarna(warna);
        mc.tampil("Warna Mobil : "+mc.getWarna());
    }
}
