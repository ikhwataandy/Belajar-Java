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
public class BilanganParent {
    protected int[] data;
    protected String[]index,ganjilgenap;

    protected int[] getData() {
        return data;
    }

    protected void setData(int[] data) {
        this.data = data;
    }

    protected String[] getIndex() {
        return index;
    }

    protected void setIndex(int[] data) {
        index = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            index[i] = Integer.toString(data[i])+" Terdapat pada index ke : "+i;
        }
    }

    protected String[] getGanjilgenap() {
        return ganjilgenap;
    }

    protected void setGanjilgenap(int[] data) {
        ganjilgenap = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                ganjilgenap[i] = Integer.toString(data[i])+" Adalah bilangan ganjil";
            }else{
                ganjilgenap[i] = Integer.toString(data[i])+" Adalah bilangan genap";
            }
        }
    }
    
    
    
}
