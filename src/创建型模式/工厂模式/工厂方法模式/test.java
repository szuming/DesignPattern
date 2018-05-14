package 创建型模式.工厂模式.工厂方法模式;

public class test {
    public static void main(String argv[]){
        PizzaStore pizzaStore=new NYStylePizzaStore();      //获取一个工厂实例
        pizzaStore.orderPizza("cheese");              //调用其orderPizza来获取pizza
    }
}
