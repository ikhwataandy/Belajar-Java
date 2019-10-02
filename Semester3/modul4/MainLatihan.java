/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package modul4;

/**
 *
 * @author asus
 */
public class MainLatihan {

    public static void main(String[] args) {
        Latihan lt = new Latihan();
        String[][] mahasiswa = {
            {"NIM", "NAMA"},
            {"186599", "Andy"},
            {"197382", "David"},
            {"193747", "Ratih"},
            {"165848", "Oppa"}
        };
        lt.tampil("Data Mahasiswa");
        lt.setMahasiswa(mahasiswa);
        lt.tampil(lt.getMahasiswa());
        
        int[][] data = {
            {1,2},
            {3,4},
            {5,6}
        };
        int pengali = 2;
        lt.tampil("\nData Matrik:");
        lt.setData(data);
        lt.tampil(lt.getData());
        lt.tampil("\nData Matrik X "+pengali+" : ");
        lt.setPerkalianSkalar(data, pengali);
        lt.tampil(lt.getPerkalianSkalar());
        
    }
}
