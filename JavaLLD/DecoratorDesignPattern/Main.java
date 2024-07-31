package JavaLLD.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza base1=new Mrgareta();
        BasePizza base2=new Mushroom(base1);
        BasePizza base3=new pepperroni(new jalepeno(base2));

        System.out.println(base3.cost());
    }
}
