/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pembelian;
/**
 *
 * 
 */
public class TablePembelian extends AbstractTableModel{
    private List<Pembelian> list;
    
    public TablePembelian(List<Pembelian> list){
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return list.get(rowIndex).getId();
            case 1 :
                return list.get(rowIndex).getObat().getNama();
            case 2 :
                return list.get(rowIndex).getJumlahBeli();
            case 3 :
                return list.get(rowIndex).getObat().getHarga();
            case 4 :
                return list.get(rowIndex).getTotalHarga();
            case 5 :
                return list.get(rowIndex).getUser().getUserName();
            default :
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0 :
                return "Id Pembelian";
            case 1 :
                return "Nama Obat";
            case 2 :
                return "Jumlah Pembelian";
            case 3 :
                return "Harga Obat";
            case 4 :
                return "Total Harga";
            case 5 :
                return "UserName";
            default :
                return null;
        }
    }
    
}
