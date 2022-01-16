
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.AccountTable.AccountTableModel;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AccountDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.LoggedInUser;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.apache.commons.validator.GenericValidator;

public class AccountInformationForm extends javax.swing.JInternalFrame {

    public AccountInformationForm() {
        initComponents();
        initialAmountTextField.setText("500.00");
        
        accountInformationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent lse) {
               int selectedRow = accountInformationTable.getSelectedRow();
               if(selectedRow >=0){
                   AccountTable accountTableDetails = accountTableModel.getAccountTable(selectedRow);
                   if(accountTableDetails != null){
                       
                    selectAccountTypeComboBox.setSelectedItem(accountTableDetails.getSelectAccountType());
                    accountNameTextField.setText(accountTableDetails.getAccountName());
                    accountNoTextField.setText(accountTableDetails.getAccountNo());
                    bankNameTextField.setText(accountTableDetails.getBankName());
                    accountHolderNameTextField.setText(accountTableDetails.getAccountHolderName());
                    occupationDetailsTextField.setText(accountTableDetails.getOccupationDetails());
                    initialAmountTextField.setText(String.valueOf(accountTableDetails.getInitialAmount()));
                    billingDateChooser.setDate(accountTableDetails.getBillingDate());
                    paymentDateChooser.setDate(accountTableDetails.getPaymentDate());
                    notesTextArea.setText(accountTableDetails.getNotes());
                   }
                }
            }   
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        selectAccountTypeLabel = new javax.swing.JLabel();
        accountNameLabel = new javax.swing.JLabel();
        accountNameTextField = new javax.swing.JTextField();
        accountNoLabel = new javax.swing.JLabel();
        accountNoTextField = new javax.swing.JTextField();
        bankNameLabel = new javax.swing.JLabel();
        bankNameTextField = new javax.swing.JTextField();
        accountHolderNameLabel = new javax.swing.JLabel();
        occupationDetailsLabel = new javax.swing.JLabel();
        occupationDetailsTextField = new javax.swing.JTextField();
        billingDateLabel = new javax.swing.JLabel();
        paymentDateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        paymentDateChooser = new com.toedter.calendar.JDateChooser();
        accountHolderNameTextField = new javax.swing.JTextField();
        initialAmountLabel = new javax.swing.JLabel();
        initialAmountTextField = new javax.swing.JTextField();
        billingDateChooser = new com.toedter.calendar.JDateChooser();
        selectAccountTypeComboBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountTableModel=new AccountTableModel();
        accountInformationTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Account Information Form");
        setPreferredSize(new java.awt.Dimension(1300, 550));

