package userinterface.CVSadmin;

import business.Pharmacy;
import business.Store;
import business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageStores extends javax.swing.JPanel {

    /**
     * Creates new form ManageStores
     */
    private JPanel userProcessContainer;
    private StoreDirectory storeDirectory;
    public ManageStores(JPanel userProcessContainer, StoreDirectory storeDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory =storeDirectory;
        
        populateTable();
    }
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) storeTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Store  store : storeDirectory.getStoreList())
        {
            Object[] row = new Object[2];
            row[0]=store;
            row[1]=store.getStoreLocation();
            dtm.addRow(row);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        storeTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnAddStore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        storeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Store Name", "Store Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storeTable);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAddStore.setText("Add Stores");
        btnAddStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStoreActionPerformed(evt);
            }
        });

        jLabel1.setText("Manage Store");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStore)
                    .addComponent(btnRemove))
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(161, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(btnRemove)
                .addGap(18, 18, 18)
                .addComponent(btnAddStore)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)
                    .addComponent(btnBack)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = storeTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to view","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Please confirm to delete", "Delete confirmation", JOptionPane.WARNING_MESSAGE);
        if(dialogResult == JOptionPane.YES_OPTION){
            Store  store = (Store) storeTable.getValueAt(selectedRow, 0);
            storeDirectory.removeStore(store);
            populateTable();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStoreActionPerformed
        AddStore addStore = new AddStore(userProcessContainer,storeDirectory);
        userProcessContainer.add("add store",addStore);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddStoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStore;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable storeTable;
    // End of variables declaration//GEN-END:variables
}
