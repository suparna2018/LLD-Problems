package Amazon.Entity;

public class ShoppingCartItem {
    Products product;
    Integer Quantity;
    int Price;

    public ShoppingCartItem(Products products,Integer quant){
        this.product=products;
        this.Quantity=quant;
        this.Price=quant*(products.Price);
    }

    public Object getProduct() {
        return this.product;
    }

    public Integer getQuantity() {
        return this.Quantity;
        
    }
}
