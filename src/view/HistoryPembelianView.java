/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.PembelianControl;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Obat;
import model.User;
import model.Pembelian;
import table.TablePembelian;
/**
 *
 * 
 */
public class HistoryPembelianView extends javax.swing.JFrame {

    /**
     * Creates new form HistoryPembelianView
     */
    private PembelianControl pembelianControl;
    
    public HistoryPembelianView() {
        initComponents();
        pembelianControl= new PembelianControl();
       
    }
    
    public void setUserName(String userName, String password, String jenisAkses, String nama){
        userNameLabel.setText(userName);
        passwordLabel.setText(password);
        jenisAksesLabel.setText(jenisAkses);
        namaUserLabel.setText(nama);
        
        passwordLabel.setVisible(false);
        jenisAksesLabel.setVisible(false);
        namaUserLabel.setVisible(false);
        pembelianTable.setModel(pembelianControl.showDataPembelian(userName));
  
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
        historyTitle = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pembelianTable = new javax.swing.JTable();
        passwordLabel = new javax.swing.JLabel();
        jenisAksesLabel = new javax.swing.JLabel();
        namaUserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPembelianPanel.setBackground(new java.awt.Color(0, 204, 204));
        mainPembelianPanel.setForeground(new java.awt.Color(0, 0, 0));

        historyTitle.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        historyTitle.setForeground(new java.awt.Color(0, 0, 0));
        historyTitle.setText("History Pembelian");

        userNameLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        userNameLabel.setText("userName");

        backBtn.setBackground(new java.awt.Color(204, 204, 0));
        backBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        pembelianTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(pembelianTable);

        passwordLabel.setText("jLabel1");

        jenisAksesLabel.setText("jLabel1");

        namaUserLabel.setText("jLabel1");

        javax.swing.GroupLayout mainPembelianPanelLayout = new javax.swing.GroupLayout(mainPembelianPanel);
        mainPembelianPanel.setLayout(mainPembelianPanelLayout);
        mainPembelianPanelLayout.setHorizontalGroup(
            mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(historyTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenisAksesLabel)
                    .addComponent(namaUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(34, 34, 34))
            .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPembelianPanelLayout.setVerticalGroup(
            mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                .addGroup(mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(historyTitle)
                            .addComponent(userNameLabel)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPembelianPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPembelianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(jenisAksesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namaUserLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPembelianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPembelianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        PembelianView pv = new PembelianView();
        this.dispose();
        pv.setUser(userNameLabel.getText(), passwordLabel.getText(), jenisAksesLabel.getText(), namaUserLabel.getText());
        pv.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryPembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryPembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryPembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryPembelianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryPembelianView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel historyTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jenisAksesLabel;
    private javax.swing.JPanel mainPembelianPanel;
    private javax.swing.JLabel namaUserLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTable pembelianTable;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}