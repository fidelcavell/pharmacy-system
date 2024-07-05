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
import model.Obat;
/**
 *
 * 
 */
public class ObatDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertObat(Obat o){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO obat(id_obat, namaObat, jenisObat, stokObat, hargaObat) "
                + "VALUES ('" + o.getId() + "', '" + o.getNama() + "', '" + o.getJenis() + "', '" + o.getStok() + "', '" + o.getHarga() + "')";
        
        System.out.println("Adding Obat....");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Obat");
            statement.close();
            
        } catch (Exception e){
            System.out.println("Error adding User...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateObat(Obat o){
        con = dbCon.makeConnection();
            
        String sql = "UPDATE obat SET namaObat = '" + o.getNama() + "', jenisObat = '" + o.getJenis() + "', stokObat = '" + o.getStok()
                + "', hargaObat = '" + o.getHarga() + "' WHERE id_obat = '" + o.getId() + "'";
        
        System.out.println("Editing Obat....");  
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Obat " + o.getId());
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error editing Obat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
            
    }
    
     public void deleteObat(int id){
        con = dbCon.makeConnection();
            
        String sql = "DELETE FROM obat WHERE id_obat = '" + id + "'";
        System.out.println("Deleting Obat.....");
            
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Obat " + id );
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error close Obat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
    }
    
    public List<Obat> showObat(String query){
        con = dbCon.makeConnection();
            
        String sql = "SELECT * FROM obat WHERE(id_obat LIKE '%" + query + "%'"
                + " OR namaObat LIKE '%" + query + "%'"
                + " OR jenisObat LIKE '%" + query + "%'"
                + " OR stokObat LIKE '%" + query + "%'"
                + " OR hargaObat LIKE '%" + query + "%')";
        System.out.println("Mengambil data Obat....");
            
        List<Obat> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                
            if(rs != null){
                while(rs.next()){
                    Obat o = new Obat(
                            Integer.parseInt(rs.getString("id_obat")),
                            rs.getString("namaObat"),
                            rs.getString("jenisObat"),
                            Integer.parseInt(rs.getString("stokObat")),
                            Integer.parseInt(rs.getString("hargaObat")));
                    list.add(o);
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
    
    public Obat searchObat(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM user WHERE id_obat = '" + id + "'";
        System.out.println("Searching Obat...");
        Obat o = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()) {
                    o = new Obat(
                            Integer.parseInt(rs.getString("id_obat")),
                            rs.getString("namaObat"),
                            rs.getString("jenisObat"),
                            Integer.parseInt(rs.getString("stokObat")),
                            Integer.parseInt(rs.getString("hargaObat")));
                }
            }
            rs.close();
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return o; 
    }
    
}
