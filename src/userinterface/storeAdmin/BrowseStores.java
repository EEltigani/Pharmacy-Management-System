package userinterface.storeAdmin;

import business.Order;
import business.OrderItem;
import business.Pharmacy;
import business.Store;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BrowseStores extends javax.swing.JPanel {

    /**
     * Creates new form BrowseStores
     */
    private JPanel userProcessContainer;
    private Store store;
    private static final int THRESHHOLD_QTY = 10;
    public BrowseStores(JPanel userProcessContainer,Store store) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.store = store;
        
        populateOrdersCombo();
    }

     public void populateOrdersCombo(){
        orderTableComboBox.removeAllItems();
        
        for(Order order: store.getMasterOrderCatalog().getOrderCatalog())
        {
            orderTableComboBox.addItem(order);
        }
        refreshOrderTable();
    }
     
     public void refreshOrderTable(){
        DefaultTableModel dtm = (DefaultTableModel) orderTable1.getModel();
        dtm.setRowCount(0); 
        
        Order order = (Order) orderTableComboBox.getSelectedItem();
        if(order!=null){
        for(OrderItem orderItem : order.getOrderItemList()){
            Object[] row = new Object[5];
            row[0]=orderItem;
            row[1]=orderItem.getSalesPrice();
            row[2]=orderItem.getQuantity();
            row[3]=orderItem.getSalesPrice()*orderItem.getQuantity();
            if(!showThreshold(orderItem.getQuantity())){
                row[4]="Order more Stock";
            }
            else{
                row[4]="Sufficient Stock";
            }
             dtm.addRow(row);
        }
        }
        /*else{
           JOptionPane.showMessageDialog(null, "No order was placed.Place an order.","Warning",JOptionPane.ERROR_MESSAGE);
                }*/
     }
    
     public boolean showThreshold(int Qty){
         
         if(THRESHHOLD_QTY < Qty)
         {
             return true;
         }
         return false;
     }

     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        orderTableComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable1 = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Browse Store");

        orderTableComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orderTableComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTableComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Order Number :");

        orderTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount", "Threshold Statusl"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable1);

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        jLabel7.setText("Item in this order");

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
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnViewOrderItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backbtn)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewOrderItem)
                .addGap(39, 39, 39)
                .addComponent(backbtn)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed

        int selectedRow =orderTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row","warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        OrderItem oi =  (OrderItem) orderTable1.getValueAt(selectedRow, 0);
        ViewOrderItemDetailJPanel viewOrderItem = new ViewOrderItemDetailJPanel(userProcessContainer,oi);
        userProcessContainer.add("viewOrderItem",viewOrderItem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void orderTableComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderTableComboBoxActionPerformed
        // TODO add your handling code here:
        refreshOrderTable();
    }//GEN-LAST:event_orderTableComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable1;
    private javax.swing.JComboBox orderTableComboBox;
    // End of variables declaration//GEN-END:variables
}
