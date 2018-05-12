package 行为型模式.策略模式.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("无法飞行！");
    }
}
