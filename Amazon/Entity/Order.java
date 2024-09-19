package Amazon.Entity;

public class Order {
    PaymentInfo paymentInfo;
    ShoppingCart shoppingCart;
    int TotalSum;


    public Order(ShoppingCart shoppingCart,PaymentInfo paymentInfo){
        int sum=0;
        this.shoppingCart=shoppingCart;
        this.paymentInfo=paymentInfo;

        for(ShoppingCartItem shoppingCartItem :shoppingCart.getItems()){
            sum+=shoppingCartItem.Price;
        }
        this.TotalSum=sum;
        if(paymentInfo.PaymentInfo(this.TotalSum)){
            System.out.println("Order Placed Sucessfully!!!! ");
        }

    }

}
