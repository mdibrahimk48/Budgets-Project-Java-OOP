
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.AccountTable.AccountTableModel;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.TransactionTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TransactionDataManager {
     private static final String FILE_NAME = "Data/Transaction_Information";
    
    public static void save(ArrayList<TransactionTable> transactionList){
     try{
         FileOutputStream fos = new FileOutputStream(FILE_NAME);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(transactionList);
         oos.flush();
         oos.close();
         fos.close();
    }catch(IOException ioe){
         System.err.println("Cannot Save Information to The File");
        }
    }
    
    
    public static ArrayList<TransactionTable> load(){
        ArrayList<TransactionTable> transactionList = null;
        try{
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            transactionList = (ArrayList<TransactionTable>) ois.readObject();
            fis.close();
            ois.close();
        }catch(IOException ioe){
            System.err.println("Cannot Read Information From The File");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot Find The Class");
        }
        return transactionList;
    }
    
    
    
        private static ArrayList<TransactionTable> getTransactionList() {
        ArrayList<TransactionTable> transactionList = load();
        if (transactionList == null) {
            transactionList = new ArrayList<TransactionTable>();
        }

        return transactionList;
    }

        
    public static void add(TransactionTable transaction) {
        if (transaction != null) {
            ArrayList<TransactionTable> transactionList = getTransactionList();
            transactionList.add(transaction);
            save(transactionList);
        }
    }

    
    public static void update(TransactionTable transaction) {
        if (transaction != null) {
            ArrayList<TransactionTable> transactionList = getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                TransactionTable oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transaction)) {
                    transactionList.set(i, transaction);
                    save(transactionList);
                    break;
                }
            }
        }
    }

    
    public static void delete(TransactionTable transaction) {
        if (transaction != null) {
            ArrayList<TransactionTable> transactionList = getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                TransactionTable oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transaction)) {
                    transactionList.remove(i);
                    save(transactionList);
                    break;
                }
            }
        }
    }

    public static ArrayList<TransactionTable> getTransactionList(AccountTable account) {
        ArrayList<TransactionTable> allTransactionList = load();
        ArrayList<TransactionTable> accountTransactionList = new ArrayList<TransactionTable>();
        if (allTransactionList != null) {
            for (int i = 0; i < allTransactionList.size(); i++) {
                TransactionTable transaction = allTransactionList.get(i);
                if (transaction.getAccount().equals(account)) {
                    accountTransactionList.add(transaction);
                }
            }
        }

        return accountTransactionList;
    }

    
    public static ArrayList<TransactionTable> getTransactionList(ArrayList<AccountTable> accountList) {
        ArrayList<TransactionTable> transactionList = new ArrayList<TransactionTable>();
        for (int i = 0; i < accountList.size(); i++) {
            AccountTable account = accountList.get(i);
            ArrayList<TransactionTable> accountTransactionList = getTransactionList(account);
            if (accountTransactionList != null) {
                for (int j = 0; j < accountTransactionList.size(); j++) {
                    TransactionTable transaction = accountTransactionList.get(j);
                    transactionList.add(transaction);
                }
            }
        }
        return transactionList;
    }

    
     public static ArrayList<TransactionTable> getUserTransactionList() {
        ArrayList<AccountTable> userAccountList = AccountDataManager.getUserAccountList();
        ArrayList<TransactionTable> userTransactionList = getTransactionList(userAccountList);
        return userTransactionList;
    }

     
    //For New Transaction - Update Balance 
     public static void updateBalance(TransactionTable transactionTable, AccountTable accountTable){
         ArrayList<AccountTable> accountList = AccountDataManager.getUserAccountList();
         for(int i = 0; i< accountList.size(); i++){
            AccountTable currentAccount = accountList.get(i);
            if(currentAccount.equals(accountTable)){
                if(transactionTable.getCategory().getCategoryType().equals("Income")){
                    currentAccount.setBalance(currentAccount.getBalance() + transactionTable.getAmount());
                }else if(transactionTable.getCategory().getCategoryType().equals("Expense")){
                    currentAccount.setBalance(currentAccount.getBalance() - transactionTable.getAmount());
                }
                AccountTableModel accountTableModel= new AccountTableModel();
                 accountTableModel.updateRow(i, accountTable);
            } 
         }
     }
     
     
     //For Existing Transaction is Modified - Update Balance
     public static void balanceUpdate(TransactionTable transactionTable){
         if(transactionTable != null){
             ArrayList<TransactionTable> transactionList = TransactionDataManager.getUserTransactionList();
             for(int i = 0; i<transactionList.size();i++){
                 TransactionTable oldTransaction = transactionList.get(i);
                 
                 
                 if(oldTransaction.equals(transactionTable)){
                     ArrayList<AccountTable> accountList = AccountDataManager.getUserAccountList();
                     for(int j = 0; j<accountList.size();j++){
                        AccountTable currentAccount = accountList.get(j);
                            if(currentAccount.equals(oldTransaction.getAccount())){
                                if(oldTransaction.getCategory().getCategoryType().equals("Income")){
                                    currentAccount.setBalance(currentAccount.getBalance() - oldTransaction.getAmount());
                                    
                                    
                                    AccountTableModel accountTableModel= new AccountTableModel();
                                        accountTableModel.updateRow(i, currentAccount);
                                }else if(oldTransaction.getCategory().getCategoryType().equals("Expence")){
                                    currentAccount.setBalance(currentAccount.getBalance() + oldTransaction.getAmount());
                                }
                            }
                            
                            if(currentAccount.equals(transactionTable.getAccount())){
                                if(transactionTable.getCategory().getCategoryType().equals("Income")){
                                    currentAccount.setBalance(currentAccount.getBalance()+transactionTable.getAmount());
                                }else if(transactionTable.getCategory().getCategoryType().equals("Expence")){
                                    currentAccount.setBalance(currentAccount.getBalance()-transactionTable.getAmount());
                                }
                                AccountTableModel accountTableModel= new AccountTableModel();
                                        accountTableModel.updateRow(i, currentAccount);
                            }
                     }
                 }
             }
         }
     }
}
