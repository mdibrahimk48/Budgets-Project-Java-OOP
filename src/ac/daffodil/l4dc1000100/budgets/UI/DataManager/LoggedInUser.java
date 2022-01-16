
package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.UserTable;

public class LoggedInUser {
    private UserTable userDetailsTable;
    
    private static LoggedInUser instance;
    
    private LoggedInUser(){
        
    }

    public static LoggedInUser getInstance(){
        if(instance == null){
            instance = new LoggedInUser();
        }
        return instance;
    }
    
    public UserTable getUserDetailsTable() {
        return userDetailsTable;
    }

    public void setUserDetailsTable(UserTable userDetailsTable) {
        this.userDetailsTable = userDetailsTable;
    }  
}