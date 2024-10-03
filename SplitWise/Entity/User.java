package SplitWise.Entity;
import java.util.ArrayList;
import java.util.UUID;

import javax.management.Notification;

import SplitWise.DAO.splitExpense;


public class User {
    public String name;
    String userId;
    public Integer debt=0;
    Integer owe=0;
    public splitExpense splitExpense=new splitExpense();

    public User(String name){
        this.name=name;
    }

    public void AddExpense(Integer expense,Integer people,ArrayList<User> Group){
        // splitExpense.expenseMap.put(name,expense/people);
        this.owe=expense;
        for(int i=0;i<Group.size();i++){

            if (this!=Group.get(i)){    
                Integer debtVal=0;
                if (splitExpense.expenseMap.containsKey(Group.get(i))){
                    debtVal=splitExpense.expenseMap.get(Group.get(i));
                }
                
                debtVal+=(expense/people);
                splitExpense.expenseMap.put(Group.get(i),debtVal);
                Integer othersOwe=0;
                if (Group.get(i).splitExpense.expenseMap.containsKey(this)){
                    othersOwe=Group.get(i).splitExpense.expenseMap.get(this);
                }
               
                Group.get(i).splitExpense.expenseMap.put(this,othersOwe-expense/people);
                // Notification(Group.get(i));
            }
            
        }
        
    }

    public Integer checkDebt(){

        return this.debt;
        
    }

    public boolean oweMoney(User user){
        if (splitExpense.expenseMap.get(user)>=0){
            return true;
        }
        return false;

    }

    public void settleDebt(User user){
       
    }
    
    public void Notification(User user){
        if (this.oweMoney(user)){
            System.out.println(user.name +", You owe: "+splitExpense.expenseMap.get(user)+" to "+this.name);
        
        }

            System.out.println("Heyy, "+user.name +", "+this.name +" owes you "+this.debt);
        
    }
    
}
