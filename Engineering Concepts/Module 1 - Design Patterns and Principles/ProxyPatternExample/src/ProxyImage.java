/**
 * Proxy: controls access to RealImage.
 * Provides lazy initialization (the real image is only loaded when
 * display() is first called) and caching (subsequent calls reuse the
 * already-loaded RealImage instance instead of reloading it).
 */
public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage; // not created until needed (lazy init / cache)

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("ProxyImage: no cached image found, loading now.");
            realImage = new RealImage(fileName);
        } else {
            System.out.println("ProxyImage: using cached image, skipping reload.");
        }
        realImage.display();
    }
}
