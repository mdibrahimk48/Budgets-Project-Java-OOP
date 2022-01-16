
package ac.daffodil.l4dc1000100.budgets.UI.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class TransferTable implements Serializable{
    
    private String id;
    private Date transferDate;
    private AccountTable accountFrom;
    private AccountTable accountTo;
    private double Amount;
    private String transferDetails;
    
    
    public TransferTable(){
        
    }

    public String getId() {
        return id;
    }

    public AccountTable getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(AccountTable accountFrom) {
        this.accountFrom = accountFrom;
    }

    public AccountTable getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(AccountTable accountTo) {
        this.accountTo = accountTo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public String getTransferDetails() {
        return transferDetails;
    }

    public void setTransferDetails(String transferDetails) {
        this.transferDetails = transferDetails;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final TransferTable other = (TransferTable) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
