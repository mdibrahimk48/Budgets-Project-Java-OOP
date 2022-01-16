
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.CategoryTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CategoryDataManager {
    private static final String FILE_NAME = "Data/Category_Information";
    
    public static void save(ArrayList<CategoryTable> categoryList){
     try{
         FileOutputStream fos = new FileOutputStream(FILE_NAME);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(categoryList);
         oos.flush();
         oos.close();
         fos.close();
    }catch(IOException ioe){
         System.err.println("Cannot Save Information to The File");
        }
    }
    
    
    public static ArrayList<CategoryTable> load(){
        ArrayList<CategoryTable> categoryList = null;
        try{
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            categoryList = (ArrayList<CategoryTable>) ois.readObject();
            fis.close();
            ois.close();
        }catch(IOException ioe){
            System.err.println("Cannot Read Information From The File");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot Find The Class");
        }
        return categoryList;
    } 
}
