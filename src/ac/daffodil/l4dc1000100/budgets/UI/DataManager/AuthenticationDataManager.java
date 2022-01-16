
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AuthenticationTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AuthenticationDataManager {
  
    private static final String FILE_NAME = "Data/Authentication_Information";
    
    public static void save(ArrayList<AuthenticationTable> authenticationList){
     try{
         FileOutputStream fos = new FileOutputStream(FILE_NAME);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(authenticationList);
         oos.flush();
         oos.close();
         fos.close();
    }catch(IOException ioe){
         System.err.println("Cannot Save Information to The File");
        }
    }
    
    
    public static ArrayList<AuthenticationTable> load(){
        ArrayList<AuthenticationTable> authenticationList = null;
        try{
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            authenticationList = (ArrayList<AuthenticationTable>) ois.readObject();
            fis.close();
            ois.close();
        }catch(IOException ioe){
            System.err.println("Cannot Read Information From The File");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot Find The Class");
        }
        return authenticationList;
    } 

    
public static boolean isAccessAllowed(AccountTable account) {
        boolean allowed = false;
        UserTable user = LoggedInUser.getInstance().getUserDetailsTable();
        if (user != null) {
            ArrayList<AuthenticationTable> authenticationList = load();
            if (authenticationList != null) {
                for (int i = 0; i < authenticationList.size(); i++) {
                    AuthenticationTable authenticationTable = authenticationList.get(i);
                    if (authenticationTable.getUser().equals(user) && authenticationTable.getAccount().equals(account)) {
                        allowed = true;
                        break;
                    }
                }
            }
        }
        return allowed;
    }
}