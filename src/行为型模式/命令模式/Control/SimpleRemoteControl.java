package 行为型模式.命令模式.Control;

import 行为型模式.命令模式.Command.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){        //这个方法使得遥控器可以按需求设置不同命令
        slot=command;
    }

    public void buttonWasPressed(){                 //一旦按钮被按下，就会调用命令的execute方法
        slot.execute();
    }
}
