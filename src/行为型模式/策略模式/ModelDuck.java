package 行为型模式.策略模式;

import 行为型模式.策略模式.FlyBehavior.FlyNoWay;
import 行为型模式.策略模式.QuackBehavior.MuteQuack;

/**
 * 模型鸭，不会飞且无法说话
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
}
