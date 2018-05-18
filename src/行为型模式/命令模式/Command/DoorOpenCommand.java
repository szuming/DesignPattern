package 行为型模式.命令模式.Command;

import 行为型模式.命令模式.Light.Door;

public class DoorOpenCommand implements Command {
    Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
