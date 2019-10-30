/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

import Login.*;
import java.io.*;
public class login  {
    protected login()throws IOException{
        tampil();
    }
    
    protected void tampil() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String username, password;
        
        System.out.print("Username anda : ");
        username = br.readLine();
        System.out.print("Password anda : ");
        password = br.readLine();
        
        Session.setStatusLogin(username, password);
        
        if (Session.getStatusLogin().equals("aktif")) {
            new Menu();
        }else{
            Session.pembatas();
            System.out.println("Masukkan username dan passowrd dengan benar");
            tampil();
        }
        
        username = null;
        password = null;
        br = null;
    }
}
