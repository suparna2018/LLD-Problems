package PayTM.Entity;

import PayTM.DAO.UserAccountMapping;

public class User {
    public String UserId;
    public String Name;
    int PhoneNum;
    
    
    public User(String Name,int PhoneNum){
        //Populate the variables
        Integer token=(int) (Math.random() * 1319);
        String UserId=Name+ token.toString() +(PhoneNum*11);
        this.Name=Name;
        this.PhoneNum=PhoneNum;
        this.UserId=UserId;
        
        
    }
    


}
