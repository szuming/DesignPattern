package 创建型模式.工厂模式.简单工厂模式;

public class PizzaStore {
    private simplePizzaFactory simplePizzaFactory1;

    public PizzaStore(simplePizzaFactory simplePizzaFactory1) {
        this.simplePizzaFactory1 = simplePizzaFactory1;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=simplePizzaFactory1.createPizza(type);        //根据type获取Pizza
        pizza.cook();                                       //对获取的pizza进行操作
        return pizza;
    }
}
