
package ac.daffodil.l4dc1000100.budgets.UI.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class TransactionTable implements Serializable{
    private Date date;
    private CategoryTable category;
    private AccountTable account;
    private double amount;
    private String payee;
    private String note;
    private String id;
    
    public TransactionTable(){
        
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CategoryTable getCategory() {
        return category;
    }

    public void setCategory(CategoryTable category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AccountTable getAccount() {
        return account;
    }

    public void setAccount(AccountTable account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPayee() {
        return payee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TransactionTable other = (TransactionTable) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
