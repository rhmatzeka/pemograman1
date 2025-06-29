/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author ILHAM NA
 */
public class UserSession {
    private static String id;
    private static String username;
    private static String nama;
    private static String level;
    private static String nisn;
    private static String nama_siswa;
     
   
    //user session : id_________________________________________________________
    public static String get_id() {
        return id;
    } 
    public static void set_id(String id) {
        UserSession.id = id;
    }
    
    //user session : username___________________________________________________
    public static String get_username() {
        return username;
    } 
    public static void set_username(String username) {
        UserSession.username = username;
    }
    
    //user session : nama_______________________________________________________
    public static String get_nama() {
        return nama;
    } 
    public static void set_nama(String nama) {
        UserSession.nama = nama;
    }
    
    //user session : level______________________________________________________
    public static String get_level() {
        return level;
    } 
    public static void set_level(String level) {
        UserSession.level = level;
    }
    
    //user session : nisn_______________________________________________________
    public static String get_nisn() {
        return nisn;
    } 
    public static void set_nisn(String nisn) {
        UserSession.nisn = nisn;
    }
    
    //user session : nama siswa_________________________________________________
    public static String get_nama_siswa() {
        return nama_siswa;
    } 
    public static void set_nama_siswa(String nama_siswa) {
        UserSession.nama_siswa = nama_siswa;
    }
    
    
}
