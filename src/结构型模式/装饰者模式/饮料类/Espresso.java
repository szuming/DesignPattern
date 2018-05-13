package 结构型模式.装饰者模式.饮料类;

/**
 * 继承基类饮料类
 */
public class Espresso extends Beverage {
    public Espresso() {
        description="Espresso!";
    }

    @Override
    public double cost() {
        return 2;
    }
}
