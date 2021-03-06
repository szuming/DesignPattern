package 创建型模式.工厂模式.工厂方法模式;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);                  //调用的createPizza方法是抽象方法，根据具体子类的实现来获取具体的Pizza
        pizza.cook();
        return pizza;
    }

    abstract Pizza createPizza(String type);     //将create方法放回PizzaStore中
}
