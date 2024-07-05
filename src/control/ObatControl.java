/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ObatDAO;
import model.Obat;
import java.util.List;
import table.TableObat;
/**
 *
 * 
 */
public class ObatControl {
    private ObatDAO oDAO = new ObatDAO();
    
    public void insertDataObat(Obat o){
        oDAO.insertObat(o);
    }
    
    public void updateDataObat(Obat o){
        oDAO.updateObat(o);
    }
    
    public void deleteDataObat(int id){
        oDAO.deleteObat(id);
    }
    
    public TableObat showDataObat(String query){
        List<Obat> dataObat = oDAO.showObat(query);
        TableObat tableObat = new TableObat(dataObat);
        
        return tableObat;
    }
}
