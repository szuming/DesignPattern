package 创建型模式.工厂模式.抽象工厂模式;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "NYDough";
    }

    @Override
    public String createSauce() {
        return "NYSauce";
    }

    @Override
    public String createClam() {
        return "Clam";
    }
}
