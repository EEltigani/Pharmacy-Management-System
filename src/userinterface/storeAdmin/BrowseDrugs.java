package userinterface.storeAdmin;


import business.Drug;
import business.MasterOrderCatalog;
import business.Order;
import business.OrderItem;
import business.Pharmacy;
import business.PharmacyDirectory;
import business.Store;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class BrowseDrugs extends javax.swing.JPanel {

    /** Creates new form BrowseDrugs */
    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
   // private MasterOrderCatalog masterOrderCatalog;
    private Store store;
    private Order order;
    boolean isCheckedOut = false;
    
    public BrowseDrugs(JPanel userProcessContainer,PharmacyDirectory pharmacyDirectory,Store store) {
        this.store = store;
        this.userProcessContainer = userProcessContainer;
        this.pharmacyDirectory = pharmacyDirectory;
        initComponents();
        populatePharmacyCombo();
        storeNametxt.setText(store.getStoreName());
     
    }
    public void populatePharmacyCombo(){
        pharmaComboBox1.removeAllItems();
        
        for(Pharmacy pharmacy: pharmacyDirectory.getStoreList())
        {
            pharmaComboBox1.addItem(pharmacy);
        }
        populatePharmaTable();
        //to disply product in d table
        if(!isCheckedOut){
        order = new Order(); //
    }
         
    
    }
        public void populatePharmaTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) drugTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
       Pharmacy pharmacy = (Pharmacy) pharmaComboBox1.getSelectedItem();
       if(pharmacy!=null){
        for (Drug drug : pharmacy.getDrugCatalog().getDrugList())
        {
            Object[] row = new Object[4];
            row[0]=drug;
            row[1]=drug.getDrugID();
            row[2]=drug.getDrugPrice();
            row[3]=drug.getDrugAvailibility();
            
            dtm.addRow(row);
        }
    }
    }
         public void refreshOrderTable(){
        DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
        dtm.setRowCount(0); 
        
        for(OrderItem orderItem : order.getOrderItemList()){
            Object[] row = new Object[4];
            row[0]=orderItem;
            row[1]=orderItem.getSalesPrice();
            row[2]=orderItem.getQuantity();
            row[3]=orderItem.getSalesPrice()*orderItem.getQuantity();
            
            dtm.addRow(row);
        }
        }
    

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        drugTable = new javax.swing.JTable();
        pharmaComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        viewProdjButton2 = new javax.swing.JButton();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        txtNewQuantity = new javax.swing.JTextField();
        errorInkeyword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        storeNametxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 511));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Drug Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 590, 100));

        pharmaComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmaComboBox1ActionPerformed(evt);
            }
        });
        add(pharmaComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pharmacy Company");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pharmacy Drug Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 90, -1));

        viewProdjButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewProdjButton2.setText("View Drug Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });
        add(viewProdjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 50, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btnSearchProduct.setText("Search Drug");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });
        add(btnSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel6.setText("Sales Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, -1));

        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 580, 90));

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });
        add(btnViewOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));
        add(txtSearchKeyWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 140, 110, -1));
        add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 70, -1));

        errorInkeyword.setForeground(new java.awt.Color(255, 0, 0));
        add(errorInkeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 110, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Order items from CVS pharmacy");
        jLabel3.setIconTextGap(7);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        storeNametxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        storeNametxt.setForeground(new java.awt.Color(0, 0, 255));
        storeNametxt.setText("jLabel4");
        add(storeNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pharmaComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmaComboBox1ActionPerformed
        // TODO add your handling code here:
        populatePharmaTable();
        //to make sure products are displayed by default .
        
    }//GEN-LAST:event_pharmaComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //coz if we dont checkout and click back the availblty shud b updated.
        if(order.getOrderItemList().size()>0){
            for(OrderItem oi: order.getOrderItemList()){
                Drug drug = oi.getDrug();
                drug.setDrugAvailibility(oi.getQuantity()+drug.getDrugAvailibility());
                
            }
            order.getOrderItemList().removeAll(order.getOrderItemList());
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row","warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Drug drug = (Drug) drugTable.getValueAt(selectedRow, 0);
        ViewDrugDetailJPanel viewDrugDetails = new ViewDrugDetailJPanel(userProcessContainer,drug);
        userProcessContainer.add("viewDrugDetails",viewDrugDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = drugTable.getSelectedRow();
        Drug selectedDrug;
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row","warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            selectedDrug = (Drug) drugTable.getValueAt(selectedRow, 0);
        }
       
        int salesPrice =0;
        try{
            salesPrice = Integer.parseInt(txtSalesPrice.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "enter valid sales price","warning",JOptionPane.ERROR_MESSAGE);
                    return;
        }
            if (salesPrice < selectedDrug.getDrugPrice()){
                JOptionPane.showMessageDialog(null, "sales price should be greater than supplier price","warning",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
           int fetchQuantity = (Integer)quantitySpinner.getValue();//interger type cast coz getvalue sends a n object wch has to be casted to int
           if(fetchQuantity <=0){
               JOptionPane.showMessageDialog(null, "Please select atleast 1 quantity","warning",JOptionPane.ERROR_MESSAGE);
               return;
           }
           else if(fetchQuantity <= selectedDrug.getDrugAvailibility()){
               boolean alreadyPresent=false;
               for(OrderItem orderItems : order.getOrderItemList()){
                   if (orderItems.getDrug()==selectedDrug){
                       int oldAvailibility = selectedDrug.getDrugAvailibility();
                       int newAvailibility = oldAvailibility - fetchQuantity;
                       selectedDrug.setDrugAvailibility(newAvailibility);
                       orderItems.setQuantity(fetchQuantity + orderItems.getQuantity());
                       refreshOrderTable();
                       populatePharmaTable();
                       alreadyPresent=true;
                       break; //wehn we get the order item v need not traverse the whole list
                   }
               }
               if(!alreadyPresent){
                       int oldAvailibility = selectedDrug.getDrugAvailibility();
                       int newAvailibility = oldAvailibility - fetchQuantity;
                       selectedDrug.setDrugAvailibility((newAvailibility));
                       order.addOrderItem(selectedDrug, fetchQuantity, salesPrice);
                       refreshOrderTable();
                       populatePharmaTable();
               }
           }
               else{
                   JOptionPane.showMessageDialog(null, "Please quty shud b > aval","warning",JOptionPane.ERROR_MESSAGE);
               }
    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if(order.getOrderItemList().size()>=0){
            MasterOrderCatalog masterOrderCatalog = store.getMasterOrderCatalog();
            masterOrderCatalog.addOrder(order);
            isCheckedOut=true;
            order = new Order();//fr next order
            refreshOrderTable();
            populatePharmaTable();
            JOptionPane.showMessageDialog(null, "Items are checked out!","Info",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "No order items present in cart","warning",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"select a row","warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!txtNewQuantity.getText().isEmpty() && !txtNewQuantity.getText().equals("0")){
            OrderItem orderItem = (OrderItem) orderTable.getValueAt(selectedRow, 0);
            int currentAvailibility = orderItem.getDrug().getDrugAvailibility();
            int oldQty = orderItem.getQuantity();
            int newQty = Integer.parseInt(txtNewQuantity.getText());
            
            if(newQty > (currentAvailibility+oldQty)){
                JOptionPane.showMessageDialog(null,"qty is more than the available one","warning",JOptionPane.ERROR_MESSAGE);
            return;
            }
            orderItem.setQuantity(newQty);
            orderItem.getDrug().setDrugAvailibility(currentAvailibility+ (oldQty - newQty));
            
            refreshOrderTable();
            populatePharmaTable();
        }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        
        if(txtSearchKeyWord.getText().trim().length() >= 0){
           try {
               int  drugID = Integer.parseInt(txtSearchKeyWord.getText());
               Drug drug = pharmacyDirectory.searchDrug(drugID);
               if(drug!=null){
               ViewDrugDetailJPanel viewDrugDetail = new ViewDrugDetailJPanel(userProcessContainer, drug);
               userProcessContainer.add("viewDrugDetail",viewDrugDetail);
               CardLayout layout = (CardLayout) userProcessContainer.getLayout();
               layout.next(userProcessContainer);
        }else{ 
        JOptionPane.showMessageDialog(null, "No such drug is present","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
         errorInkeyword.setText("");
            }
            catch(NumberFormatException nfe){
                errorInkeyword.setText("Enter a Drug ID .");
            }
        
        }         
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed

        int selectedRow = orderTable.getSelectedRow();
        
        if(selectedRow<=0){
            JOptionPane.showMessageDialog(null,"select a row","warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        OrderItem orderItem = (OrderItem) orderTable.getValueAt(selectedRow, 0);
        int oldQty = orderItem.getDrug().getDrugAvailibility();
        int newQty = oldQty + orderItem.getQuantity();
        orderItem.getDrug().setDrugAvailibility(newQty);
        order.removeOrderItem(orderItem);
        populatePharmaTable();
        JOptionPane.showMessageDialog(null,"order item is removed successfully","Order item deletion",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed

         int selectedRow =orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row","warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        OrderItem oi =  (OrderItem) orderTable.getValueAt(selectedRow, 0);
        ViewOrderItemDetailJPanel viewOrderItem = new ViewOrderItemDetailJPanel(userProcessContainer,oi);
        userProcessContainer.add("viewOrderItem",viewOrderItem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JTable drugTable;
    private javax.swing.JLabel errorInkeyword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JComboBox pharmaComboBox1;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JLabel storeNametxt;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables
}
