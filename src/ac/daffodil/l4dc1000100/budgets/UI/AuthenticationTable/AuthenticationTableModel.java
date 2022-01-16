
package ac.daffodil.l4dc1000100.budgets.UI.AuthenticationTable;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AuthenticationDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AuthenticationTable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AuthenticationTableModel extends AbstractTableModel{
    private ArrayList<AuthenticationTable> authenticationList;
    
    private final String[] columns = {"User", "Account",};
    
    private static final int INDEX_USER = 0;
    private static final int INDEX_ACCOUNT = 1;
    
     public AuthenticationTableModel(){
            authenticationList = AuthenticationDataManager.load();
            if (authenticationList==null){
                  authenticationList = new ArrayList<AuthenticationTable>();
            }
        }

    @Override
    public int getRowCount() {
         return authenticationList.size();
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
        AuthenticationTable authenticationTableDetails = authenticationList.get(row);
		Object value = "";
                switch(column){
		case INDEX_USER:
			value = authenticationTableDetails.getUser();
		break;
		case INDEX_ACCOUNT:
			value = authenticationTableDetails.getAccount();
		break;
            }
                return value;         
        }
    public void addRow(AuthenticationTable authenticationTableDetails){
		authenticationList.add(authenticationTableDetails);
		fireTableDataChanged();
                AuthenticationDataManager.save(authenticationList);
	}
    public AuthenticationTable getAuthenticationTable(int row){
            return authenticationList.get(row);
        }
    public void updateRow(int row, AuthenticationTable authenticationTableDetails){
            authenticationList.set(row, authenticationTableDetails);
            fireTableDataChanged();
            AuthenticationDataManager.save(authenticationList);
        }
        
        public void deleteRow(int row){
            authenticationList.remove(row);
            fireTableDataChanged();
            AuthenticationDataManager.save(authenticationList);
    } 
}