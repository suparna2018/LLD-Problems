package SplitWise;

import java.util.ArrayList;

import javax.swing.GroupLayout.Group;

import SplitWise.DAO.splitExpense;
import SplitWise.Entity.User;

public class main {
    public static void main(String[] args) {
    User A=new User("A");
    User B=new User("B");
    User c=new User("C");
    User D=new User("D");
    User E=new User("E");
    ArrayList Group=new ArrayList<>();
    Group.add(A);
    Group.add(B);
    Group.add(c);
    Group.add(D);
    Group.add(E);
    A.AddExpense(7000, 5,Group);
    System.out.println("A chart");
    A.splitExpense.showChart();
    System.out.println();
    c.AddExpense(5000,5,Group);
    System.out.println("C chart");
    c.splitExpense.showChart();

    System.out.println("A chart");
    A.splitExpense.showChart();
    System.out.println("B chart");
    B.splitExpense.showChart();
    System.out.println("D chart");
    D.splitExpense.showChart();
    }
    
}


// Use case
// A- 7000               
// --------------------
// A-500
// B-4000
// C-1000
// D-1000
// E-500
// --------------------