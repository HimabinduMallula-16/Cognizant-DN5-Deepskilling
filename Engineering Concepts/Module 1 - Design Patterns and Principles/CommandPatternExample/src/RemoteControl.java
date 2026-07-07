/**
 * Invoker class: holds a reference to a Command and triggers it
 * without needing to know the details of how the command works.
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            System.out.println("No command set for this remote control.");
            return;
        }
        command.execute();
    }
}
