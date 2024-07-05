/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * 
 */
public class Pembelian {
    private int id;
    private User user;
    private Obat obat;
    private int jumlahBeli;
    private int totalHarga;
    
    public Pembelian(int id, int jumlahBeli, int totalHarga, User user, Obat obat){
        this.id = id;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = totalHarga;
        this.user = user;
        this.obat = obat;
    }
    
    public Pembelian(int jumlahBeli, int totalHarga, User user, Obat obat){
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = totalHarga;
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

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    
    
}
