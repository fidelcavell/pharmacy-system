/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;
import model.Obat;
import model.Pembelian;
/**
 *
 * 
 */
public class PembelianDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPembelian(Pembelian b){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO pembelian(id_pembelian, id_obat, userName, jumlahBeli, totalHarga) "
                + "VALUES ('" + b.getId() + "', '" + b.getObat().getId() + "', '" 
                + b.getUser().getUserName() + "', '" + b.getJumlahBeli() + "', '" + b.getTotalHarga() + "')";
        
        System.out.println("Adding Pembelian....");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Pembelian");
            statement.close();
            
        } catch (Exception e){
            System.out.println("Error adding Pembelian...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updatePembelian(Pembelian b, int id){
        con = dbCon.makeConnection();
            
        String sql = "UPDATE user SET id_obat = '" + b.getObat().getId() + "', userName = '" + b.getUser().getUserName() 
                + "', jumlahBeli = '" + b.getJumlahBeli() + "', totalHarga = '"+ b.getTotalHarga() + "' WHERE id_pembelian = '" + id + "'";
        
        System.out.println("Editing Pembelian...");  
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pebelian " + id);
            statement.close();
            
        }catch(Exception e){
            System.out.println("Eror editing Pembelian...");
            System.out.println(e);
        }
        dbCon.closeConnection();
            
    }
    
     public void deletePembelian(int id){
        con = dbCon.makeConnection();
            
        String sql = "DELETE FROM pembelian WHERE id_pembelian = '" + id + "'";
        System.out.println("Deleting User.....");
            
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Pembelian " + id );
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error close Pembelian...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
    }
    
    public List<Pembelian> showPembelian(){
        con = dbCon.makeConnection();
            
        String sql = "SELECT b.*, o.*, u.* FROM pembelian as b JOIN obat as o ON b.id_obat = o.id_obat JOIN user as u ON b.userName = u.userName";
        System.out.println("Mengambil data Pembelian....");
            
        List<Pembelian> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                
            if(rs != null){
                while(rs.next()){
                    Obat o = new Obat(
                            Integer.parseInt(rs.getString("o.id_obat")),
                            rs.getString("o.namaObat"),
                            rs.getString("o.jenisObat"),
                            Integer.parseInt(rs.getString("o.stokObat")),
                            Integer.parseInt(rs.getString("o.hargaObat")));
                    
                    User u = new User(
                            rs.getString("u.userName"),
                            rs.getString("u.password"),
                            rs.getString("u.jenisAkses"),
                            rs.getString("u.nama"));
                    
                    Pembelian b = new Pembelian(
                            Integer.parseInt(rs.getString("b.id_pembelian")),
                            Integer.parseInt(rs.getString("b.jumlahBeli")),
                            Integer.parseInt(rs.getString("b.totalHarga")),
                            u, o);
                    list.add(b);
                }
            }
            rs.close();
            statement.close();
                
        } catch(Exception e){
            System.out.println("Eror reading database.....");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
    
    public List<Pembelian> showPembelianBySearch(String query){
        con = dbCon.makeConnection();
            
        String sql = "SELECT b.*, o.*, u.* FROM pembelian as b JOIN obat as o ON b.id_obat = o.id_obat JOIN user as u ON b.userName = u.userName WHERE u.userName LIKE '%" + query + "%'";
        System.out.println("Mengambil data Pembelian....");
            
        List<Pembelian> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                
            if(rs != null){
                while(rs.next()){
                    Obat o = new Obat(
                            Integer.parseInt(rs.getString("o.id_obat")),
                            rs.getString("o.namaObat"),
                            rs.getString("o.jenisObat"),
                            Integer.parseInt(rs.getString("o.stokObat")),
                            Integer.parseInt(rs.getString("o.hargaObat")));
                    
                    User u = new User(
                            rs.getString("u.userName"),
                            rs.getString("u.password"),
                            rs.getString("u.jenisAkses"),
                            rs.getString("u.nama"));
                    
                    Pembelian b = new Pembelian(
                            Integer.parseInt(rs.getString("b.id_pembelian")),
                            Integer.parseInt(rs.getString("b.jumlahBeli")),
                            Integer.parseInt(rs.getString("b.totalHarga")),
                            u, o);
                    list.add(b);
                }
            }
            rs.close();
            statement.close();
                
        } catch(Exception e){
            System.out.println("Eror reading database.....");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
        
}
