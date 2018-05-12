package 行为型模式.策略模式;

import 行为型模式.策略模式.FlyBehavior.FlyRocketPowered;

public class test {

    public static void main(String argv[]){
        //绿头鸭
        Duck duck=new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        //模型鸭，可动态设定行为
        Duck modelDuck=new MallardDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
