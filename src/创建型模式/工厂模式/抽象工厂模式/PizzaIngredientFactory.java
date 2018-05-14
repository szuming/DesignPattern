package 创建型模式.工厂模式.抽象工厂模式;

public interface PizzaIngredientFactory {
    public String createDough();
    public String createSauce();
    public String createClam();
}
