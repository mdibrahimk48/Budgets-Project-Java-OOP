
package ac.daffodil.l4dc1000100.budgets.UI;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.ScheduleDataManager;
import javax.swing.JOptionPane;


public class MainUserInterface extends javax.swing.JFrame {

    
    public MainUserInterface() {
        initComponents();
        ScheduleDataManager.addScheduledTransactions();
        
        setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        mainMenuBar = new javax.swing.JMenuBar();
        formsMenu = new javax.swing.JMenu();
        userMenuItem = new javax.swing.JMenuItem();
        accountMenuItem = new javax.swing.JMenuItem();
        categoryMenuItem = new javax.swing.JMenuItem();
        transactionMenuItem = new javax.swing.JMenuItem();
        transferMenuItem = new javax.swing.JMenuItem();
        scheduleMenuItem = new javax.swing.JMenuItem();
        authenticationMenuItem = new javax.swing.JMenuItem();
        exitMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budgets");
        setBackground(new java.awt.Color(255, 153, 0));
        setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        setName("mainUserInterface"); // NOI18N

        desktopPane.setBackground(new java.awt.Color(255, 153, 102));

        formsMenu.setMnemonic('f');
        formsMenu.setText("Forms");

        userMenuItem.setMnemonic('o');
        userMenuItem.setText("User");
        userMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(userMenuItem);

        accountMenuItem.setMnemonic('s');
        accountMenuItem.setText("Account");
        accountMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(accountMenuItem);

        categoryMenuItem.setMnemonic('a');
        categoryMenuItem.setText("Category");
        categoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(categoryMenuItem);

        transactionMenuItem.setMnemonic('x');
        transactionMenuItem.setText("Transaction");
        transactionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(transactionMenuItem);

        transferMenuItem.setText("Transfer");
        transferMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(transferMenuItem);

        scheduleMenuItem.setText("Schedule");
        scheduleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(scheduleMenuItem);

        authenticationMenuItem.setText("Authentication");
        authenticationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticationMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(authenticationMenuItem);

        exitMenuItem1.setText("Exit");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        formsMenu.add(exitMenuItem1);

        mainMenuBar.add(formsMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionMenuItemActionPerformed
        
        TransactionDetailsForm tdf = new TransactionDetailsForm();
        tdf.setVisible(true);
        desktopPane.add(tdf);
        
    }//GEN-LAST:event_transactionMenuItemActionPerformed

    private void userMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuItemActionPerformed
        UserDetailsForm udf = new UserDetailsForm();
        udf.setVisible(true);
        desktopPane.add(udf);
    }//GEN-LAST:event_userMenuItemActionPerformed

    private void accountMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountMenuItemActionPerformed
        
        AccountInformationForm aif = new AccountInformationForm();
        aif.setVisible(true);
        desktopPane.add(aif);
        
    }//GEN-LAST:event_accountMenuItemActionPerformed

    private void categoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMenuItemActionPerformed
        
        CategoryDetailsForm cdf = new CategoryDetailsForm();
        cdf.setVisible(true);
        desktopPane.add(cdf);
        
    }//GEN-LAST:event_categoryMenuItemActionPerformed

    private void authenticationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticationMenuItemActionPerformed
        
        AuthenticationDetailsForm adf = new AuthenticationDetailsForm();
        adf.setVisible(true);
        desktopPane.add(adf);
        
    }//GEN-LAST:event_authenticationMenuItemActionPerformed

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
            
        int option = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Exit?");
		if(option==JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(this, "Thanks, for Using.");
			System.exit(0);
		}
                
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void transferMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMenuItemActionPerformed
        
        TransferDetailsForm tdf = new TransferDetailsForm();
        tdf.setVisible(true);
        desktopPane.add(tdf);
        
    }//GEN-LAST:event_transferMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        
        JOptionPane.showMessageDialog
	(MainUserInterface.this, "Budgets version1.0\n\nDeveloped by MD. IBRAHIM KHALIL");
        
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void scheduleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleMenuItemActionPerformed
        
        ScheduleDetailsForm sdf = new ScheduleDetailsForm();
        sdf.setVisible(true);
        desktopPane.add(sdf);
        
    }//GEN-LAST:event_scheduleMenuItemActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUserInterface().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem accountMenuItem;
    private javax.swing.JMenuItem authenticationMenuItem;
    private javax.swing.JMenuItem categoryMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem1;
    private javax.swing.JMenu formsMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenuItem scheduleMenuItem;
    private javax.swing.JMenuItem transactionMenuItem;
    private javax.swing.JMenuItem transferMenuItem;
    private javax.swing.JMenuItem userMenuItem;
    // End of variables declaration//GEN-END:variables

}
