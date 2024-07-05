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
import model.Penambahan;
/**
 *
 * 
 */
public class PenambahanDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPenambahan(Penambahan n){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO penambahan(id_update, jumlahTambah, id_obat, userName) "
                + "VALUES ('" + n.getId() + "', '" + n.getJumlahTambah() + "', '" 
                + n.getObat().getId() + "', '" + n.getUser().getUserName() + "')";
        
        System.out.println("Adding Penambahan....");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Penambahan");
            statement.close();
            
        } catch (Exception e){
            System.out.println("Error adding Penambahan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updatePenambahan(Penambahan n){
        con = dbCon.makeConnection();
            
        String sql = "UPDATE user SET id_obat = '" + n.getObat().getId() + "', " + "userName = '" + n.getUser().getUserName() + "', "
                 + "jumlahTambah = '" + n.getJumlahTambah() + "' WHERE id_update = '" + n.getId() + "'";
        
        System.out.println("Editing Penambahan...");  
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Penambahan " + n.getId());
            statement.close();
            
        }catch(Exception e){
            System.out.println("Eror editing Penambahan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
            
    }
    
     public void deletePenambahan(int id){
        con = dbCon.makeConnection();
            
        String sql = "DELETE FROM user WHERE id_update = '" + id + "'";
        System.out.println("Deleting Penambahan.....");
            
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Penambahan " + id );
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error close Penambahan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
    }
    
    public List<Penambahan> showPenambahan(String query){
        con = dbCon.makeConnection();
            
        String sql = "SELECT n.*, o.*, u.* FROM penambahan as n JOIN obat as o ON n.id_obat = o.id_obat JOIN user as u ON n.userName = u.userName WHERE(n.id_update LIKE "
                + "'%" + query + "%'"
                + " OR u.userName LIKE '%" + query + "%'"
                + " OR u.nama LIKE '%" + query + "%'"
                + " OR o.id_obat LIKE '%" + query + "%'"
                + " OR o.namaObat LIKE '%" + query + "%'"
                + " OR o.jenisObat LIKE '%" + query + "%'"
                + " OR n.jumlahTambah LIKE '%" + query + "%')";
        System.out.println("Mengambil data Penambahan....");
            
        List<Penambahan> list = new ArrayList();
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
                    
                    Penambahan n = new Penambahan(
                            Integer.parseInt(rs.getString("n.id_update")),
                            Integer.parseInt(rs.getString("n.jumlahTambah")),
                            u, o);
                    list.add(n);
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
