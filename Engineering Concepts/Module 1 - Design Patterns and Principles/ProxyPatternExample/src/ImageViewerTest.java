/**
 * Test class demonstrating the Proxy Pattern.
 * Shows lazy initialization (image is only loaded on first display)
 * and caching (subsequent displays reuse the loaded image).
 */
public class ImageViewerTest {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("=== First call to image1.display() ===");
        image1.display(); // triggers real load

        System.out.println("\n=== Second call to image1.display() ===");
        image1.display(); // uses cached RealImage, no reload

        System.out.println("\n=== First call to image2.display() ===");
        image2.display(); // triggers real load for a different image

        System.out.println("\n=== Second call to image2.display() ===");
        image2.display(); // uses cached RealImage
    }
}
