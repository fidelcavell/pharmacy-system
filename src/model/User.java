/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * 
 */
public class User {
    private String userName;
    private String password;
    private String jenisAkses;
    private String nama;
    
    public User(String userName, String password, String jenisAkses, String nama){
        this.userName = userName;
        this.password = password;
        this.jenisAkses = jenisAkses;
        this.nama = nama;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisAkses() {
        return jenisAkses;
    }

    public void setJenisAkses(String jenisAkses) {
        this.jenisAkses = jenisAkses;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
