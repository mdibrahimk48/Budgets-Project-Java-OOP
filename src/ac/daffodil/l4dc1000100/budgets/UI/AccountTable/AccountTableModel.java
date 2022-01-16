
package ac.daffodil.l4dc1000100.budgets.UI.AccountTable;

import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AccountDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AccountTableModel extends AbstractTableModel{
    private ArrayList<AccountTable> accountList;
    
     private final String[] columns = {"Account Type", "Account Name", "Account No",
        "Bank Name", "Holder Name",
        "Occupation", "Initial Amount", "Biling Date", "Payment Date", "Notes", "Balance", "Month End Balance"};
     
        private static final int INDEX_ACCOUNT_TYPE = 0;
	private static final int INDEX_ACCOUNT_NAME = 1;
	private static final int INDEX_ACCOUNT_NO = 2;
        private static final int INDEX_BANK_NAME = 3;
	private static final int INDEX_HOLDER_NAME = 4;
	private static final int INDEX_OCCUPATION = 5;
        private static final int INDEX_INITIAL_AMOUNT = 6;
	private static final int INDEX_BILLING_DATE = 7;
	private static final int INDEX_PAYMENT_DATE = 8;
        private static final int INDEX_NOTES = 9;
        
        private static final int INDEX_BALANCE = 10;
        
        public AccountTableModel(){
            accountList=AccountDataManager.load();
            if (accountList==null){
                  accountList = new ArrayList<AccountTable>();
            }
        }

    @Override
    public int getRowCount() {
        return accountList.size();
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
        AccountTable accountTableDetails = accountList.get(row);
		Object value = "";
                switch(column){
		case INDEX_ACCOUNT_TYPE:
			value = accountTableDetails.getSelectAccountType();
		break;
		case INDEX_ACCOUNT_NAME:
			value = accountTableDetails.getAccountName();
		break;
		case INDEX_ACCOUNT_NO:
			value = accountTableDetails.getAccountNo();
		break;
                case INDEX_BANK_NAME:
			value = accountTableDetails.getBankName();
		break;
                case INDEX_HOLDER_NAME:
			value = accountTableDetails.getAccountHolderName();
		break;
                case INDEX_OCCUPATION:
			value = accountTableDetails.getOccupationDetails();
		break;
                case INDEX_INITIAL_AMOUNT:
			value = accountTableDetails.getInitialAmount();
		break;
                case INDEX_BILLING_DATE:
			value = accountTableDetails.getBillingDate();
		break;
                case INDEX_PAYMENT_DATE:
			value = accountTableDetails.getPaymentDate();
		break;
                case INDEX_NOTES:
			value = accountTableDetails.getNotes();
		break;
                
                case INDEX_BALANCE:
			value = accountTableDetails.getBalance();
		break;
		}
		return value;
            }
    public void addRow(AccountTable accountTableDetails){
		accountList.add(accountTableDetails);
		fireTableDataChanged();
                AccountDataManager.save(accountList);
	}
    public AccountTable getAccountTable(int row){
            return accountList.get(row);
        }
    public void updateRow(int row, AccountTable accountTableDetails){
            accountList.set(row, accountTableDetails);
            fireTableDataChanged();
            AccountDataManager.save(accountList);
        }
        
        public void deleteRow(int row){
            accountList.remove(row);
            fireTableDataChanged();
            AccountDataManager.save(accountList);
    } 
}