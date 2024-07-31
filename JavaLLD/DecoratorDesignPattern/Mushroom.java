package JavaLLD.DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
