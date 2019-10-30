/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

import Login.*;

/**
 *
 * @author asus
 */
public class Session {
    private static String username,nama,statusLogin;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
        username = null;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }

    public static String getStatusLogin() {
        return statusLogin;
    }

    public static void setStatusLogin(String username, String password) {
        if (username.equals("admin")&&password.equals("pass")) {
            statusLogin = "aktif";
            setUsername(username);
            setNama("Andy");
        }
        username = null;
        password = null;
    }
    
    public static void cekStatusLogin(){
        if (Session.getStatusLogin()!="aktif") {
            System.exit(0);
        }
    }
    
    public static void pembatas(){
        System.out.println("==========");
    }
    
    public static void logout(){
        username = null;
        statusLogin = null;
        nama = null;
        System.out.println("Anda berhasil logout");
        System.exit(0);
    }
    
}
