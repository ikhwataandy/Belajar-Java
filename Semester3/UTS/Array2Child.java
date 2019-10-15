/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author asus
 */
public class Array2Child extends Array2Parent{

    int data[][] = {
        {1, 2, 3}, {4, 5, 6}
    };

    protected void cetak(String a) {
        System.out.println(a);
    }

    protected void cetak(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 1) {
                    System.out.println(a[i][j]);
                } else {
                    System.out.println(a[i][j]);
                }
            }
        }
    }

    protected void cetak(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        
    }
    
    protected void insertData(){
        this.cetak("Bilangan : ");
        this.setData(data);
        this.cetak(this.getData());
        this.cetak("\nMenentukan Index : ");
        this.setIndex(data);
        this.cetak(this.getIndex());
        this.cetak("\nGanjil Genap : ");
        this.setGanjilgenap(data);
        this.cetak(this.getGanjilgenap());
    }
}
