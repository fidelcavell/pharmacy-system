/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Penambahan;
/**
 *
 * 
 */
public class TablePenambahan extends AbstractTableModel{
    private List<Penambahan> list;
    
    public TablePenambahan(List<Penambahan> list){
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
                return list.get(rowIndex).getObat().getJenis();
            case 3 :
                return list.get(rowIndex).getObat().getHarga();
            case 4 :
                return list.get(rowIndex).getJumlahTambah();
            case 5 :
                return list.get(rowIndex).getUser().getUserName();
            case 6 :
                return list.get(rowIndex).getObat().getId();
            default :
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0 :
                return "Id Tambah";
            case 1 :
                return "Nama Obat";
            case 2 :
                return "Jenis Obat";
            case 3 :
                return "Harga Obat";
            case 4 :
                return "Jumlah Tambah";
            case 5 :
                return "UserName";
            default :
                return null;
        }
    }
    
}
