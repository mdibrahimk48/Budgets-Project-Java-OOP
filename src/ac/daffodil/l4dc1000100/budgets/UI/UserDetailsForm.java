
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.UserDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;
import ac.daffodil.l4dc1000100.budgets.UI.UserTable.UserTableModel;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.apache.commons.validator.GenericValidator;


public class UserDetailsForm extends javax.swing.JInternalFrame {

    
    public UserDetailsForm() {
        
        initComponents();
        userInformationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent lse) {
               int selectedRow = userInformationTable.getSelectedRow();
               if(selectedRow >=0){
                   UserTable userTableDetails = userTableModel.getUserTable(selectedRow);
                   if(userTableDetails != null){
                        firstNameTextField.setText(userTableDetails.getFirstName());
                        lastNameTextField.setText(userTableDetails.getLastName());
                        fatherNameTextField.setText(userTableDetails.getFatherName());
                        motherNameTextField.setText(userTableDetails.getMotherName());
                        nationalIDNoTextField.setText(userTableDetails.getNationalIDNo());
                        if(userTableDetails.getGender().equals(maleRadioButton.getText())){
                            maleRadioButton.setSelected(true);
                        }else if(userTableDetails.getGender().equals(femaleRadioButton.getText())){
                            femaleRadioButton.setSelected(true);
                        }else{
                            othersRadioButton.setSelected(true);
                        }
                        phoneNoTextField.setText(userTableDetails.getPhoneNo());
                        emailTextField.setText(userTableDetails.getEmail());
                        occupationTextField.setText(userTableDetails.getOccupation());
                        dateOfBirthChooser.setDate(userTableDetails.getDateOfBirth());
                        userNameTextField.setText(userTableDetails.getUserName());
                        passwordField.setText(userTableDetails.getPassword());
                        confirmPasswordField.setText(userTableDetails.getPassword());
                        nationalityTextField.setText(userTableDetails.getNationality());
                        addressTextArea.setText(userTableDetails.getAddress());
                   }
                }
            }   
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexButtonGroup = new javax.swing.ButtonGroup();
        contentPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        fatherNameTextField = new javax.swing.JTextField();
        motherNameLabel = new javax.swing.JLabel();
        motherNameTextField = new javax.swing.JTextField();
        nationalIDNo = new javax.swing.JLabel();
        nationalIDNoTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        othersRadioButton = new javax.swing.JRadioButton();
        phoneNoLabel = new javax.swing.JLabel();
        phoneNoTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        occupationLabel = new javax.swing.JLabel();
        occupationTextField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        nationalityLabel = new javax.swing.JLabel();
        nationalityTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        dateOfBirthChooser = new com.toedter.calendar.JDateChooser();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTableModel=new UserTableModel();
        userInformationTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("User Details Form");

