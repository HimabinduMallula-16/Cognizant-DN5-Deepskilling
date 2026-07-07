/**
 * Test class demonstrating the Command Pattern.
 * Shows issuing turn on/off commands to devices via a RemoteControl invoker.
 */
public class HomeAutomationTest {

    public static void main(String[] args) {

        // Receivers
        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight = new Light("Bedroom");

        // Commands
        Command livingRoomOn = new LightOnCommand(livingRoomLight);
        Command livingRoomOff = new LightOffCommand(livingRoomLight);
        Command bedroomOn = new LightOnCommand(bedroomLight);
        Command bedroomOff = new LightOffCommand(bedroomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        System.out.println("--- Controlling Living Room Light ---");
        remote.setCommand(livingRoomOn);
        remote.pressButton();

        remote.setCommand(livingRoomOff);
        remote.pressButton();

        System.out.println("\n--- Controlling Bedroom Light ---");
        remote.setCommand(bedroomOn);
        remote.pressButton();

        remote.setCommand(bedroomOff);
        remote.pressButton();
    }
}
