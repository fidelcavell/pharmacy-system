/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.PenambahanDAO;
import model.Penambahan;
import java.util.List;
import table.TablePenambahan;
/**
 *
 * 
 */
public class PenambahanControl {
    private PenambahanDAO nDAO = new PenambahanDAO();
    
    public void insertDataPenambahan(Penambahan n){
        nDAO.insertPenambahan(n);
    }
    
    public void updateDataPenambahan(Penambahan n){
        nDAO.updatePenambahan(n);
    }
    
    public void deleteDataPenambahan(int id){
        nDAO.deletePenambahan(id);
    }
    
    public TablePenambahan showDataPenambahan(String query){
        List<Penambahan> dataTambah = nDAO.showPenambahan(query);
        TablePenambahan tablePenambahan = new TablePenambahan(dataTambah);
        
        return tablePenambahan;
    }
}
