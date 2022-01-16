
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDataManager {
     private static final String FILE_NAME = "Data/User_Information";
    
    public static void save(ArrayList<UserTable> userList){
     try{
         FileOutputStream fos = new FileOutputStream(FILE_NAME);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(userList);
         oos.flush();
         oos.close();
         fos.close();
    }catch(IOException ioe){
         System.err.println("Cannot Save Information to The File");
        }
    }
    
    
    public static ArrayList<UserTable> load(){
        ArrayList<UserTable> userList = null;
        try{
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            userList = (ArrayList<UserTable>) ois.readObject();
            fis.close();
            ois.close();
        }catch(IOException ioe){
            System.err.println("Cannot Read Information From The File");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot Find The Class");
        }
        return userList;
    } 
    
    
    public static UserTable getUser(String username, String password){
        ArrayList<UserTable> userList = load();
        if(userList != null && userList.size()>0){
            for(int i = 0; i<userList.size(); i++){
                UserTable user = userList.get(i);
                if (user.getUserName().equalsIgnoreCase(username) &&
                        user.getPassword().equals(password)){
                return user;
            }
        }
        }else{
            if(username.equalsIgnoreCase("admin") && password.equals("secret")){
                UserTable user = new UserTable();
                user.setUserName("admin");
                user.setId("1");
                return user;
            }
        }
        return null;
    }

    
    public static boolean isUserValid(String isUserValid){
          ArrayList<UserTable> userList = load();
          
          if(userList != null && userList.size()>0){
              for (int i=0; i<userList.size();i++){
                  UserTable userTable = userList.get(i);
                  if(userTable.getUserName().equalsIgnoreCase(isUserValid)){
                      return true;
                  }
              }
          }
        return false;
           
      }
    
    
    public static boolean isNIDValid(String isNIDValid){
        
          ArrayList<UserTable> userList = load();
          
          if(userList != null && userList.size()>0){
              for (int i=0; i<userList.size();i++){
                  UserTable userTable = userList.get(i);
                  if(userTable.getNationalIDNo().equalsIgnoreCase(isNIDValid)){
                      return true;
                  }
              }
          }
        return false;
           
      }
}