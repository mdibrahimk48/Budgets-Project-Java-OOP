
package ac.daffodil.l4dc1000100.budgets.UI.bean;

import java.io.Serializable;
import java.util.Objects;

public class AuthenticationTable implements Serializable{
    private String id;
    private UserTable user;
    private AccountTable account;
   
    public AuthenticationTable(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserTable getUser() {
        return user;
    }

    public void setUser(UserTable user) {
        this.user = user;
    }

    public AccountTable getAccount() {
        return account;
    }

    public void setAccount(AccountTable account) {
        this.account = account;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final AuthenticationTable other = (AuthenticationTable) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
