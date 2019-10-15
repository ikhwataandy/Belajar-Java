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
public class BilanganChild extends BilanganParent{
    int[] data= {
            1,2,3,4,5,6
        };
    protected void cetak(String a){
        System.out.println(a);
    }
    protected void cetak(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.println(a[i]);
            }else{
                System.out.println(a[i]);
            }
        }
        a=null;
    }
    
    protected void cetak(String[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    protected void insertData(){
        this.cetak("Bilangan :");
        this.setData(data);
        this.cetak(this.getData());
        this.setIndex(data);
        this.cetak("\nMenentukan index : ");
        this.cetak(this.getIndex());
        this.cetak("\nMenentukan nilai ganjil genap : ");
        this.setGanjilgenap(data);
        this.cetak(this.getGanjilgenap());
    }
}
