package PayTM.DAO;
import java.util.HashMap;

import PayTM.Entity.Account;
import PayTM.Entity.Transaction;
import PayTM.Entity.User;


public class UserAccountMapping {
    public static HashMap<User,Account> UserAccTable=new HashMap<>();;


    public UserAccountMapping(User user,Account account){
        //Populate it 
        UserAccTable.put(user,account);
    }

    public void addUserAccount(User user,Account account){
        UserAccTable.put(user,account);

    }
    void getUserAccountDetails(User User){
        UserAccTable.get(User);
    }
    void transactiDetails(Transaction transaction){

    }
}
