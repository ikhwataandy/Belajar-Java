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
public class Array2Parent {
    private int[][]data;
    private String[][]index,ganjilgenap;

    protected int[][] getData() {
        return data;
    }

    protected void setData(int[][] data) {
        this.data = data;
    }

    protected String[][] getIndex() {
        return index;
    }

    protected void setIndex(int[][] data) {
        index = new String[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                index[i][j] = Integer.toString(data[i][j])+" Terdapat pada baris ke : "+i+" kolom ke : "+j;
            }
        }
    }

    protected String[][] getGanjilgenap() {
        return ganjilgenap;
    }

    protected void setGanjilgenap(int[][]data) {
        ganjilgenap = new String[data.length][data[0].length];
        for (int i = 0; i < data.length ;i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] % 2 == 1) {
                    ganjilgenap[i][j] = Integer.toString(data[i][j])+"Bilangan ganjil";
                }else{
                    ganjilgenap[i][j] = Integer.toString(data[i][j])+"Bilangan genap";
                }
            }
        }
    }
    
}
