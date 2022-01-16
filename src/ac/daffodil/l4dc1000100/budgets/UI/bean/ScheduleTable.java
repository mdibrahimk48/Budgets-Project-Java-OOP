package ac.daffodil.l4dc1000100.budgets.UI.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ScheduleTable implements Serializable{
    private String id;
    private Date date;
    private AccountTable account;
    private CategoryTable category;
    private double amount;
    private String payee;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public CategoryTable getCategory() {
        return category;
    }

    public void setCategory(CategoryTable category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final ScheduleTable other = (ScheduleTable) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
  }
