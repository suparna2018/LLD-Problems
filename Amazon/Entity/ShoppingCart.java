package Amazon.Entity;

import java.util.ArrayList;

public class ShoppingCart {
    User user;
    private static ShoppingCart instance=null;

   static ArrayList<ShoppingCartItem> ShoppingCartItemList;

    private ShoppingCart(User user){
        this.user=user;
        ShoppingCartItemList=new ArrayList<>();   
    }

    // SingleTon Instance Creation
    public static ShoppingCart getInstanceCart(User user){
        if(instance==null){
           instance=new ShoppingCart(user);
        }
        return instance;
    }

    public void addShoppingCart(Products products,Integer q){
        ShoppingCartItem shoppingCartItem=new ShoppingCartItem(products, q);
        ShoppingCartItemList.add(shoppingCartItem);
        // Update it in DAO layer as well
    

        System.out.println("Item Addes to Cart successfully");
    }

    public void removeFromCart(Products products){
        // Check in DAO if the item exists in Users shopping Cart then only remove it.
        ShoppingCartItem toRemovw=null;
        for(ShoppingCartItem it: ShoppingCartItemList){
            if(it.getProduct().equals(products)){
                toRemovw=it;
                break;
            }
        }
        if(toRemovw!=null){
            ShoppingCartItemList.remove(toRemovw);
            // System.out.println("Item removed sucessfully");
        }
        else{
            System.out.println("Item not found in Cart!! could not remove from cart.");
        }

    }

    public ArrayList<ShoppingCartItem> getItems() {
        return ShoppingCart.ShoppingCartItemList;
            
    }

}
