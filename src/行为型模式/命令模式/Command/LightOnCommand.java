package 行为型模式.命令模式.Command;

import 行为型模式.命令模式.Light.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {        //传入的Light对象在execute被调用时会作为命令接受者
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