        contentPanel.setBackground(new java.awt.Color(102, 204, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        contentPanel.setPreferredSize(new java.awt.Dimension(720, 402));

        selectAccountTypeLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        selectAccountTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectAccountTypeLabel.setText("Select Account Type:");

        accountNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        accountNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountNameLabel.setText("Account Name:");

        accountNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        accountNoLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        accountNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountNoLabel.setText("Account No:");

        accountNoTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        bankNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        bankNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankNameLabel.setText("Bank Name:");

        bankNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        accountHolderNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        accountHolderNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountHolderNameLabel.setText("Account Holder Name:");

        occupationDetailsLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        occupationDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occupationDetailsLabel.setText("Occupation Details:");

        occupationDetailsTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        billingDateLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        billingDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billingDateLabel.setText("Billing Date:");

        paymentDateLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        paymentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentDateLabel.setText("Payment Date:");

        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        notesTextArea.setRows(5);
        notesTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT Black", 3, 14))); // NOI18N
        jScrollPane1.setViewportView(notesTextArea);

        paymentDateChooser.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        accountHolderNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        initialAmountLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        initialAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialAmountLabel.setText("Initial Amount:");

        initialAmountTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        billingDateChooser.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        selectAccountTypeComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        selectAccountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click Here To Select Type", "Home", "Shared", "Discretionary" }));
        selectAccountTypeComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(billingDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(billingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bankNameTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addComponent(accountNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(selectAccountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectAccountTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(occupationDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accountHolderNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                            .addComponent(initialAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(occupationDetailsTextField)
                            .addComponent(accountHolderNameTextField)
                            .addComponent(initialAmountTextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectAccountTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(selectAccountTypeComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountHolderNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountHolderNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupationDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(occupationDetailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initialAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(billingDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(billingDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(paymentDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(52, 52, 52)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(updateButton)
                .addGap(49, 49, 49))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setAutoscrolls(true);

        accountInformationTable.setBackground(new java.awt.Color(102, 204, 255));
        accountInformationTable.setBorder(new javax.swing.border.MatteBorder(null));
        accountInformationTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        accountInformationTable.setModel(accountTableModel);
        accountInformationTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        accountInformationTable.setRowHeight(25);
        accountInformationTable.setRowMargin(2);
        jScrollPane2.setViewportView(accountInformationTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        AccountTable accountTableDetails = new AccountTable();
        accountTableDetails.setId(UUID.randomUUID().toString());
        
        
        accountTableDetails.setUser(LoggedInUser.getInstance().getUserDetailsTable());
        if(selectAccountTypeComboBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Please Select Account Type.");
            return;
        }else{
        accountTableDetails.setSelectAccountType(selectAccountTypeComboBox.getSelectedItem().toString());
        }
        
        
        //Validation of Account Name Field
        if(accountNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Account Name.");
            return;
        }else if(accountNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Account Name Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        
        //Validation of Account Number Field
        if (GenericValidator.isBlankOrNull(accountNoTextField.getText())){
           JOptionPane.showMessageDialog(this, "User Number Cannot Be Empty.");
           return;
       }else if (accountNoTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "Account No Will Be in Numeric Number");
             return;
        }else if (AccountDataManager.isAccountValid(accountNoTextField.getText())==true){
           JOptionPane.showMessageDialog(this, "Already Used This Account Number, Try Another Account Number.");
           return;
       }else{
           accountTableDetails.setAccountNo(accountNoTextField.getText());
       }
        
        
        
        //Validation of Bank Name Field
        if(bankNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Bank Name.");
            return;
        }else if(bankNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Bank Name Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Account Holder Name Field
        if(accountHolderNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Account Holder Name.");
            return;
        }else if(accountHolderNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Account Holder Name Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Occupation Details Field
        if(occupationDetailsTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Occupation Details of User.");
            return;
        }else if(occupationDetailsTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Occupation Details Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Initial Amount Field
        if(initialAmountTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Initial Amount.");
            return;
        }else if (initialAmountTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "Initial amount Field Cannot Contain Any Alphabate.");
             return;
        }
        if(Double.parseDouble(initialAmountTextField.getText())<500){
            JOptionPane.showMessageDialog(this, "Initial Amount Must Be More Than 500.");
            return;
        }
        
        
        //Validation of Date Field
        if(billingDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Billling Date of The Account");
            return;
        }if(paymentDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Payment Date of The Account");
            return;
        }
        
        
        accountTableDetails.setAccountName(accountNameTextField.getText());
        accountTableDetails.setAccountNo(accountNoTextField.getText());
        accountTableDetails.setBankName(bankNameTextField.getText());
        accountTableDetails.setAccountHolderName(accountHolderNameTextField.getText());
        accountTableDetails.setOccupationDetails(occupationDetailsTextField.getText());
        accountTableDetails.setInitialAmount(Double.parseDouble(initialAmountTextField.getText()));
        accountTableDetails.setBillingDate(billingDateChooser.getDate());
        accountTableDetails.setPaymentDate(paymentDateChooser.getDate());
        accountTableDetails.setNotes(notesTextArea.getText());
        
        accountTableDetails.setBalance(Double.parseDouble(initialAmountTextField.getText()));
        accountTableModel.addRow(accountTableDetails);
        clear();
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        int selectedRow = accountInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            accountTableModel.deleteRow(selectedRow);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        int selectedRow = accountInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            AccountTable accountTableDetails = accountTableModel.getAccountTable(selectedRow);
            if(selectAccountTypeComboBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Please Select Account Type.");
            return;
        }else{
        accountTableDetails.setSelectAccountType(selectAccountTypeComboBox.getSelectedItem().toString());
        }
         
            
       //Validation of Account Name Field
        if(accountNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Account Name.");
            return;
        }else if(accountNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Account Name Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Account Number Field
        if (GenericValidator.isBlankOrNull(accountNoTextField.getText())){
           JOptionPane.showMessageDialog(this, "User Number Cannot Be Empty.");
           return;
       }else if (accountNoTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "Account No Will Be in Numeric Number");
             return;
        }else{
           accountTableDetails.setAccountNo(accountNoTextField.getText());
       }
        
        
        //Validation of Bank Name Field
        if(bankNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Bank Name.");
            return;
        }else if(bankNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Bank Name Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Account Holder Name Field
        if(accountHolderNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Account Holder Name.");
            return;
        }else if(accountHolderNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Account Holder Name Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Occupation Details Field
        if(occupationDetailsTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Occupation Details of User.");
            return;
        }else if(occupationDetailsTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Occupation Details Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Initial Amount Field
        if(initialAmountTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Initial Amount.");
            return;
        }else if (initialAmountTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "Initial amount Field Cannot Contain Any Alphabate.");
             return;
        }
        if(Double.parseDouble(initialAmountTextField.getText())<500){
            JOptionPane.showMessageDialog(this, "Initial Amount Must Be More Than 500.");
            return;
        }
        
        
        //Validation of Date Field
        if(billingDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Billling Date of The Account");
            return;
        }if(paymentDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Payment Date of The Account");
            return;
        }    
            
            accountTableDetails.setAccountName(accountNameTextField.getText());
            accountTableDetails.setBankName(bankNameTextField.getText());
            accountTableDetails.setAccountHolderName(accountHolderNameTextField.getText());
            accountTableDetails.setOccupationDetails(occupationDetailsTextField.getText());
            accountTableDetails.setInitialAmount(Double.parseDouble(initialAmountTextField.getText()));
            accountTableDetails.setBillingDate(billingDateChooser.getDate());
            accountTableDetails.setPaymentDate(paymentDateChooser.getDate());
            accountTableDetails.setNotes(notesTextArea.getText());
            
            accountTableModel.updateRow(selectedRow, accountTableDetails);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "For Upadate Please Select a Row First.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    
     public void clear(){
         
        selectAccountTypeComboBox.setSelectedIndex(0);
        accountNameTextField.setText("");
        accountNoTextField.setText("");
        bankNameTextField.setText("");
        accountHolderNameTextField.setText("");
        occupationDetailsTextField.setText("");
        initialAmountTextField.setText("500.00");
        billingDateChooser.setDate(null);
        paymentDateChooser.setDate(null);
        notesTextArea.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountHolderNameLabel;
    private javax.swing.JTextField accountHolderNameTextField;
    private javax.swing.JTable accountInformationTable;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JTextField accountNameTextField;
    private javax.swing.JLabel accountNoLabel;
    private javax.swing.JTextField accountNoTextField;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel bankNameLabel;
    private javax.swing.JTextField bankNameTextField;
    private com.toedter.calendar.JDateChooser billingDateChooser;
    private javax.swing.JLabel billingDateLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel initialAmountLabel;
    private javax.swing.JTextField initialAmountTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JLabel occupationDetailsLabel;
    private javax.swing.JTextField occupationDetailsTextField;
    private com.toedter.calendar.JDateChooser paymentDateChooser;
    private javax.swing.JLabel paymentDateLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> selectAccountTypeComboBox;
    private javax.swing.JLabel selectAccountTypeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    private AccountTableModel accountTableModel;
}