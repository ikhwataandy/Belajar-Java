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
public class Array2 {
    private int [][] MatrikA,MatrikB;
    private int [][]penjumlahan;
    private double [][] perkalian;

    public double[][] getPerkalian() {
        return perkalian;
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int[][] penjumlahan) {
        this.penjumlahan = penjumlahan;
    }

    public void setPerkalian(int[][]MatrikC, double b) {
        perkalian = new double[MatrikC.length][MatrikC[0].length];
        int i,j;
        for (i = 0; i < MatrikC.length; i++) {
            for (j = 0; j < MatrikC[i].length; j++) {
                perkalian[i][j] =MatrikC[i][j] * b;
            }
        }
    }

    public int[][] getMatrikA() {
        return MatrikA;
    }

    public void setMatrikA(int[][] MatrikA) {
        this.MatrikA = MatrikA;
    }

    public int[][] getMatrikB() {
        return MatrikB;
    }

    public void setMatrikB(int[][] MatrikB) {
        this.MatrikB = MatrikB;
    }

    
    
    public void setPenjumlahanSkalar(int[][]MatrikA, int[][]MatrikB){
        penjumlahan = MatrikA;
        int i,j;
        for (i = 0; i < MatrikA.length; i++) {
            for (j = 0; j < MatrikA[i].length; j++) {
                penjumlahan[i][j] =MatrikA[i][j]+MatrikB[i][j];
            }
        }
        MatrikA = null;
    }
    
    public int[][]getPenjumlahanSkalar(){
        return penjumlahan;
    }
    
    public void tampil(String a){
        System.out.println(a);
        a = null;
    }
    
    public void tampil (String data[][]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        data =null;
    }
    
     public void tampil (int data[][]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        data =null;
    }
     
     public void tampil (double data[][]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        data =null;
    }
    
    public void hapus(){
        
        
    }
}
