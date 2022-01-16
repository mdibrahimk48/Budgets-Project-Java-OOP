
package ac.daffodil.l4dc1000100.budgets.UI.UserTable;

import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.UserDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class UserTableModel extends AbstractTableModel {
    private ArrayList<UserTable> userList;
    
    private final String[] columns = {"First Name", "Last Name", "Father Name", "Mother Name", "National ID No",
        "Gender", "Phone Number", "Email", "Occupation", "Date of Birthday", "User Name", "Nationality", "Address"};

        private static final int INDEX_FIRST_NAME = 0;
	private static final int INDEX_LAST_NAME = 1;
	private static final int INDEX_FATHER_NAME = 2;
        private static final int INDEX_MOTHER_NAME = 3;
	private static final int INDEX_NATIONAL_ID_NO = 4;
	private static final int INDEX_GENDER = 5;
        private static final int INDEX_PHONE_NO = 6;
	private static final int INDEX_EMAIL = 7;
	private static final int INDEX_OCCUPATION = 8;
        private static final int INDEX_DATE_OF_BIRTH = 9;
	private static final int INDEX_USER_NAME = 10;
        private static final int INDEX_NATIONALITY = 11;
        private static final int INDEX_ADDRESS = 12;
        
        public UserTableModel(){
            userList=UserDataManager.load();
            if (userList==null){
                  userList = new ArrayList<UserTable>();
            }
        }
    
    
    @Override
    public int getRowCount() {
        return userList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
	}
    
    @Override
	public String getColumnName(int column) {
		return columns[column];
	}

    @Override
    public Object getValueAt(int row, int column) {
        
        UserTable userTableDetails = userList.get(row);
		String value = "";
		
		switch(column){
		case INDEX_FIRST_NAME:
			value = userTableDetails.getFirstName();
		break;
		case INDEX_LAST_NAME:
			value = userTableDetails.getLastName();
		break;
		case INDEX_FATHER_NAME:
			value = userTableDetails.getFatherName();
		break;
                case INDEX_MOTHER_NAME:
			value = userTableDetails.getMotherName();
		break;
                case INDEX_NATIONAL_ID_NO:
			value = userTableDetails.getNationalIDNo();
		break;
                case INDEX_GENDER:
			value = userTableDetails.getGender();
		break;
                case INDEX_PHONE_NO:
			value = userTableDetails.getPhoneNo();
		break;
                case INDEX_EMAIL:
			value = userTableDetails.getEmail();
		break;
                case INDEX_OCCUPATION:
			value = userTableDetails.getOccupation();
		break;
                case INDEX_DATE_OF_BIRTH:
			value = String.valueOf(userTableDetails.getDateOfBirth());
		break;
                case INDEX_USER_NAME:
			value = userTableDetails.getUserName();
		break;
                case INDEX_NATIONALITY:
			value = userTableDetails.getNationality();
		break;
                case INDEX_ADDRESS:
			value = userTableDetails.getAddress();
		break;
		}
		return value;
    }
    public void addRow(UserTable userTableDetails){
		userList.add(userTableDetails);
		fireTableDataChanged();
                UserDataManager.save(userList);
	}
        
        public UserTable getUserTable(int row){
            return userList.get(row);
        }
  
        public void updateRow(int row, UserTable userTableDetails){
            userList.set(row, userTableDetails);
            fireTableDataChanged();
            UserDataManager.save(userList);
        }
        
        public void deleteRow(int row){
            userList.remove(row);
            fireTableDataChanged();
            UserDataManager.save(userList);
        }      
}
