/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * 
 */
public class Penambahan {
    private int id;
    private User user;
    private Obat obat;
    private int jumlahTambah;
    
    public Penambahan(int id, int jumlahTambah, User user, Obat obat){
        this.id = id;
        this.user = user;
        this.obat = obat;
        this.jumlahTambah = jumlahTambah;
    }
    
    public Penambahan(int jumlahTambah, User user, Obat obat){
        this.jumlahTambah = jumlahTambah;
        this.user = user;
        this.obat = obat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public int getJumlahTambah() {
        return jumlahTambah;
    }

    public void setJumlahTambah(int jumlahTambah) {
        this.jumlahTambah = jumlahTambah;
    }
    
}
