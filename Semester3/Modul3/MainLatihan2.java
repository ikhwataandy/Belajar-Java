    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Modul3;

    /**
     *
     * @author asus
     */
    public class MainLatihan2 {

        public static void main(String[] args) {
            int[] bilangan = {2,5,3,5,9,5};
            Latihan2 lt = new Latihan2();

            lt.cetak("Data : ");
            lt.setData(bilangan);
            lt.cetak(lt.getData());
            lt.cetak("\nData setelah dirubah :");
            lt.setNilaiUbah(5, 1);
            lt.cetak(lt.getNilaiUbah());
            lt.cetak("\nPerkalian");
            lt.setPerkalian(lt.getNilaiUbah(), 0.5);
            lt.cetak(lt.getPerkalian());
        }

    }
