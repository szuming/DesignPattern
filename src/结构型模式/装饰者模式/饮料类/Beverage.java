package 结构型模式.装饰者模式.饮料类;

public abstract class Beverage {
    String description="Unknown Beverage";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
