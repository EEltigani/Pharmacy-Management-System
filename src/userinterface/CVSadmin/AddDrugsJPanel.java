
package userinterface.CVSadmin;

import business.Drug;
import business.DrugCatalog;
import business.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AddDrugsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugsJPanel
     */
    private JPanel userProcessContainer;
    private DrugCatalog drugCatalog;
    private Validator validator;
    public AddDrugsJPanel(JPanel userProcessContainer,DrugCatalog drugCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.drugCatalog = drugCatalog;
    }
    
    private void backAction() {
        
        //add refresh button and also call populateTable
    userProcessContainer.remove(this);
    Component[] componentArray = userProcessContainer.getComponents();
    Component component = componentArray[componentArray.length - 1 ];
    ViewPharmacyCompany viewpharmaPanel = (ViewPharmacyCompany) component;
    viewpharmaPanel.populateTable();
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        drugIDJTextField = new javax.swing.JTextField();
        drugNameJTextField = new javax.swing.JTextField();
        drugTypeJTextField = new javax.swing.JTextField();
        drugDescJTextField = new javax.swing.JTextField();
        manufacturingDateJTextField = new javax.swing.JTextField();
        expirationDateJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        drugAvailibilityJTextField = new javax.swing.JTextField();
        priceJTextField = new javax.swing.JTextField();
        compositionJTextField = new javax.swing.JTextField();
        colorrDrugJTextField = new javax.swing.JTextField();
        createDrugJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        errDrugNamejLabel = new javax.swing.JLabel();
        errDrugTypejLabel1 = new javax.swing.JLabel();
        errDrugDescjLabel2 = new javax.swing.JLabel();
        errMdatejLabel3 = new javax.swing.JLabel();
        errEDatejLabel4 = new javax.swing.JLabel();
        errPricejLabel5 = new javax.swing.JLabel();
        errCompositionjLabel6 = new javax.swing.JLabel();
        errQtyjLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Add Drug Details");

        jLabel2.setText("Drug ID");

        jLabel3.setText("Drug Name");

        jLabel4.setText("Drug Type");

        jLabel5.setText("Drug Description");

        jLabel6.setText("Manufacturing Date");

        jLabel7.setText("Expiration Date");

        drugIDJTextField.setEnabled(false);

        jLabel8.setText("Quantity");

        jLabel9.setText("Price");

        jLabel10.setText("Composition");

        jLabel11.setText("Drug color");

        createDrugJButton.setText("Create Drug");
        createDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDrugJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        errDrugNamejLabel.setForeground(new java.awt.Color(255, 0, 0));

        errDrugTypejLabel1.setForeground(new java.awt.Color(255, 0, 0));

        errDrugDescjLabel2.setForeground(new java.awt.Color(255, 0, 0));

        errMdatejLabel3.setForeground(new java.awt.Color(255, 0, 0));

        errEDatejLabel4.setForeground(new java.awt.Color(255, 0, 0));

        errPricejLabel5.setForeground(new java.awt.Color(255, 0, 0));

        errCompositionjLabel6.setForeground(new java.awt.Color(255, 0, 0));

        errQtyjLabel7.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(createDrugJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(drugTypeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                        .addComponent(drugIDJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(drugNameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(drugDescJTextField)
                                        .addComponent(manufacturingDateJTextField)
                                        .addComponent(expirationDateJTextField))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addComponent(errDrugTypejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errDrugDescjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(errMdatejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel11))
                                .addComponent(errEDatejLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errDrugNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errPricejLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(priceJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addComponent(drugAvailibilityJTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(compositionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorrDrugJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errCompositionjLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errQtyjLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(drugIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(drugAvailibilityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(errQtyjLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(drugNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(errDrugNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errPricejLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(drugTypeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(compositionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errDrugTypejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errCompositionjLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(drugDescJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errDrugDescjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(manufacturingDateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(errMdatejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(colorrDrugJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(expirationDateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errEDatejLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDrugJButton)
                    .addComponent(jButton1))
                .addGap(159, 159, 159))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDrugJButtonActionPerformed
        
        String drugName = drugNameJTextField.getText();
        String drugDesc = drugDescJTextField.getText();
        
        String drugType = drugTypeJTextField.getText();
        String composition = compositionJTextField.getText();
        
        String manufacturingDate =manufacturingDateJTextField.getText();
        String expiryDate = expirationDateJTextField.getText();
        
        
        validator = new Validator();
        
        Drug drug =  new Drug();
        
        ArrayList<String> errorArray = new ArrayList();
        
        if(validator.isStringValid(drugName)){
            drug.setDrugName(drugName);
             errDrugNamejLabel.setText("");
        }
        else
        {
           errorArray.add("Drug Name");
           
           
        }
        
         if(validator.isStringValid(drugType)){
           drug.setDrugType(drugType);
            errDrugTypejLabel1.setText("");
        }
        else
        {
            errorArray.add("Drug Type");
            //errDrugTypejLabel1.setText("Drug type  cannot be empty");
            
        }
        if(validator.isStringValid(composition)){
           drug.setComposition(composition);
            errCompositionjLabel6.setText("");
        }
        else
        {
            errorArray.add("Composition");
            //errCompositionjLabel6.setText("Composition  cannot be empty");
        }
        
        if((validator.isStringValid(drugAvailibilityJTextField.getText())) &&
                (validator.isValidInteger(drugAvailibilityJTextField.getText())) ){
            int drugAvailibility = Integer.parseInt(drugAvailibilityJTextField.getText());
           drug.setDrugAvailibility(drugAvailibility);
           errQtyjLabel7.setText("");
        }
        else
        {
            errorArray.add("Quantity ");
            //errQtyjLabel7.setText("Enter a valid availability");
        }
        if((validator.isStringValid(priceJTextField.getText())) && 
                (validator.isValidInteger(priceJTextField.getText())) ){
           /* try {
                int drugPrice = Integer.parseInt(priceJTextField.getText());
                 drug.setDrugPrice(drugPrice);
            }
            catch(NumberFormatException nfe){
                errPricejLabel5.setText("Enter a integer value");
            }*/
            int drugPrice = Integer.parseInt(priceJTextField.getText());
            drug.setDrugPrice(Integer.parseInt(priceJTextField.getText()));
            
          errPricejLabel5.setText("");
        }
        else
        {
            errorArray.add("Price");
           // errPricejLabel5.setText("Enter a valid Price");
        }
        
        if(validator.isStringValid(drugDesc)){
          drug.setDrugDescription(drugDesc);
          errDrugDescjLabel2.setText("");
        }
        else
        {
            errorArray.add("Drug description");
            //errDrugDescjLabel2.setText("Drug description cannot be empty");
        }
        if(validator.isStringValid(expiryDate)){
           drug.setExpirationDate(expiryDate);
            errEDatejLabel4.setText("");
        }
        else
        {
            errorArray.add("Expiry date");
           // errEDatejLabel4.setText("Expiration Date cannot be empty");
        }
        if(validator.isStringValid(manufacturingDate)){
            drug.setManufacturedDate(manufacturingDate);
            errMdatejLabel3.setText("");
        }
        else
        {
            errorArray.add("Manufacturing Date");
            //errMdatejLabel3.setText("Manufactured Date cannot be empty");
        }
        
        //Check is done if the errorArray contains error messages
        if(!errorArray.isEmpty()){
        
        String message = "";
        //Iterate the errorListArray with foreach
        for( String error : errorArray )
            {
                message += error + " \n";
            }
            JOptionPane.showMessageDialog(null,message +"are empty fields. Please enter the values.","Error ",JOptionPane.ERROR_MESSAGE);   
        }
        else{
            drugCatalog.addDrugs(drug);
        JOptionPane.showMessageDialog(null, "Store is added","Store Addition",JOptionPane.INFORMATION_MESSAGE);       
        
        }
        
      /*  
        if(!validator.isStringValid(drugName) && 
                !validator.isStringValid(drugType) && 
                !validator.isStringValid(composition) && 
                (!validator.isStringValid(drugAvailibilityJTextField.getText()))
                && (!validator.isStringValid(priceJTextField.getText())) && 
                !validator.isStringValid(drugDesc) && !validator.isStringValid(expiryDate)
                && !validator.isStringValid(manufacturingDate))
                
        { 
        JOptionPane.showMessageDialog(null, "Drug added","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        */
    }//GEN-LAST:event_createDrugJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
                backAction();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField colorrDrugJTextField;
    private javax.swing.JTextField compositionJTextField;
    private javax.swing.JButton createDrugJButton;
    private javax.swing.JTextField drugAvailibilityJTextField;
    private javax.swing.JTextField drugDescJTextField;
    private javax.swing.JTextField drugIDJTextField;
    private javax.swing.JTextField drugNameJTextField;
    private javax.swing.JTextField drugTypeJTextField;
    private javax.swing.JLabel errCompositionjLabel6;
    private javax.swing.JLabel errDrugDescjLabel2;
    private javax.swing.JLabel errDrugNamejLabel;
    private javax.swing.JLabel errDrugTypejLabel1;
    private javax.swing.JLabel errEDatejLabel4;
    private javax.swing.JLabel errMdatejLabel3;
    private javax.swing.JLabel errPricejLabel5;
    private javax.swing.JLabel errQtyjLabel7;
    private javax.swing.JTextField expirationDateJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField manufacturingDateJTextField;
    private javax.swing.JTextField priceJTextField;
    // End of variables declaration//GEN-END:variables

    
}
