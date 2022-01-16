
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AccountDataManager {
     private static final String FILE_NAME = "Data/Account_Information";
    
    public static void save(ArrayList<AccountTable> accountList){
     try{
         FileOutputStream fos = new FileOutputStream(FILE_NAME);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(accountList);
         oos.flush();
         oos.close();
         fos.close();
    }catch(IOException ioe){
         System.err.println("Cannot Save Information to The File");
        }
    }
    public static ArrayList<AccountTable> load(){
        ArrayList<AccountTable> accountList = null;
        try{
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            accountList = (ArrayList<AccountTable>) ois.readObject();
            fis.close();
            ois.close();
        }catch(IOException ioe){
            System.err.println("Cannot Read Information From The File");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot Find The Class");
        }
        return accountList;
    }
    
    public static ArrayList<AccountTable> getUserAccountList() {
        ArrayList<AccountTable> accountList = new ArrayList<AccountTable>();
        UserTable user = LoggedInUser.getInstance().getUserDetailsTable();
        if (user != null) {
            ArrayList<AccountTable> allAccountList = load();
            if (allAccountList != null) {
                for (int i = 0; i < allAccountList.size(); i++) {
                    AccountTable account = allAccountList.get(i);
                    if (account.getUser().equals(user)) {
                        accountList.add(account);
                    } else if (AuthenticationDataManager.isAccessAllowed(account)) {
                        accountList.add(account);
                    }
                }
            }
        }
  
        return accountList;
    }
    public static boolean isAccountValid(String isAccountValid){
          ArrayList<AccountTable> accountList = load();
          
          if(accountList != null && accountList.size()>0){
              for (int i=0; i<accountList.size();i++){
                  AccountTable accountTable = accountList.get(i);
                  if(accountTable.getAccountNo().equalsIgnoreCase(isAccountValid)){
                      return true;
                  }
              }
          }
        return false;
           
      }

}
