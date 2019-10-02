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
public class MainArray2 {
    public static void main(String[] args) {
        Array2 ar = new Array2();
        int[][] MatrikA = {
            {1,2},
            {3,5},
            {6,7}
        };
        
        int[][] MatrikB = {
            {8,9},
            {10,11},
            {12,13}
        };
        ar.tampil("Matrik A :");
        ar.setMatrikA(MatrikA);
        ar.tampil(ar.getMatrikA());
        ar.tampil("\nMatrik B :");
        ar.setMatrikB(MatrikB);
        ar.tampil(ar.getMatrikB());
        ar.tampil("\nPenjumlahan:");
        ar.setPenjumlahanSkalar(MatrikA, MatrikB);
        ar.tampil(ar.getPenjumlahanSkalar());
        ar.tampil("\nPerkalian");
        ar.setPerkalian(ar.getPenjumlahanSkalar(), 0.5);
        ar.tampil(ar.getPerkalian());
    }
}
