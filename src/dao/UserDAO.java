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
/**
 *
 * 
 */
public class UserDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertUser(User u){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO user(userName, password, jenisAkses, nama) "
                + "VALUES ('" + u.getUserName() + "', '" + u.getPassword() + "', '" + u.getJenisAkses() + "', '" + u.getNama() + "')";
        
        System.out.println("Adding User....");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " User");
            statement.close();
            
        } catch (Exception e){
            System.out.println("Error adding User...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateUser(User u){
        con = dbCon.makeConnection();
            
        String sql = "UPDATE user SET password = '" + u.getPassword() + "', " + "jenisAkses = '" + u.getJenisAkses() + "', "
                + "nama = '" + u.getNama() + "' " + "WHERE userName = '" + u.getUserName() + "'";
        
        System.out.println("Editing User....");  
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " User " + u.getUserName());
            statement.close();
            
        }catch(Exception e){
            System.out.println("Eror editing User...");
            System.out.println(e);
        }
        dbCon.closeConnection();
            
    }
    
     public void deleteUser(String userName){
        con = dbCon.makeConnection();
            
        String sql = "DELETE FROM user WHERE userName = '" + userName + "'";
        System.out.println("Deleting User.....");
            
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " User " + userName );
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error close User...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
    }
    
    public List<User> showUser(){
        con = dbCon.makeConnection();
            
        String sql = "SELECT * FROM user";
        System.out.println("Mengambil data User....");
            
        List<User> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                
            if(rs != null){
                while(rs.next()){
                    User u = new User(
                            rs.getString("userName"),
                            rs.getString("password"),
                            rs.getString("jenisAkses"),
                            rs.getString("nama"));
                    list.add(u);
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
    
    public User searchUser(String userName, String password){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM user WHERE userName = '" + userName + "' AND password = '" + password + "'";
        System.out.println("Searching User...");
        User u = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()) {
                    u = new User(
                            rs.getString("userName"),
                            rs.getString("password"),
                            rs.getString("jenisAkses"),
                            rs.getString("nama"));    
                }
            }
            rs.close();
            statement.close();
            
        } catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return u;       
    }
    
     
    
}
