package JavaLLD.DecoratorDesignPattern;

public class pepperroni extends ToppingDecorator{
    BasePizza basePizza;

    public pepperroni(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
