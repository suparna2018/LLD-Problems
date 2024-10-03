package SplitWise.DAO;

import java.util.HashMap;
import java.util.Map;

import SplitWise.Entity.User;

public class splitExpense {
    public HashMap<User,Integer>expenseMap=new HashMap<>();
    static Integer expenses;

    public splitExpense(){
       

    }

    public void showChart(){
        System.out.println("------------------");
        for (Map.Entry<User, Integer> entry : this.expenseMap.entrySet()) {
            User user = entry.getKey();
            Integer expense = entry.getValue();
            System.out.println("User: " + user.name + ", Expense: " + expense);
        }
    }

}

