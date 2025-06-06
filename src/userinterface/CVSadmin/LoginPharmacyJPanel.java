package userinterface.CVSadmin;

import business.Pharmacy;
import business.PharmacyDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class LoginPharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugsJPanel
     */
    private JPanel userProcessContainer;
    private PharmacyDirectory pharmaDirectory;
    public LoginPharmacyJPanel(JPanel userProcessContainer,PharmacyDirectory pharmaDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.pharmaDirectory = pharmaDirectory;
        initComponents();
        pharmaListJComboBox.removeAllItems();
        
        for(Pharmacy p : pharmaDirectory.getStoreList())
        {
            pharmaListJComboBox.addItem(p);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pharmaListJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        goJButton = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setText("Pharmacy company");

        pharmaListJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pharmaListJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmaListJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Login Pharmacy Manage Drugs");

        goJButton.setText("GO>>");
        goJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goJButtonActionPerformed(evt);
            }
        });

        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(pharmaListJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(goJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backbtn)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pharmaListJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goJButtonActionPerformed
        // TODO add your handling code here:
        Pharmacy pharmacy = (Pharmacy) pharmaListJComboBox.getSelectedItem();
        ViewPharmacyCompany viewPharmacy = new ViewPharmacyCompany(userProcessContainer,pharmacy);
        userProcessContainer.add("viewPharmacy",viewPharmacy);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_goJButtonActionPerformed

    private void pharmaListJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmaListJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pharmaListJComboBoxActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton goJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox pharmaListJComboBox;
    // End of variables declaration//GEN-END:variables
}
