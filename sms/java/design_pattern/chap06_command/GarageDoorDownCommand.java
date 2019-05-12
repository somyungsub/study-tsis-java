package design_pattern.chap06_command;

public class GarageDoorDownCommand implements Command {
    GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }
}
