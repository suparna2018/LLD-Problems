package Amazon.DAO;
import java.util.HashMap;
import Amazon.Entity.*;

public class UserOrderMapping {
    public static HashMap<User,Order>UserOrderMapping=new HashMap<>();


    public UserOrderMapping(User User,Order OrderPlaced){
        UserOrderMapping.put(User,OrderPlaced);
    }
    
} 
