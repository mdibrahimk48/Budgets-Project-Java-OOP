package ac.daffodil.l4dc1000100.budgets.UI.TransactionTable;

import ac.daffodil.l4dc1000100.budgets.UI.DataManager.AccountDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.bean.TransactionTable;
import ac.daffodil.l4dc1000100.budgets.UI.DataManager.TransactionDataManager;
import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TransactionTableModel extends AbstractTableModel {

    private ArrayList<TransactionTable> transactionList;

    private final String[] columns = {"Date", "Category",
        "Account", "Amount", "Payee", "Note"};

    private static final int INDEX_DATE = 0;
    private static final int INDEX_CATEGORY = 1;
    private static final int INDEX_ACCOUNT = 2;
    private static final int INDEX_AMOUNT = 3;
    private static final int INDEX_PAYEE = 4;
    private static final int INDEX_NOTE = 5;

    public TransactionTableModel() {
        transactionList = TransactionDataManager.getUserTransactionList();
        if (transactionList == null) {
            transactionList = new ArrayList<TransactionTable>();
        }
    }

    @Override
    public int getRowCount() {
        return transactionList.size();
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
        TransactionTable transactionTableDetails = transactionList.get(row);

        Object value = "";
        switch (column) {
            case INDEX_DATE:
                value = String.valueOf(transactionTableDetails.getDate());
                break;
            case INDEX_CATEGORY:
                value = transactionTableDetails.getCategory();
                break;
            case INDEX_ACCOUNT:
                value = transactionTableDetails.getAccount();
                break;
            case INDEX_AMOUNT:
                value = String.valueOf(transactionTableDetails.getAmount());
                break;
            case INDEX_PAYEE:
                value = transactionTableDetails.getPayee();
                break;
            case INDEX_NOTE:
                value = transactionTableDetails.getNote();
        }
        return value;
    }

    public void addRow(TransactionTable transactionTableDetails) {
        transactionList.add(transactionTableDetails);
        fireTableDataChanged();
        TransactionDataManager.add(transactionTableDetails);
    }

    public TransactionTable getTransactionTable(int row) {
        return transactionList.get(row);
    }

    public void updateRow(int row, TransactionTable transactionTableDetails) {
        transactionList.set(row, transactionTableDetails);
        fireTableDataChanged();
        TransactionDataManager.update(transactionTableDetails);
    }

    public void deleteRow(int row) {
        TransactionTable transactionTableDetails = transactionList.get(row);
        transactionList.remove(row);
        fireTableDataChanged();
        TransactionDataManager.delete(transactionTableDetails);
    }

    public double getTotal() {
        double total = 0;
        double balance = 0;
        ArrayList<AccountTable> accountList = AccountDataManager.getUserAccountList();
        for (int j = 0; j < accountList.size(); j++) {
            balance += accountList.get(j).getInitialAmount();
        }

        for (int i = 0; i < transactionList.size(); i++) {
            TransactionTable transactionTable = transactionList.get(i);
            if (transactionTable.getCategory().getCategoryType().equalsIgnoreCase("Income")) {
                total = total + balance + transactionTable.getAmount();
            } else if (transactionTable.getCategory().getCategoryType().equalsIgnoreCase("Expense")) {
                total = total + balance - transactionTable.getAmount();
            }
        }
        return total;
    }
}
