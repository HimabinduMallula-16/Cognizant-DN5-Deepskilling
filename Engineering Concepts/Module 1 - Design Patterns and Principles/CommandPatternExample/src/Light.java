/**
 * Receiver class: knows how to perform the actual operations
 * (turning on/off) that commands will trigger.
 */
public class Light {

    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        System.out.println(location + " light is now ON.");
    }

    public void turnOff() {
        System.out.println(location + " light is now OFF.");
    }
}
