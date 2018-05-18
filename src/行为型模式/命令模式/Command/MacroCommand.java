package 行为型模式.命令模式.Command;

//用于执行所有命令
public class MacroCommand implements Command {
    Command commands[];

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}
