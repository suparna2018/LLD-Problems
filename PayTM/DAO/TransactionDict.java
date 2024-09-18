package PayTM.DAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import PayTM.Entity.Transaction;
import PayTM.Entity.User;

public abstract class TransactionDict {
    public static Map<User,Transaction> transactiDetails=new HashMap<>();;

    TransactionDict(){
        // Map<User,Transaction> transactiDetails=new HashMap<>();

    }
    static void Transactions(User user,Transaction transaction){
        transactiDetails.put(user,transaction);

    }

    void DisplayTransRecord(User user){
        Transaction t=transactiDetails.get(user);
        System.out.println("Time: "+t.date+"The amoount "+t.amount+"rupee is send from "+t.SendUser.Name+" to user"+ t.RecieveUser);
    
    }
}
