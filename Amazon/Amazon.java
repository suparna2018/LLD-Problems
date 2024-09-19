package Amazon;

import java.util.List;

import Amazon.Entity.Category;
import Amazon.Entity.ProductCatalog;
import Amazon.Entity.Products;
import Amazon.Entity.User;
import Amazon.Service.PlaceOrder;

public class Amazon {
    ProductCatalog productCatalog;
    Amazon(){
        productCatalog=ProductCatalog.getInstance();
        // productCatalog.DisplayProductCatalog(null);
        
    }

    public void placeOrder(User user1, String Category, String ProdName,int Quantity,String mode) {
        List<Products> prodList=productCatalog.DisplayProductCatalog(Category);

       if(prodList==null){
        System.out.println("Product not Found!!!!");
       }
        // System.out.println(ProdName);
        for(Products prod:prodList){
            // System.out.println(prod.Name);
            if(prod.Name.equalsIgnoreCase(ProdName)){
                PlaceOrder.ChooseProducts(user1,prod,Quantity,mode);

            }
        }
    }
    
}
