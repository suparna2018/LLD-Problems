package PayTM;

import java.math.BigDecimal;

import PayTM.DAO.UserAccountMapping;
import PayTM.Entity.Account;
import PayTM.Entity.User;
import PayTM.Service.WalletService;

public class Main {

    public static void main(String[] args) {
          // Create user
    User user1=new User("Suparna Bhattacharya",1234654);
    Account a1=new Account(user1,1000);

    User user2=new User("Rudraneel Bhattacharya",2345756);
    Account a2=new Account(user2,1000); 

   
    UserAccountMapping table1=new UserAccountMapping(user2, a2);
    table1.addUserAccount(user1,a1);

    WalletService wallet=new WalletService();
    wallet.sendMoney(user1,user2,BigDecimal.valueOf(100));

    
    
    System.out.println("User1's balance: " + a1.getAccountBalance());
    System.out.println("User2's balance: " + a2.getAccountBalance());

    }
  


    

}
