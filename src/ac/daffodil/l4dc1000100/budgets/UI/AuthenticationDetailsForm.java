
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.AuthenticationTable.AuthenticationTableModel;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AccountDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.UserDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AuthenticationTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AuthenticationDetailsForm extends javax.swing.JInternalFrame {

    public AuthenticationDetailsForm() {
        
        initComponents();
        loadUser();
        loadAccount();
        
        authenticationInformationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                int selectedRow = authenticationInformationTable.getSelectedRow();
                
                if (selectedRow >= 0){
                    AuthenticationTable authenticationTableDetails = authenticationTableModel.getAuthenticationTable(selectedRow);
                    if (authenticationTableDetails != null){
                      userComboBox.setSelectedItem(authenticationTableDetails.getUser());
                      accountComboBox.setSelectedItem(authenticationTableDetails.getAccount());
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        accountLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        accountComboBox = new javax.swing.JComboBox<>();
        userComboBox = new javax.swing.JComboBox<>();
        buttonPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        authenticationTableModel=new AuthenticationTableModel();
        authenticationInformationTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Authentication Details Form");

        contentPanel.setBackground(new java.awt.Color(102, 204, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        contentPanel.setPreferredSize(new java.awt.Dimension(720, 402));

        accountLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("Account:");

        userLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("User:");

        accountComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        accountComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        userComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userComboBox, 0, 379, Short.MAX_VALUE)
                    .addComponent(accountComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(new java.awt.Color(102, 204, 255));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        saveButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
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
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(clearButton)
                .addGap(33, 33, 33)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearButton, saveButton, updateButton});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(clearButton))
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clearButton, removeButton, saveButton, updateButton});

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        authenticationInformationTable.setBackground(new java.awt.Color(102, 204, 255));
        authenticationInformationTable.setBorder(new javax.swing.border.MatteBorder(null));
        authenticationInformationTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        authenticationInformationTable.setModel(authenticationTableModel);
        authenticationInformationTable.setRowHeight(25);
        authenticationInformationTable.setRowMargin(2);
        jScrollPane2.setViewportView(authenticationInformationTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        AuthenticationTable authenticationTableDetails = new AuthenticationTable();
        
        authenticationTableDetails.setId(UUID.randomUUID().toString());
            
        authenticationTableDetails.setUser((UserTable) userComboBox.getSelectedItem());
        authenticationTableDetails.setAccount((AccountTable) accountComboBox.getSelectedItem());

        authenticationTableModel.addRow(authenticationTableDetails);
        clear();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        int selectedRow = authenticationInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            authenticationTableModel.deleteRow(selectedRow);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        int selectedRow = authenticationInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            AuthenticationTable authenticationTableDetails = authenticationTableModel.getAuthenticationTable(selectedRow);
            
            authenticationTableDetails.setUser((UserTable) userComboBox.getSelectedItem());
            authenticationTableDetails.setAccount((AccountTable) accountComboBox.getSelectedItem());

            authenticationTableModel.updateRow(selectedRow, authenticationTableDetails);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "For Upadate Please Select a Row First.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    public void clear(){
        
        accountComboBox.setSelectedIndex(0);
        userComboBox.setSelectedIndex(0);
        
    }
    
    public void loadUser(){
        
        ArrayList<UserTable> userList = UserDataManager.load();
        userComboBox.removeAllItems();
        
        if(userList != null){
            for(int i = 0; i < userList.size(); i++){
                UserTable userTable = userList.get(i);
                userComboBox.addItem(userList.get(i));
            }
        }
    }
    
    public void loadAccount(){
        
        ArrayList<AccountTable> accountList = AccountDataManager.load();
        accountComboBox.removeAllItems();
        
        if(accountList != null){
            for(int i = 0; i < accountList.size(); i++){
                AccountTable accountTable = accountList.get(i);
                accountComboBox.addItem(accountList.get(i));
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<AccountTable> accountComboBox;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JTable authenticationInformationTable;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<UserTable> userComboBox;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
    private AuthenticationTableModel authenticationTableModel;
}