        contentPanel.setBackground(new java.awt.Color(102, 204, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        firstNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLabel.setText("First Name:");

        firstNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLabel.setText("Last Name:");

        lastNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        fatherNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        fatherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fatherNameLabel.setText("Father's Name:");

        fatherNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        motherNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        motherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motherNameLabel.setText("Mother's Name:");

        motherNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        nationalIDNo.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        nationalIDNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nationalIDNo.setText("National ID No:");

        nationalIDNoTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        genderLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLabel.setText("GENDER:");

        maleRadioButton.setBackground(new java.awt.Color(102, 204, 255));
        sexButtonGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        maleRadioButton.setText("Male");

        femaleRadioButton.setBackground(new java.awt.Color(102, 204, 255));
        sexButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        femaleRadioButton.setText("Female");

        othersRadioButton.setBackground(new java.awt.Color(102, 204, 255));
        sexButtonGroup.add(othersRadioButton);
        othersRadioButton.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        othersRadioButton.setText("Others");

        phoneNoLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        phoneNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNoLabel.setText("Phone No:");

        phoneNoTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email:");

        emailTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        occupationLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        occupationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occupationLabel.setText("Occupation:");

        occupationTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        dobLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        dobLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dobLabel.setText("Date of Birth:");

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addressTextArea.setRows(5);
        addressTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT Black", 3, 14))); // NOI18N
        jScrollPane1.setViewportView(addressTextArea);

        userNameLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("User Name:");

        userNameTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");

        confirmPasswordLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        confirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordLabel.setText("Confirm Password:");

        nationalityLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        nationalityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nationalityLabel.setText("Nationality:");

        nationalityTextField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        passwordField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        confirmPasswordField.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        dateOfBirthChooser.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(occupationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(occupationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(confirmPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(passwordField)))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateOfBirthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(nationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nationalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(fatherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(motherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                        .addComponent(motherNameTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nationalIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(othersRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nationalIDNoTextField))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(phoneNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameTextField)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        contentPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fatherNameTextField, firstNameTextField, lastNameTextField, motherNameTextField});

        contentPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fatherNameLabel, firstNameLabel, genderLabel, lastNameLabel, motherNameLabel, nationalIDNo});

        contentPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirmPasswordLabel, nationalityLabel, passwordLabel, userNameLabel});

        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalIDNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(othersRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(occupationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(occupationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateOfBirthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nationalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fatherNameTextField, firstNameTextField, lastNameTextField, motherNameTextField});

        contentPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fatherNameLabel, firstNameLabel, genderLabel, lastNameLabel, motherNameLabel, nationalIDNo, phoneNoLabel});

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
                .addGap(58, 58, 58)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(44, 44, 44))
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, clearButton, removeButton, updateButton});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, clearButton, removeButton, updateButton});

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        userInformationTable.setBackground(new java.awt.Color(102, 204, 255));
        userInformationTable.setBorder(new javax.swing.border.MatteBorder(null));
        userInformationTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        userInformationTable.setModel(userTableModel);
        userInformationTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        userInformationTable.setRowHeight(25);
        userInformationTable.setRowMargin(2);
        jScrollPane2.setViewportView(userInformationTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        UserTable userTableDetails = new UserTable();

        userTableDetails.setId(UUID.randomUUID().toString());
        
        
        //Validation for First Name
        if(firstNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter First Name of User");
            return;
        }else if(firstNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "First Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for Last Name
        if(lastNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Last Name of User");
            return;
        }else if(lastNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Last Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for Father Name
        if(fatherNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Father's Name of User");
            return;
        }else if(fatherNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Father's Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for Mother Name
        if(motherNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Mother's Name of User");
            return;
        }else if(motherNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Mother's Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for National ID Number
        if (GenericValidator.isBlankOrNull(nationalIDNoTextField.getText())){
           JOptionPane.showMessageDialog(this, "Please Enter National ID Number of User");
           return;
       }else if (nationalIDNoTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "You Can Only Enter Number In NID Number Field.");
             return;
        }else if (UserDataManager.isNIDValid(nationalIDNoTextField.getText())==true){
           JOptionPane.showMessageDialog(this, "Already Used This NID, Try Another NID.");
           return;
       }else{
           userTableDetails.setNationalIDNo(nationalIDNoTextField.getText());
       }
        
        
        //Validation for Phone Number
        if(phoneNoTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Phone Number of User");
            return;
        }else if (phoneNoTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "You Can Only Enter Number in Phone Number Field.");
                phoneNoTextField.grabFocus();
             return;
        }
        
        
        //Email Validation
       if(GenericValidator.isEmail(emailTextField.getText())){
                userTableDetails.setEmail(emailTextField.getText());
            }else{
                JOptionPane.showMessageDialog(this, "Not Valid Mail, "
                    + "Please Enter Correct Mail.");
            return;
            }
       
       
       //Validation of Occupation Field
        if(occupationTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Occupation of The User");
            return;
        }else if(occupationTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Occupation Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Date Field
        if(dateOfBirthChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Date of Birth of The User");
            return;
        }
        
        
        //User Name Validation
        if (GenericValidator.isBlankOrNull(userNameTextField.getText())){
           JOptionPane.showMessageDialog(this, "User Name Cannot Be Empty.");
           return;
       }else if (UserDataManager.isUserValid(userNameTextField.getText())==true){
           JOptionPane.showMessageDialog(this, "Already Used This User Name, Try Another User Name.");
           return;
       }else{
           userTableDetails.setUserName(userNameTextField.getText());
       }
        
        
        //Validation of Password
        if(passwordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Password");
            return;
        }if(confirmPasswordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Password Again in Confirm Password Field");
            return;
        }if(passwordField.getPassword().length<3 || passwordField.getPassword().length>20){
           JOptionPane.showMessageDialog(this, "Passwor Should Be Between 3 to 20 Character.");
                passwordField.grabFocus();
        return;
       }if(passwordField.getText() == null ? confirmPasswordField.getText() != null : !
                passwordField.getText().equals(confirmPasswordField.getText())){
            JOptionPane.showMessageDialog(this, "Password Is Not Matched");
            return;
        }
       
       
        //Validation For Nationality Field
        if(nationalityTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Nationality of The User");
            return;
        }else if(nationalityTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Nationality Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation For Address Field
        if(addressTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Address of The User");
            return;
        }

        
        userTableDetails.setFirstName(firstNameTextField.getText());
        userTableDetails.setLastName(lastNameTextField.getText());
        userTableDetails.setFatherName(fatherNameTextField.getText());
        userTableDetails.setMotherName(motherNameTextField.getText());
        userTableDetails.setNationalIDNo(nationalIDNoTextField.getText());
        if (maleRadioButton.isSelected()){
            userTableDetails.setGender(maleRadioButton.getText());
        }else if(femaleRadioButton.isSelected()){
            userTableDetails.setGender(femaleRadioButton.getText());
        }else if(othersRadioButton.isSelected()){
            userTableDetails.setGender(othersRadioButton.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Gender Type");
            return;
        }
        userTableDetails.setPhoneNo(phoneNoTextField.getText());
        
        
        userTableDetails.setOccupation(occupationTextField.getText());
        userTableDetails.setDateOfBirth(dateOfBirthChooser.getDate());
        userTableDetails.setUserName(userNameTextField.getText());
        userTableDetails.setPassword(passwordField.getText());
        userTableDetails.setConfirmPassword(passwordField.getText());
        userTableDetails.setNationality(nationalityTextField.getText());
        userTableDetails.setAddress(addressTextArea.getText());
        
        
        userTableModel.addRow(userTableDetails);
        clear();
    }//GEN-LAST:event_addButtonActionPerformed

    
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = userInformationTable.getSelectedRow();
        if(selectedRow >= 0){
            userTableModel.deleteRow(selectedRow);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selectedRow = userInformationTable.getSelectedRow();
        UserTable userTableDetails = userTableModel.getUserTable(selectedRow);

        
        //Validation for First Name
        if(firstNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter First Name of User");
            return;
        }else if(firstNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "First Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for Last Name
        if(lastNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Last Name of User");
            return;
        }else if(lastNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Last Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for Father Name
        if(fatherNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Father's Name of User");
            return;
        }else if(fatherNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Father's Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for Mother Name
        if(motherNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Mother's Name of User");
            return;
        }else if(motherNameTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Mother's Name Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation for National ID Number
        if (GenericValidator.isBlankOrNull(nationalIDNoTextField.getText())){
           JOptionPane.showMessageDialog(this, "Please Enter National ID Number of User");
           return;
       }else if (nationalIDNoTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "You Can Only Enter Number In NID Number Field.");
             return;
        }else{
           userTableDetails.setNationalIDNo(nationalIDNoTextField.getText());
       }
        
        
        //Validation for Phone Number
        if(phoneNoTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Phone Number of User");
            return;
        }else if (phoneNoTextField.getText().trim().matches("[a-zA-Z]+")){
             JOptionPane.showMessageDialog(this, "You Can Only Enter Number in Phone Number Field.");
                phoneNoTextField.grabFocus();
             return;
        }
        
        
        //Email Validation
       if(GenericValidator.isEmail(emailTextField.getText())){
                userTableDetails.setEmail(emailTextField.getText());
            }else{
                JOptionPane.showMessageDialog(this, "Not Valid Mail, "
                    + "Please Enter Correct Mail.");
            return;
            }
       
       
       //Validation of Occupation Field
        if(occupationTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Occupation of The User");
            return;
        }else if(occupationTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Occupation Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation of Date Field
        if(dateOfBirthChooser.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Date of Birth of The User");
            return;
        }
        
        
        //User Name Validation
        if (GenericValidator.isBlankOrNull(userNameTextField.getText())){
           JOptionPane.showMessageDialog(this, "User Name Cannot Be Empty.");
           return;
       }else{
           userTableDetails.setUserName(userNameTextField.getText());
       }
        
        
        //Validation of Password
        if(passwordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Password");
            return;
        }if(confirmPasswordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Password Again in Confirm Password Field");
            return;
        }if(passwordField.getPassword().length<3 || passwordField.getPassword().length>20){
           JOptionPane.showMessageDialog(this, "Passwor Should Be Between 3 to 20 Character.");
                passwordField.grabFocus();
        return;
       }if(passwordField.getText() == null ? confirmPasswordField.getText() != null : !
                passwordField.getText().equals(confirmPasswordField.getText())){
            JOptionPane.showMessageDialog(this, "Password Is Not Matched");
            return;
        }
       
       
        //Validation For Nationality Field
        if(nationalityTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Nationality of The User");
            return;
        }else if(nationalityTextField.getText().trim().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Nationality Field Cannot Contain Numeric Number.");
            return;
        }
        
        
        //Validation For Address Field
        if(addressTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Address of The User");
            return;
        }

        
        if(selectedRow >= 0){
            userTableDetails.setFirstName(firstNameTextField.getText());
            userTableDetails.setLastName(lastNameTextField.getText());
            userTableDetails.setFatherName(fatherNameTextField.getText());
            userTableDetails.setMotherName(motherNameTextField.getText());
            if (maleRadioButton.isSelected()){
            userTableDetails.setGender(maleRadioButton.getText());
            }else if(femaleRadioButton.isSelected()){
            userTableDetails.setGender(femaleRadioButton.getText());
            }else if(othersRadioButton.isSelected()){
            userTableDetails.setGender(othersRadioButton.getText());
            }
            
            userTableDetails.setPhoneNo(phoneNoTextField.getText());
            userTableDetails.setEmail(emailTextField.getText());
            userTableDetails.setOccupation(occupationTextField.getText());
            userTableDetails.setDateOfBirth(dateOfBirthChooser.getDate());
            userTableDetails.setUserName(userNameTextField.getText());
            userTableDetails.setPassword(passwordField.getText());
            userTableDetails.setNationality(nationalityTextField.getText());
            userTableDetails.setAddress(addressTextArea.getText());
            
            
            userTableModel.updateRow(selectedRow, userTableDetails);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "For Upadate Please Select a Row First.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

                                                                                    
    public void clear(){
        
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        fatherNameTextField.setText("");
        motherNameTextField.setText("");
        nationalIDNoTextField.setText("");
        sexButtonGroup.clearSelection();
        phoneNoTextField.setText("");
        emailTextField.setText("");
        occupationTextField.setText("");
        dateOfBirthChooser.setDate(null);
        userNameTextField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        nationalityTextField.setText("");
        addressTextArea.setText("");
        
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPanel contentPanel;
    private com.toedter.calendar.JDateChooser dateOfBirthChooser;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel motherNameLabel;
    private javax.swing.JTextField motherNameTextField;
    private javax.swing.JLabel nationalIDNo;
    private javax.swing.JTextField nationalIDNoTextField;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JTextField nationalityTextField;
    private javax.swing.JLabel occupationLabel;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JRadioButton othersRadioButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.ButtonGroup sexButtonGroup;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userInformationTable;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
    private UserTableModel userTableModel;
}