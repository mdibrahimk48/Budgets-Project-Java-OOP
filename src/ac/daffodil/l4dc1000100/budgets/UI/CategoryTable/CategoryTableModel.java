
package ac.daffodil.l4dc1000100.budgets.UI.CategoryTable;

import ac.daffodil.l4dc1000100.budgets.UI.bean.CategoryTable;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.CategoryDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CategoryTableModel extends AbstractTableModel{
    private ArrayList<CategoryTable> categoryList;
    
    private final String[] columns = {"Category Name", "Category Type", "Notes"};
    
    private static final int INDEX_CATEGORY_NAME = 0;
    private static final int INDEX_CATEGORY_TYPE = 1;
    private static final int INDEX_NOTES = 2;
    
    public CategoryTableModel(){
            categoryList=CategoryDataManager.load();
            if (categoryList==null){
                  categoryList = new ArrayList<CategoryTable>();
            }
        }

    @Override
    public int getRowCount() {
        return categoryList.size();    }

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
        CategoryTable categoryTableDetails = categoryList.get(row);
		String value = "";
                switch(column){
		case INDEX_CATEGORY_NAME:
			value = categoryTableDetails.getCategoryName();
		break;
		case INDEX_CATEGORY_TYPE:
			value = categoryTableDetails.getCategoryType();
		break;
                case INDEX_NOTES:
			value = categoryTableDetails.getNotes();
		break;
            }
                return value;         
        }
    public void addRow(CategoryTable categoryTableDetails){
		categoryList.add(categoryTableDetails);
		fireTableDataChanged();
                CategoryDataManager.save(categoryList);
	}
    public CategoryTable getCategoryTable(int row){
            return categoryList.get(row);
        }
    public void updateRow(int row, CategoryTable categoryTableDetails){
            categoryList.set(row, categoryTableDetails);
            fireTableDataChanged();
            CategoryDataManager.save(categoryList);
        }
        
        public void deleteRow(int row){
            categoryList.remove(row);
            fireTableDataChanged();
            CategoryDataManager.save(categoryList);
    } 
}