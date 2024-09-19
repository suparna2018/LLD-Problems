package Amazon.Entity;

public class Products {
    public String Name;
    Category Category;
    String prodId;
    int Price;
    int AvlaibleQuantity;
    Boolean isAvailable=true;
    String suplierName;
    Products(String Name,int q,int Price){
        //Fill This
        this.Name=Name;
        this.AvlaibleQuantity=q;
        if(this.AvlaibleQuantity>0){
            isAvailable=true;
        }
        this.Price=Price;
    }

}
