package 创建型模式.工厂模式.抽象工厂模式;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
    }
}
