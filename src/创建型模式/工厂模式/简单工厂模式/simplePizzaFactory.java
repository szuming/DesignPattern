package 创建型模式.工厂模式.简单工厂模式;

public class simplePizzaFactory {
    /**
     * 创建Pizza
     * @param type Pizza的类型
     * @return  新建的Pizza
     */
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("cheese"))pizza=new CheesePizza();
        else if(type.equals("clam"))pizza=new ClamPizza();
        return pizza;
    }
}
