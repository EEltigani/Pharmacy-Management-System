package userinterface.CVSadmin;

import business.PharmacyDirectory;
import business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
    private StoreDirectory storeDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,  PharmacyDirectory pharmacyDirectory,StoreDirectory storeDirectory) {
        initComponents();
        this.pharmacyDirectory = pharmacyDirectory;
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory = storeDirectory;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePharmacyJButton = new javax.swing.JButton();
        manageStoreJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");

        managePharmacyJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePharmacyJButton.setText("Manage Pharmacy Company >>");
        managePharmacyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyJButtonActionPerformed(evt);
            }
        });

        manageStoreJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageStoreJButton.setText("Manage Stores >>");
        manageStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageStoreJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managePharmacyJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack)))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(managePharmacyJButton)
                .addGap(32, 32, 32)
                .addComponent(manageStoreJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePharmacyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyJButtonActionPerformed
        ManagePharmacy mp = new ManagePharmacy(userProcessContainer,pharmacyDirectory);
        userProcessContainer.add("manage Pharmacy",mp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePharmacyJButtonActionPerformed

    private void manageStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreJButtonActionPerformed
        // TODO add your handling code here:
        ManageStores manageStore = new ManageStores(userProcessContainer, storeDirectory);
        userProcessContainer.add("manage Store",manageStore);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageStoreJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePharmacyJButton;
    private javax.swing.JButton manageStoreJButton;
    // End of variables declaration//GEN-END:variables
    
}
