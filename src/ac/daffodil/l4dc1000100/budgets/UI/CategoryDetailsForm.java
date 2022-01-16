
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.bean.CategoryTable;
import ac.daffodil.l4dc1000100.budgets.UI.CategoryTable.CategoryTableModel;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CategoryDetailsForm extends javax.swing.JInternalFrame {

    public CategoryDetailsForm() {
        
        initComponents();
        categoryInformationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent lse) {
               int selectedRow = categoryInformationTable.getSelectedRow();
               if(selectedRow >=0){
                   CategoryTable categoryTableDetails = categoryTableModel.getCategoryTable(selectedRow);
                   if(categoryTableDetails != null){
                       
                        categoryTypeComboBox.setSelectedItem(categoryTableDetails.getCategoryType());
                        categoryNameTextField.setText(categoryTableDetails.getCategoryName());
                        notesTextArea.setText(categoryTableDetails.getNotes());
                   }
                }
            }   
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        categoryTypeLabel = new javax.swing.JLabel();
        categoryNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        categoryTypeComboBox = new javax.swing.JComboBox<>();
        categoryNameTextField = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoryTableModel=new CategoryTableModel();
        categoryInformationTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Category Details Form");

        contentPanel.setBackground(new java.awt.Color(102, 204, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        contentPanel.setPreferredSize(new java.awt.Dimension(720, 402));

        categoryTypeLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        categoryTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryTypeLabel.setText("Category Type:");

        categoryNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        categoryNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryNameLabel.setText("Category Name:");

        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        notesTextArea.setRows(5);
        notesTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT Black", 3, 14))); // NOI18N
        jScrollPane1.setViewportView(notesTextArea);

        categoryTypeComboBox.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        categoryTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click Here To Select Type", "Income", "Expense", "Transfer" }));
        categoryTypeComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        categoryNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(categoryTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoryNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryNameTextField)
                            .addComponent(categoryTypeComboBox, 0, 519, Short.MAX_VALUE))))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        categoryInformationTable.setBackground(new java.awt.Color(102, 204, 255));
        categoryInformationTable.setBorder(new javax.swing.border.MatteBorder(null));
        categoryInformationTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        categoryInformationTable.setModel(categoryTableModel);
        categoryInformationTable.setRowHeight(25);
        categoryInformationTable.setRowMargin(2);
        jScrollPane2.setViewportView(categoryInformationTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        CategoryTable categoryTableDetails = new CategoryTable();
        
        categoryTableDetails.setId(UUID.randomUUID().toString());
        
        
        //Validation of Field
        if(categoryNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Category Name.");
            return;
        }else if(categoryNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Category Name Cannot Contain Numeric Number.");
            return;
        }
        
        if(categoryTypeComboBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Please Select Category Type.");
            return;
        }else{
            categoryTableDetails.setCategoryType(categoryTypeComboBox.getSelectedItem().toString());
        }
        
        categoryTableDetails.setCategoryName(categoryNameTextField.getText());
        categoryTableDetails.setNotes(notesTextArea.getText());

        categoryTableModel.addRow(categoryTableDetails);
        clear();
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        int selectedRow = categoryInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            categoryTableModel.deleteRow(selectedRow);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        int selectedRow = categoryInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            CategoryTable categoryTableDetails = categoryTableModel.getCategoryTable(selectedRow);
            
            
            //Validation of Field
        if(categoryNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Category Name.");
            return;
        }else if(categoryNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Category Name Cannot Contain Numeric Number.");
            return;
        }
            
            if(categoryTypeComboBox.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(this, "Please Select Category Type.");
                return;
            }else{
                categoryTableDetails.setCategoryType(categoryTypeComboBox.getSelectedItem().toString());
            }

            categoryTableDetails.setCategoryName(categoryNameTextField.getText());
            categoryTableDetails.setNotes(notesTextArea.getText());

            categoryTableModel.updateRow(selectedRow, categoryTableDetails);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "For Upadate Please Select a Row First.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

     public void clear(){
        
         categoryNameTextField.setText("");
        categoryTypeComboBox.setSelectedIndex(0);
        notesTextArea.setText("");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTable categoryInformationTable;
    private javax.swing.JLabel categoryNameLabel;
    private javax.swing.JTextField categoryNameTextField;
    private javax.swing.JComboBox<String> categoryTypeComboBox;
    private javax.swing.JLabel categoryTypeLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    private CategoryTableModel categoryTableModel;
}
