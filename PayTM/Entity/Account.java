package PayTM.Entity;
import java.math.*;
import java.util.*;

import PayTM.DAO.UserAccountMapping;;

public class Account {
    String accNo;
    public BigDecimal AccountBalance;
    
    public Account(User User,int startingBalance){
        this.accNo=User.UserId+Math.random()*10;
        this.AccountBalance=BigDecimal.valueOf(startingBalance);
      
    }

    public BigDecimal getAccountBalance() {
       
        return this.AccountBalance;
        
    }
    // Method to withdraw money from the account
    public void withdraw(BigDecimal amount) {
        if (AccountBalance.compareTo(amount) >= 0) {
            AccountBalance = AccountBalance.subtract(amount);
        } else {
            System.out.println("Insufficient balance for withdrawal");
        }
    }

    // Method to deposit money into the account
    public void deposit(BigDecimal amount) {
        AccountBalance = AccountBalance.add(amount);
        System.out.println("Fund deposited sucessfully, Current Balance is "+this.AccountBalance);
      
    }

    @Override
    public String toString() {
        return "Account Number: " + accNo + ", Balance: " + AccountBalance;
    }
}



