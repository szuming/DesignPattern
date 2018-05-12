package 行为型模式.策略模式.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("无法发声!");
    }
}
