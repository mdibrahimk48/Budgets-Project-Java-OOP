
package ac.daffodil.l4dc1000100.budgets.UI.ScheduleTable;

import ac.daffodil.l4dc1000100.budgets.UI.bean.ScheduleTable;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.ScheduleDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ScheduleTableModel extends AbstractTableModel{
    private ArrayList<ScheduleTable> scheduleList;

    private final String[] columns = {"Date",
        "Account", "Category","Amount", "Payee", "Note"};
    
        private static final int INDEX_DATE = 0;
	private static final int INDEX_ACCOUNT = 1;
        private static final int INDEX_CATEGORY = 2;
	private static final int INDEX_AMOUNT = 3;
        private static final int INDEX_PAYEE = 4;
        private static final int INDEX_NOTE = 5;
      
    public ScheduleTableModel(){
            scheduleList = ScheduleDataManager.getUserScheduleList();
            if (scheduleList == null){
                  scheduleList = new ArrayList<ScheduleTable>();
            }
        }
    
    @Override
    public int getRowCount() {
        return scheduleList.size();
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
       ScheduleTable scheduleTableDetails = scheduleList.get(row);
       
		Object value = "";
                switch(column){
		case INDEX_DATE:
			value = String.valueOf(scheduleTableDetails.getDate());
		break;
		case INDEX_ACCOUNT:
			value = scheduleTableDetails.getAccount();
		break;
                case INDEX_CATEGORY:
			value = scheduleTableDetails.getCategory();
		break;
                case INDEX_AMOUNT:
			value = scheduleTableDetails.getAmount();
		break;
                case INDEX_PAYEE:
                value = scheduleTableDetails.getPayee();
                break;
            case INDEX_NOTE:
                value = scheduleTableDetails.getNote();
		}
		return value;
            }
     public void addRow(ScheduleTable scheduleTableDetails){
		scheduleList.add(scheduleTableDetails);
		fireTableDataChanged();
                ScheduleDataManager.add(scheduleTableDetails);
	}
     
    public ScheduleTable getScheduleTable(int row){
            return scheduleList.get(row);
        }
    
    public void updateRow(int row, ScheduleTable scheduleTableDetails){
            scheduleList.set(row, scheduleTableDetails);
            fireTableDataChanged();
            ScheduleDataManager.update(scheduleTableDetails);
        }
        
        public void deleteRow(int row){
            ScheduleTable scheduleTableDetails = scheduleList.get(row);
            scheduleList.remove(row);
            fireTableDataChanged();
            ScheduleDataManager.delete(scheduleTableDetails);
    }
}