package 行为型模式.命令模式;

import 行为型模式.命令模式.Command.DoorOpenCommand;
import 行为型模式.命令模式.Command.LightOnCommand;
import 行为型模式.命令模式.Control.SimpleRemoteControl;
import 行为型模式.命令模式.Light.Door;
import 行为型模式.命令模式.Light.Light;

public class SimpleRemoteContrlTest {
    public static void main(String argv[]){
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();      //遥控器对象
        Light light=new Light();                                                //灯对象
        LightOnCommand lightOn=new LightOnCommand(light);                       //开灯命令
        simpleRemoteControl.setCommand(lightOn);                                //遥控器设置开灯命令
        simpleRemoteControl.buttonWasPressed();                                 //按下按钮执行开灯命令

        Door door=new Door();
        DoorOpenCommand doorOpenCommand=new DoorOpenCommand(door);
        simpleRemoteControl.setCommand(doorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
