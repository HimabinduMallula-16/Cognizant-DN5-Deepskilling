/**
 * Real Subject: represents the actual image that is expensive to load
 * (simulates loading the image from a remote server).
 */
public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image \"" + fileName + "\" from remote server... (expensive operation)");
        try {
            Thread.sleep(200); // simulate network delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Image \"" + fileName + "\" loaded successfully.");
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
