/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.PembelianControl;
import control.ObatControl;
import exception.InputanKosongException;
import exception.QuantityException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Obat;
import model.User;
import model.Pembelian;
import table.TableObat;
/**
 *
 * 
 */
public class PembelianView extends javax.swing.JFrame {

    /**
     * Creates new form PembelianView
     */
    private PembelianControl pembelianControl;
    private ObatControl obatControl;
    Pembelian b;
    Obat o;
    User u;
    
    public PembelianView() {
        initComponents();
        pembelianControl = new PembelianControl();
        obatControl = new ObatControl();
        
        setComponent(false);
        clearText();
        showDataObat();
    }
    
    public void setUser(String userName, String password, String jenisAkses, String nama){
        userNameLabel.setText(userName);
        passwordLabel.setText(password);
        jenisAksesLabel.setText(jenisAkses);
        namaUserLabel.setText(nama);
        
        namaUserLabel.setVisible(false);
        passwordLabel.setVisible(false);
        jenisAksesLabel.setVisible(false);
        u = new User(userNameLabel.getText(), passwordLabel.getText(), jenisAksesLabel.getText(), namaUserLabel.getText());
    }
    
    public void setComponent(boolean value){
        idInput.setEnabled(value);
        namaObatInput.setEnabled(value);
        jenisObatInput.setEnabled(value);
        hargaInput.setEnabled(value);
        stokObatInput.setEnabled(value);
        jumlahBeliInput.setEnabled(value);
        
    }
    
    public void clearText(){
        idInput.setText("");
        namaObatInput.setText("");
        jenisObatInput.setText("");
        hargaInput.setText("");
        jumlahBeliInput.setText("");
        
        searchInput.setText("");
    }
    
    public void showDataObat(){
        obatTable.setModel(obatControl.showDataObat(""));
    }
    
    public void inputanKosongException() throws InputanKosongException {
        if(jumlahBeliInput.getText().isEmpty()){
            throw new InputanKosongException();
        }
    }
    
