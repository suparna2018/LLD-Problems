package BookMyShow.Entity;

import javax.print.attribute.standard.MediaSize.NA;

public class User {
    public String Name;
    String email;
    int PhNumber;

    public User(String Name,String email,int i){
        this.Name=Name;
        this.email=email;
        this.PhNumber=i;
    }
    
}
