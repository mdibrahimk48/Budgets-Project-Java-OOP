
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AccountDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.CategoryDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.ScheduleTable.ScheduleTableModel;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.CategoryTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.ScheduleTable;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ScheduleDetailsForm extends javax.swing.JInternalFrame {

    public ScheduleDetailsForm() {
        
        initComponents();
        loadAccount();
        loadCategory();
        
        scheduleInformationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            
            public void valueChanged(ListSelectionEvent lse) {
               int selectedRow = scheduleInformationTable.getSelectedRow();
               if(selectedRow >=0){
                   ScheduleTable scheduleTableDetails = scheduleTableModel.getScheduleTable(selectedRow);
                   if(scheduleTableDetails != null){
                       
                        dateChooser.setDate(scheduleTableDetails.getDate());
                        categoryComboBox.setSelectedItem(scheduleTableDetails.getCategory());
                        accountComboBox.setSelectedItem(scheduleTableDetails.getAccount());
                        amountTextField.setText(String.valueOf(scheduleTableDetails.getAmount()));
                        payeeTextField.setText(scheduleTableDetails.getPayee());
                        notesTextArea.setText(scheduleTableDetails.getNote());
                   }
                }
            }   
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        scheduleTableModel=new ScheduleTableModel();
        scheduleInformationTable = new javax.swing.JTable();
        contentPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        payeeLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        categoryComboBox = new javax.swing.JComboBox<>();
        accountLabel = new javax.swing.JLabel();
        payeeTextField = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        accountComboBox = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Schedule Details Form");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
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

        scheduleInformationTable.setBackground(new java.awt.Color(102, 204, 255));
        scheduleInformationTable.setBorder(new javax.swing.border.MatteBorder(null));
        scheduleInformationTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        scheduleInformationTable.setModel(scheduleTableModel);
        scheduleInformationTable.setRowHeight(25);
        scheduleInformationTable.setRowMargin(2);
        jScrollPane2.setViewportView(scheduleInformationTable);

        contentPanel.setBackground(new java.awt.Color(102, 204, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        contentPanel.setPreferredSize(new java.awt.Dimension(720, 402));

        dateLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Date:");

        categoryLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setText("Category:");

        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        notesTextArea.setRows(5);
        notesTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT Black", 3, 14))); // NOI18N
        jScrollPane1.setViewportView(notesTextArea);

        payeeLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        payeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payeeLabel.setText("Payee:");

        dateChooser.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        categoryComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        categoryComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        accountLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("Account:");

        payeeTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        amountLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("Amount:");

        amountTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        accountComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        accountComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(payeeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(accountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payeeTextField)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(accountComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(categoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(amountTextField)))))))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        ScheduleTable scheduleTable=new ScheduleTable();

        scheduleTable.setId(UUID.randomUUID().toString());

        
        //Validation of Field
        if(dateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Choose a Date");
            return;
        }if(amountTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Transaction Amount");
            return;
        }else if (amountTextField.getText().trim().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(this, "Amount Field Cannot Contain Any Alphabate.");
            return;
        }
        if(Double.parseDouble(amountTextField.getText())<0){
            JOptionPane.showMessageDialog(this, "Amount Cannot Be Negative.");
            return;
        }if(payeeTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Payee's Name");
            return;
        }

        
        scheduleTable.setDate(dateChooser.getDate());
        scheduleTable.setCategory((CategoryTable)categoryComboBox.getSelectedItem());
        scheduleTable.setAccount((AccountTable)accountComboBox.getSelectedItem());
        scheduleTable.setAmount(Double.parseDouble(amountTextField.getText()));
        scheduleTable.setPayee(payeeTextField.getText());
        scheduleTable.setNote(notesTextArea.getText());

        scheduleTableModel.addRow(scheduleTable);
        clear();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        int selectedRow = scheduleInformationTable.getSelectedRow();

        if(selectedRow >= 0){
            scheduleTableModel.deleteRow(selectedRow);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        int selectedRow = scheduleInformationTable.getSelectedRow();

        ScheduleTable scheduleTable= scheduleTableModel.getScheduleTable(selectedRow);

        
        //Validation of Field
        if(dateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Choose a Date");
            return;
        }if(amountTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Transaction Amount");
            return;
        }else if (amountTextField.getText().trim().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(this, "Amount Field Cannot Contain Any Alphabate.");
            return;
        }if(Double.parseDouble(amountTextField.getText())<0){
            JOptionPane.showMessageDialog(this, "Amount Cannot Be Negative.");
            return;
        }if(payeeTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Payee's Name");
            return;
        }
        
        
        if(selectedRow >= 0){
            
            scheduleTable.setDate(dateChooser.getDate());
            scheduleTable.setCategory((CategoryTable)categoryComboBox.getSelectedItem());
            scheduleTable.setAmount(Double.parseDouble(amountTextField.getText()));
            scheduleTable.setAccount((AccountTable)accountComboBox.getSelectedItem());
            scheduleTable.setPayee(payeeTextField.getText());
            scheduleTable.setNote(notesTextArea.getText());

            scheduleTableModel.updateRow(selectedRow, scheduleTable);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "For Upadate Please Select a Row First.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    
    public void clear(){
        
    dateChooser.setDate(null);
    categoryComboBox.setSelectedIndex(0);
    accountComboBox.setSelectedIndex(0);
    amountTextField.setText("");
    payeeTextField.setText("");
    notesTextArea.setText("");
    
}
    
    public void loadAccount(){
        
        ArrayList<AccountTable> accountList = AccountDataManager.getUserAccountList();
        accountComboBox.removeAllItems();
        
        if(accountList != null){
            for(int i = 0; i<accountList.size(); i++){
                accountComboBox.addItem(accountList.get(i));
            }
        }
        
    }
    
    public void loadCategory(){
        
        ArrayList<CategoryTable> categoryList = CategoryDataManager.load();
        categoryComboBox.removeAllItems();
        
        if(categoryList != null){
            for(int i = 0; i<categoryList.size(); i++){
                categoryComboBox.addItem(categoryList.get(i));
            }
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<AccountTable> accountComboBox;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JComboBox<CategoryTable> categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel contentPanel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JLabel payeeLabel;
    private javax.swing.JTextField payeeTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.JTable scheduleInformationTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    private ScheduleTableModel scheduleTableModel;
}
