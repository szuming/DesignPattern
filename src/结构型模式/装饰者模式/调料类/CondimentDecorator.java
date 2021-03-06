package 结构型模式.装饰者模式.调料类;

import 结构型模式.装饰者模式.饮料类.Beverage;

/**
 * 调料类基类，也是装饰者基类，必须继承基类
 * 因为是抽象类继承抽象类，所以不需要实现父类的抽象方法cost()
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
