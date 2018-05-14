package 创建型模式.工厂模式.抽象工厂模式;

public class NYPizzaStore extends 创建型模式.工厂模式.抽象工厂模式.PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("ckam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
