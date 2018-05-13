package 结构型模式.装饰者模式.饮料类;

/**
 * 另一种饮料
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description="HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
