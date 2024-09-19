package Amazon.Service;

import Amazon.DAO.UserOrderMapping;
import Amazon.Entity.Order;
import Amazon.Entity.PaymentInfo;
import Amazon.Entity.ProductCatalog;
import Amazon.Entity.Products;
import Amazon.Entity.ShoppingCart;
import Amazon.Entity.ShoppingCartItem;
import Amazon.Entity.User;

public class PlaceOrder {

    public static void ChooseProducts(User User,Products Products,int Quantity,String mode){
        if(ProductCatalog.checkStock(Products,Quantity)){
            ProductCatalog.manageStock(Products,Quantity);
           
    
        ShoppingCart ShoppingCart=Amazon.Entity.ShoppingCart.getInstanceCart(User);
        ShoppingCart.addShoppingCart(Products,Quantity);
        // Start a paymentInfo Object
        PaymentInfo paymentInfo=new PaymentInfo(mode);

        // Create Order and Place Order
      
        Order Order=new Order(ShoppingCart,paymentInfo);
        UserOrderMapping.UserOrderMapping.put(User,Order);
        ShoppingCart.removeFromCart(Products);
        System.out.println("_____________________________________");
    }
    else{
        return;
    }
    }

}
