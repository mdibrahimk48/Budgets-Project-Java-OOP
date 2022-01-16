
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AccountDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.TransferTable.TransferTableModel;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.TransferTable;
import java.util.ArrayList;

import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TransferDetailsForm extends javax.swing.JInternalFrame {

    public TransferDetailsForm() {
        
        initComponents();
        loadAccountFrom();
        loadAccountTo();
        
        transferInformationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            
            public void valueChanged(ListSelectionEvent lse) {
               int selectedRow = transferInformationTable.getSelectedRow();
               if(selectedRow >=0){
                   TransferTable transferTableDetails = transferTableModel.getTransferTable(selectedRow);
                   if(transferTableDetails != null){
                       
                        transferDateChooser.setDate(transferTableDetails.getTransferDate());
                        transferFromComboBox.setSelectedItem(transferTableDetails.getAccountFrom());
                        transferToComboBox.setSelectedItem(transferTableDetails.getAccountTo());
                        amountTextField.setText(transferTableDetails.getAmount().toString());;
                        transferDetailsTextArea.setText(transferTableDetails.getTransferDetails());
                   }
                }
            }   
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        transferDateLabel = new javax.swing.JLabel();
        toTransferLabel = new javax.swing.JLabel();
        transferDateChooser = new com.toedter.calendar.JDateChooser();
        transferToComboBox = new javax.swing.JComboBox<AccountTable>();
        fromTransferLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        transferFromComboBox = new javax.swing.JComboBox<AccountTable>();
        jScrollPane1 = new javax.swing.JScrollPane();
        transferDetailsTextArea = new javax.swing.JTextArea();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        transferTableModel=new TransferTableModel();
        transferInformationTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Transfer Details Form");

        contentPanel.setBackground(new java.awt.Color(102, 204, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        contentPanel.setPreferredSize(new java.awt.Dimension(720, 402));

        transferDateLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        transferDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transferDateLabel.setText("Date:");

        toTransferLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        toTransferLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toTransferLabel.setText("Transfer To:");

        transferDateChooser.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        transferToComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        transferToComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fromTransferLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        fromTransferLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fromTransferLabel.setText("Transfer From:");

        amountLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("Amount:");

        amountTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        transferFromComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        transferFromComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        transferDetailsTextArea.setColumns(20);
        transferDetailsTextArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        transferDetailsTextArea.setRows(5);
        transferDetailsTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transfer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT Black", 3, 14))); // NOI18N
        jScrollPane1.setViewportView(transferDetailsTextArea);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromTransferLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(toTransferLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(transferFromComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transferDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(transferToComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountTextField)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transferDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromTransferLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferToComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toTransferLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonPanel.setBackground(new java.awt.Color(102, 204, 255));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        addButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        removeButton.setText("REMOVE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(clearButton)
                .addGap(23, 23, 23)
                .addComponent(removeButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, clearButton, removeButton});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(removeButton)
                    .addComponent(addButton)
                    .addComponent(updateButton))
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, clearButton, removeButton, updateButton});

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        transferInformationTable.setBackground(new java.awt.Color(102, 204, 255));
        transferInformationTable.setBorder(new javax.swing.border.MatteBorder(null));
        transferInformationTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        transferInformationTable.setModel(transferTableModel);
        transferInformationTable.setRowHeight(25);
        transferInformationTable.setRowMargin(2);
        jScrollPane2.setViewportView(transferInformationTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(469, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        TransferTable transferTable=new TransferTable();
        
        transferTable.setId(UUID.randomUUID().toString());

        
        //Validation of Field
        if(transferDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Chhose a Date for Transfer");
            return;
        }if(amountTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Transfer Amount");
            return;
        }else if (amountTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "Amount Field Cannot Contain Any Alphabate.");
             return;
        }if(transferDetailsTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Transfer Details");
            return;
        }if(Double.parseDouble(amountTextField.getText())<0){
            JOptionPane.showMessageDialog(this, "Amount Cannot Be Negative.");
            return;
        }

        
        transferTable.setTransferDate(transferDateChooser.getDate());
        transferTable.setAccountFrom((AccountTable)transferFromComboBox.getSelectedItem());
        transferTable.setAccountTo((AccountTable)transferToComboBox.getSelectedItem());
        transferTable.setAmount(Double.parseDouble(amountTextField.getText()));
        transferTable.setTransferDetails(transferDetailsTextArea.getText());

        transferTableModel.addRow(transferTable);
        clear();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        int selectedRow = transferInformationTable.getSelectedRow();

        if(selectedRow >= 0){
            transferTableModel.deleteRow(selectedRow);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        int selectedRow = transferInformationTable.getSelectedRow();

        if(selectedRow >= 0){
            TransferTable transferTable= transferTableModel.getTransferTable(selectedRow);
            //Validation of Field
        if(transferDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(this, "Please Chhose a Date for Transfer");
            return;
        }
        if(amountTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Transfer Amount");
            return;
        }else if (amountTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "Amount Field Cannot Contain Any Alphabate.");
             return;
        }if(Double.parseDouble(amountTextField.getText())<0){
            JOptionPane.showMessageDialog(this, "Amount Cannot Be Negative.");
            return;
        }if(transferDetailsTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Transfer Details");
            return;
        }
        
        
        transferTable.setTransferDate(transferDateChooser.getDate());
        transferTable.setAccountFrom((AccountTable)transferFromComboBox.getSelectedItem());
        transferTable.setAccountTo((AccountTable)transferToComboBox.getSelectedItem());
        transferTable.setAmount(Double.parseDouble(amountTextField.getText()));
        transferTable.setTransferDetails(transferDetailsTextArea.getText());
            
        transferTableModel.updateRow(selectedRow, transferTable);
        
        clear();
        }else{
            JOptionPane.showMessageDialog(this, "For Upadate Please Select a Row First.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    public void clear(){
        
        transferDateChooser.setDate(null);
        transferFromComboBox.setSelectedIndex(0);
        transferToComboBox.setSelectedIndex(0);
        amountTextField.setText("");
        transferDetailsTextArea.setText("");
        
    }
    
    public void loadAccountFrom(){
        
        ArrayList<AccountTable> accountList = AccountDataManager.load();
        transferFromComboBox.removeAllItems();
        
        if(accountList != null){
            for(int i = 0; i < accountList.size(); i++){
                AccountTable accountTable = accountList.get(i);
                transferFromComboBox.addItem(accountList.get(i));
            }
        }
    }
    
    public void loadAccountTo(){
        
        ArrayList<AccountTable> accountList = AccountDataManager.load();
        transferToComboBox.removeAllItems();
        
        if(accountList != null){
            for(int i = 0; i < accountList.size(); i++){
                AccountTable accountTable = accountList.get(i);
                transferToComboBox.addItem(accountList.get(i));
            }
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel fromTransferLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel toTransferLabel;
    private com.toedter.calendar.JDateChooser transferDateChooser;
    private javax.swing.JLabel transferDateLabel;
    private javax.swing.JTextArea transferDetailsTextArea;
    private javax.swing.JComboBox<AccountTable> transferFromComboBox;
    private javax.swing.JTable transferInformationTable;
    private javax.swing.JComboBox<AccountTable> transferToComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    private TransferTableModel transferTableModel;
}