    public void quantityException() throws QuantityException {
        if(Integer.parseInt(jumlahBeliInput.getText()) > Integer.parseInt(stokObatInput.getText())){
            throw new QuantityException();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPembelianPanel = new javax.swing.JPanel();
        topPembelianPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        idObatLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        namaObatLabel = new javax.swing.JLabel();
        namaObatInput = new javax.swing.JTextField();
        jenisLabel = new javax.swing.JLabel();
        jenisObatInput = new javax.swing.JTextField();
        hargaLabel = new javax.swing.JLabel();
        hargaInput = new javax.swing.JTextField();
        jumlahBeliLabel = new javax.swing.JLabel();
        jumlahBeliInput = new javax.swing.JTextField();
        buyBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jenisAksesLabel = new javax.swing.JLabel();
        namaUserLabel = new javax.swing.JLabel();
        stokObatInput = new javax.swing.JTextField();
        stokObatLabel = new javax.swing.JLabel();
        historyBeliBtn = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        obatTable = new javax.swing.JTable();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPembelianPanel.setBackground(new java.awt.Color(255, 153, 153));
        mainPembelianPanel.setPreferredSize(new java.awt.Dimension(900, 500));

        topPembelianPanel.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pembelian");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/basketLogo.png"))); // NOI18N

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setForeground(new java.awt.Color(0, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoutLogo.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPembelianPanelLayout = new javax.swing.GroupLayout(topPembelianPanel);
        topPembelianPanel.setLayout(topPembelianPanelLayout);
        topPembelianPanelLayout.setHorizontalGroup(
            topPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPembelianPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(45, 45, 45))
        );
        topPembelianPanelLayout.setVerticalGroup(
            topPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPembelianPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPembelianPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        inputPanel.setBackground(new java.awt.Color(255, 153, 153));

        idObatLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        idObatLabel.setForeground(new java.awt.Color(0, 0, 0));
        idObatLabel.setText("Id Obat");

        idInput.setBackground(new java.awt.Color(255, 255, 255));

        namaObatLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        namaObatLabel.setForeground(new java.awt.Color(0, 0, 0));
        namaObatLabel.setText("Nama Obat");

        namaObatInput.setBackground(new java.awt.Color(255, 255, 255));

        jenisLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jenisLabel.setForeground(new java.awt.Color(0, 0, 0));
        jenisLabel.setText("Jenis Obat");

        jenisObatInput.setBackground(new java.awt.Color(255, 255, 255));

        hargaLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        hargaLabel.setForeground(new java.awt.Color(0, 0, 0));
        hargaLabel.setText("Harga Obat");

        hargaInput.setBackground(new java.awt.Color(255, 255, 255));

        jumlahBeliLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jumlahBeliLabel.setForeground(new java.awt.Color(0, 0, 0));
        jumlahBeliLabel.setText("Jumlah Beli");

        jumlahBeliInput.setBackground(new java.awt.Color(255, 255, 255));

        buyBtn.setBackground(new java.awt.Color(153, 204, 0));
        buyBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        buyBtn.setForeground(new java.awt.Color(255, 255, 255));
        buyBtn.setText("Buy");
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 102, 0));
        cancelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Welcome Back, ");

        userNameLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        userNameLabel.setText("userName");

        passwordLabel.setText("password");

        jenisAksesLabel.setText("jenisAkses");

        namaUserLabel.setText("namaUser");

        stokObatInput.setBackground(new java.awt.Color(255, 255, 255));

        stokObatLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        stokObatLabel.setForeground(new java.awt.Color(0, 0, 0));
        stokObatLabel.setText("Stok Obat");

        historyBeliBtn.setBackground(new java.awt.Color(255, 204, 102));
        historyBeliBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        historyBeliBtn.setForeground(new java.awt.Color(255, 255, 255));
        historyBeliBtn.setText("History");
        historyBeliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBeliBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jumlahBeliInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(hargaInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stokObatLabel)
                                    .addComponent(stokObatInput, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jenisAksesLabel)
                                        .addGap(0, 9, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(namaUserLabel, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userNameLabel))
                                    .addComponent(hargaLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jumlahBeliLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jenisLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaObatLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idObatLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(namaObatInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jenisObatInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(historyBeliBtn))))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(34, 34, 34))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameLabel))
                .addGap(18, 18, 18)
                .addComponent(idObatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyBeliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaObatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaObatInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisObatInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabel)
                    .addComponent(stokObatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(stokObatInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahBeliLabel)
                    .addComponent(jenisAksesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahBeliInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        tablePanel.setBackground(new java.awt.Color(255, 51, 102));

        obatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        obatTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(obatTable);

        searchInput.setBackground(new java.awt.Color(255, 255, 255));

        searchBtn.setBackground(new java.awt.Color(0, 204, 102));
        searchBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addComponent(searchInput)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addGap(110, 110, 110)))
                .addGap(0, 0, 0))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPembelianPanelLayout = new javax.swing.GroupLayout(mainPembelianPanel);
        mainPembelianPanel.setLayout(mainPembelianPanelLayout);
        mainPembelianPanelLayout.setHorizontalGroup(
            mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPembelianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPembelianPanelLayout.setVerticalGroup(
            mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                .addComponent(topPembelianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPembelianPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPembelianPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        UserLoginView uv = new UserLoginView();
        JOptionPane.showMessageDialog(this, "Logout success");
        this.dispose();
        uv.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try{
            TableObat tObat = obatControl.showDataObat(searchInput.getText());
            if(tObat.getRowCount() == 0){
                clearText();
                JOptionPane.showMessageDialog(this, "Data Obat tidak ditemukan");
            } else{
                obatTable.setModel(tObat);
            }
            clearText();
            
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
        try{
            inputanKosongException();
            quantityException();
            
            int totalHarga = (int) (Double.parseDouble(hargaInput.getText()) * Integer.parseInt(jumlahBeliInput.getText()));

            int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Total Pembelian : " + totalHarga, "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            switch(getAnswer){
            case 0 : 
                // Jika Jawaban User : Yes
                try{
                    int jumlahSelisih = (Integer.parseInt(stokObatInput.getText()) - Integer.parseInt(jumlahBeliInput.getText()));
                    o = new Obat(Integer.parseInt(idInput.getText()), namaObatInput.getText(), jenisObatInput.getText(), jumlahSelisih, Double.parseDouble(hargaInput.getText()));
                    obatControl.updateDataObat(o);
            
                    b = new Pembelian(Integer.parseInt(jumlahBeliInput.getText()), totalHarga, u, o);
                    pembelianControl.insertDataPembelian(b);
                    JOptionPane.showMessageDialog(this, "Obat " + namaObatInput.getText() + " berhasil dibeli");
                   
                } catch(Exception e){
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            
            case 1 :
                // Jika Jawaban User : No
                break;
            }
            jumlahBeliInput.setEnabled(false);
            clearText();
            showDataObat();
            
        } catch(InputanKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
            
        } catch(QuantityException eq){
            JOptionPane.showMessageDialog(this, eq.message());
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Inputan harus angka");
        }
    }//GEN-LAST:event_buyBtnActionPerformed

    private void obatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatTableMouseClicked
        jumlahBeliInput.setEnabled(true);
        
        int clickedRow = obatTable.getSelectedRow();
        TableModel tableModel = obatTable.getModel();
        
        idInput.setText(tableModel.getValueAt(clickedRow, 0).toString());
        namaObatInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        jenisObatInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        hargaInput.setText(tableModel.getValueAt(clickedRow, 3).toString());
        stokObatInput.setText(tableModel.getValueAt(clickedRow, 4).toString());
    }//GEN-LAST:event_obatTableMouseClicked

    private void historyBeliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBeliBtnActionPerformed
        HistoryPembelianView hbv = new HistoryPembelianView();
        this.dispose();
        hbv.setUserName(userNameLabel.getText(), passwordLabel.getText(), jenisAksesLabel.getText(), namaUserLabel.getText());
        hbv.setVisible(true);
    }//GEN-LAST:event_historyBeliBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembelianView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField hargaInput;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JButton historyBeliBtn;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idObatLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jenisAksesLabel;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JTextField jenisObatInput;
    private javax.swing.JTextField jumlahBeliInput;
    private javax.swing.JLabel jumlahBeliLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPembelianPanel;
    private javax.swing.JTextField namaObatInput;
    private javax.swing.JLabel namaObatLabel;
    private javax.swing.JLabel namaUserLabel;
    private javax.swing.JTable obatTable;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField stokObatInput;
    private javax.swing.JLabel stokObatLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel topPembelianPanel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}