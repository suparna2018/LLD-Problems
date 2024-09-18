package PayTM.Entity;
import java.sql.Date;
import java.time.LocalDateTime;
import java.lang.invoke.VarHandle.AccessMode;
import java.math.*;

public class Transaction {
    String transID;
    public LocalDateTime date;
    public User SendUser;
    public User RecieveUser;
    public BigDecimal amount;
    

    public Transaction(User senUser,User recUser,BigDecimal amount2){
        //Populate Transaction 
        this.RecieveUser=recUser;
        this.SendUser=senUser;
        this.amount=amount2;
        this.date=LocalDateTime.now();
        this.transID=this.transID = senUser.UserId + recUser.UserId + String.valueOf(LocalDateTime.now());
        
    }


}
