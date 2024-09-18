package PayTM.Service;

import java.math.BigDecimal;

import PayTM.DAO.TransactionDict;
import PayTM.DAO.UserAccountMapping;
import PayTM.Entity.Account;
import PayTM.Entity.Transaction;
import PayTM.Entity.User;

public class WalletService {
    
    void checkBalance(User user){
       Account a= UserAccountMapping.UserAccTable.get(user);
       System.out.println("The current balance is "+ a.toString() +" rupees");
    }

    public void sendMoney(User sendUser,User recUser,BigDecimal amount){
        Account senderAccount = UserAccountMapping.UserAccTable.get(sendUser);
        Account receiverAccount = UserAccountMapping.UserAccTable.get(recUser);

        // Check if accounts exist and sender has enough balance
        if (senderAccount != null && receiverAccount != null) {
            if (senderAccount.getAccountBalance().compareTo(amount) >= 0) {
                // Subtract amount from sender and add to receiver
                senderAccount.withdraw(amount);
                receiverAccount.deposit(amount);

                // Create and log the transaction
                Transaction transaction = new Transaction(sendUser, recUser, amount);
                TransactionDict.transactiDetails.put(sendUser,transaction);
                TransactionDict.transactiDetails.put(recUser,transaction);

                System.out.println("Transaction successful! Sent " + amount + " rupees from " + sendUser.UserId + " to " + recUser.UserId);
            } else {
                System.out.println("Insufficient balance in sender's account");
            }
        } else {
            System.out.println("Either sender or receiver account is not found");
        }


    }

}
