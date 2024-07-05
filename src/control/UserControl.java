/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.UserDAO;
import model.User;
/**
 *
 * 
 */
public class UserControl {
    private UserDAO uDAO = new UserDAO();
    
    public void insertDataUser(User u){
        uDAO.insertUser(u);
    }
    
    public void updateDataUser(User u){
        uDAO.updateUser(u);
    }
    
    public void deleteDataUser(String userName){
        uDAO.deleteUser(userName);
    }
    
    public User searchDataUser(String userName, String password){
        User u = uDAO.searchUser(userName, password);
        return u;
    }
    
    //Table Data user
    // ....
    //
}
