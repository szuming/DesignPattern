package 行为型模式.命令模式.Command;

import 行为型模式.命令模式.Light.Door;

public class DoorCloseCommand implements Command {
    Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }
}
