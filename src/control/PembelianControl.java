/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.PembelianDAO;
import model.Pembelian;
import table.TablePembelian;
import java.util.List;
/**
 *
 * 
 */
public class PembelianControl {
    private PembelianDAO bDAO = new PembelianDAO();
    
    public void insertDataPembelian(Pembelian b){
        bDAO.insertPembelian(b);
    }
    
    public void updateDataPembelian(Pembelian b, int id){
        bDAO.updatePembelian(b, id);
    }
    
    public void deleteDataPembelian(int id){
        bDAO.deletePembelian(id);
    }
    
    public TablePembelian showDataPembelian(String query){
        List<Pembelian> dataPembelian = bDAO.showPembelianBySearch(query);
        TablePembelian tablePembelian = new TablePembelian(dataPembelian);
        
        return tablePembelian;
    }
}
