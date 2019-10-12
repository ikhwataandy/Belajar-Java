/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.Scanner;
import javax.swing.JOptionPane;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;

/**
 *
 * @author qoheng
 */
public class ParkirAPP {

    public static void main(String[] args) {
//ImageIcon icon = new ImageIcon("");
        int jumlRodaDua;
        int jumlRodaEmpat;
        int NO;
        Scanner input;
        String inputan;
        boolean perulangan = true;
        HashTable Parkir;

        JOptionPane.showMessageDialog(null, "Selamat Datang Di Aplikasi Parkir");
        inputan = JOptionPane.showInputDialog(null, "Masukkan Jumlah Parkir Roda Dua");
        jumlRodaDua = Integer.parseInt(inputan);
        inputan = JOptionPane.showInputDialog(null, "Masukkan Jumlah Parkir Roda Empat");
        jumlRodaEmpat = Integer.parseInt(inputan);

        Parkir = new HashTable(jumlRodaDua, jumlRodaEmpat);

        while (perulangan) {
            System.out.print("Masukkan aksi yang anda inginkan : Show = s, Insert = i, Delete = d, Find = f, Update = u, exit = e : ");
            input = new Scanner(System.in);
            inputan = input.nextLine();
            switch (inputan) {
                case "s":
                    Parkir.displayTable();
                    break;
                case "i":
                    inputan = JOptionPane.showInputDialog(null, "Pilih Kendaraan :\n1. Roda Dua\n2. Roda Empat");
                    switch (inputan) {
                        case "1":
                            Parkir.insertRodaDua();
                            break;
                        case "2":
                            Parkir.insertRodaEmpat();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                    }
                    break;
                case "d":
                    inputan = JOptionPane.showInputDialog(null, "Pilih Kendaraan :\n1. Roda Dua\n2. Roda Empat");
                    switch (inputan) {
                        case "1":
                            inputan = JOptionPane.showInputDialog(null, "Menghapus Berdasarkan :\n1. NO\n2. NO Polisi");
                            switch (inputan) {
                                case "1":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Kendaraan Roda Dua");
                                    NO = Integer.parseInt(inputan);
                                    Parkir.deleteNORodaDua(NO);
                                    break;
                                case "2":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Polisi Roda Dua");
                                    Parkir.deletePlatRodaDua(inputan);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                            }
                            break;
                        case "2":
                            inputan = JOptionPane.showInputDialog(null, "Menghapus Berdasarkan:\n1. NO\n2. NO Polisi :");
                            switch (inputan) {
                                case "1":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Kendaraan Roda Empat");
                                    NO = Integer.parseInt(inputan);
                                    Parkir.deleteNORodaEmpat(NO);
                                    break;
                                case "2":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Polisi Roda Empat");
                                    Parkir.deletePlatRodaEmpat(inputan);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");

                    }
                    break;
                case "f":
                    inputan = JOptionPane.showInputDialog(null, "Pilih Kendaraan :\n1. Roda Dua\n2. Roda Empat");
                    switch (inputan) {
                        case "1":
                            inputan = JOptionPane.showInputDialog(null, "Mencari Berdasarkan :\n1. NO\n2. NO Polisi");
                            switch (inputan) {
                                case "1":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Kendaraan Roda Dua :");
                                    NO = Integer.parseInt(inputan);
                                    Parkir.findNORodaDua(NO);        
                                    break;
                                case "2":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Polisi Roda Dua :");
                                    Parkir.findPlatRodaDua(inputan);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                            }
                            break;
                        case "2":
                            inputan = JOptionPane.showInputDialog(null, "Mencari Berdasarkan :\n1. NO\n2. NO Polisi");
               
                  switch (inputan) {
                                case "1":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Kendaraan Roda Empat :");
                                    NO = Integer.parseInt(inputan);
                                    Parkir.findNORodaEmpat(NO);
                                    break;
                                case "2":
                                    inputan = JOptionPane.showInputDialog(null, "Masukkan NO Polisi Roda Empat :");
                                    Parkir.findPlatRodaEmpat(inputan);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                    }
                    break;
                case "u":
                    inputan = JOptionPane.showInputDialog(null, "Pilih Kendaraan :\n1. Roda Dua\n2. Roda Empat");
                    switch (inputan) {
                        case "1":
                            inputan = JOptionPane.showInputDialog(null, "Masukkan NO Kendaraan Roda Dua");
                            NO = Integer.parseInt(inputan);
                            Parkir.updateRodaDua(NO);
                            break;

                        case "2":
                            inputan = JOptionPane.showInputDialog(null, "Masukkan NO Kendaraan Roda Empat");
                            NO = Integer.parseInt(inputan);
                            Parkir.updateRodaEmpat(NO);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
                    }
                    break;
                case "e":
                    perulangan = false;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Aksi yang anda masukkan salah");
            }
        }

    }

}
