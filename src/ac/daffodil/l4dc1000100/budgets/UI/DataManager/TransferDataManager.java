
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.TransferTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TransferDataManager {
    private static final String FILE_NAME = "Data/Transfer_Information";
    
    public static void save(ArrayList<TransferTable> transferList){
     try{
         FileOutputStream fos = new FileOutputStream(FILE_NAME);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(transferList);
         oos.flush();
         oos.close();
         fos.close();
    }catch(IOException ioe){
         System.err.println("Cannot Save Information to The File");
        }
    }
    
    
    public static ArrayList<TransferTable> load(){
        ArrayList<TransferTable> transferList = null;
        try{
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            transferList = (ArrayList<TransferTable>) ois.readObject();
            fis.close();
            ois.close();
        }catch(IOException ioe){
            System.err.println("Cannot Read Information From The File");
        }catch(ClassNotFoundException cnfe){
            System.err.println("Cannot Find The Class");
        }
        return transferList;
    } 
}