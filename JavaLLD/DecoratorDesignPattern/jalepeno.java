package JavaLLD.DecoratorDesignPattern;


public class jalepeno extends ToppingDecorator{
    BasePizza basePizza;

    public jalepeno(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+90;
    }
}
