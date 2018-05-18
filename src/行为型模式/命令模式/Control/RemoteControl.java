package 行为型模式.命令模式.Control;

import 行为型模式.命令模式.Command.Command;
import 行为型模式.命令模式.Command.NoCommand;

public class RemoteControl {
    Command onCommands[];       //一个遥控器上有多个开按钮
    Command offCommands[];      //一个遥控器上有多个开按钮
    Command undoCommand;         //记录最后的操作

    public RemoteControl() {
        onCommands=new Command[3];
        offCommands=new Command[3];
        Command noCommand=new NoCommand();          //初始化空命令
        for(int i=0;i<3;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setOnCommands(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed(){          //只要按下撤销命令，则根据undoCommand来执行撤销动作
        undoCommand.undo();
    }

    public String toString(){
        return "hello world!";
    }
}
