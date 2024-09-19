package Amazon;
import Amazon.Entity.User;
import Amazon.Entity.Category;
import Amazon.Service.PlaceOrder;

public class Main {
    public static void main(String[] args) {
        Amazon amazon=new Amazon();
        User user1=new User("Suparna");
        User user2=new User("Rudraneel");
        
         // Placing an order with a valid product name, quantity, and payment mode
        amazon.placeOrder(user1,"clothing","Shirt",2,"COD");
        amazon.placeOrder(user1,"Electronics","Iphone",2,"prepaid");
        amazon.placeOrder(user2,"clothing","Shirt",4,"COD");

    }
}
