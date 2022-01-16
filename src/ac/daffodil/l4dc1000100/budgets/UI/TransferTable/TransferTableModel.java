
package ac.daffodil.l4dc1000100.budgets.UI.TransferTable;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.TransferDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.bean.TransferTable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TransferTableModel extends AbstractTableModel{
    private ArrayList<TransferTable> transferList;

    private final String[] columns = {"Transfer Date", "Transfer From", "Transfer To", "Amount"};
    
    private static final int INDEX_TRANSFER_DATE = 0;
    private static final int INDEX_TRANSFER_FROM = 1;
    private static final int INDEX_TRANSFER_TO = 2;
    private static final int INDEX_AMOUNT = 3;
    
     public TransferTableModel(){
            transferList = TransferDataManager.load();
            if (transferList==null){
                  transferList = new ArrayList<TransferTable>();
            }
        }

    
    @Override
    public int getRowCount() {
        return transferList.size();
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
        TransferTable transferTableDetails = transferList.get(row);
		Object value = "";
                switch(column){
		case INDEX_TRANSFER_DATE:
			value = transferTableDetails.getTransferDate();
		break;
		case INDEX_TRANSFER_FROM:
			value = transferTableDetails.getAccountFrom();
		break;
                case INDEX_TRANSFER_TO:
			value = transferTableDetails.getAccountTo();
		break;
		case INDEX_AMOUNT:
			value = transferTableDetails.getAmount();
		break;
            }
                return value;         
        }
        public void addRow(TransferTable transferTableDetails){
		transferList.add(transferTableDetails);
		fireTableDataChanged();
                TransferDataManager.save(transferList);
	}
        public TransferTable getTransferTable(int row){
            return transferList.get(row);
        }
        public void updateRow(int row, TransferTable transferTableDetails){
            transferList.set(row, transferTableDetails);
            fireTableDataChanged();
            TransferDataManager.save(transferList);
        }
        
        public void deleteRow(int row){
            transferList.remove(row);
            fireTableDataChanged();
            TransferDataManager.save(transferList);
    }
}