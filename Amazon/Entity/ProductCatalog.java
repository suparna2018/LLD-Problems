package Amazon.Entity;
import java.util.*;

import Amazon.Entity.*;

public class ProductCatalog {
    // singleton instance
    private static ProductCatalog instance=null;

    public static HashMap<Category,List<Products>>ProductCatalog;

    private ProductCatalog(){
        ProductCatalog=new HashMap<>();
        // Add random elements in Product Catelog
        InitializeProductCatalog();
    }

    // Method to initialize a singleton instance
    public static ProductCatalog getInstance(){
        if(instance==null){
            instance=new ProductCatalog();
        }
        return instance;
    }


// Method to initialize catalog with some sample data
    private void InitializeProductCatalog() {
            Category electronics=new Category("Electronics");
            Category Clothing=new Category("Clothing");
            Category Books=new Category("Books");
           
            Products SmartPhone=new Products("Iphone",10,1000);
            Products SmartPhone2=new Products("Samsung_phone",5,500);
            Products Laptop=new Products("Macbook",10,1000);
            Products Speaker=new Products("JBL",120,50);

            Products Shirt=new Products("Shirt",10,100);
            Products Pants=new Products("Pants",150,05);

            Products BeAMonk=new Products("BeAMonk", 10, 10);
            Products AnnaHathway=new Products("AnnaHath", 10, 10);

            List<Products> electronicGoods=new ArrayList<Products>();
            electronicGoods.add(Speaker);
            electronicGoods.add(Laptop);
            electronicGoods.add(SmartPhone);
            electronicGoods.add(SmartPhone2);


            List<Products> Clothings=new ArrayList<>();
            Clothings.add(Shirt);
            Clothings.add(Pants);


            List<Products> BooksList=new ArrayList<>();
            BooksList.add(BeAMonk);
            BooksList.add(AnnaHathway);
        
            ProductCatalog.put(electronics,electronicGoods);
            ProductCatalog.put(Books, BooksList);
            ProductCatalog.put(Clothing, Clothings);

          }
public List<Products> DisplayProductCatalog(String cat){
    if(cat==null){
        for(Category category:ProductCatalog.keySet()){
            List<Products> productList=ProductCatalog.get(category);
            for(Products prod:productList){
                if(prod.isAvailable){
                    System.out.print(prod.Name+" ");
                    System.out.print(prod.Price);
                    System.out.println();
                }
            }
        }
    }
    else{
        for(Category category:ProductCatalog.keySet()){
            if(category.Category.equalsIgnoreCase(cat)){
                
            List<Products> productList=ProductCatalog.get(category);
            for(Products prod:productList){
                if(prod.isAvailable){
                    System.out.print(prod.Name+" ");
                    System.out.print(prod.Price);
                    System.out.println();
                }
            }
            return productList;
            }
           
        }
    }
    return null;
    
}

public List<Products> get(Category category) {
    return ProductCatalog.get(category);
    }

public static boolean checkStock(Products products,int quantity){
    for(Category category:ProductCatalog.keySet()){
        List<Products> productList=ProductCatalog.get(category);
        for(Products prod:productList){
            if(prod.AvlaibleQuantity<quantity){
           System.out.println("Stock Not avaiable!!!Order in lesser quantity");
           return false;
        }
    }
}
return true;
}
public static void manageStock(Products products,int quantity){
    for(Category category:ProductCatalog.keySet()){
        List<Products> productList=ProductCatalog.get(category);
        for(Products prod:productList){
            if(prod.AvlaibleQuantity>=quantity){
                prod.AvlaibleQuantity-=quantity;
        //    System.out.println("Available stock is "+prod.AvlaibleQuantity);
           return;
        }
    }
}
}

}
