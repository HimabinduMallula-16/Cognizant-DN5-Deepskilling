class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class EcommerceSearch {

    static int linearSearch(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(target))
                return i;
        }
        return -1;
    }

    static int binarySearch(Product[] products, String target) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = products[mid].productName.compareToIgnoreCase(target);

            if (result == 0)
                return mid;
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Camera", "Electronics"),
                new Product(2, "Laptop", "Electronics"),
                new Product(3, "Mobile", "Electronics"),
                new Product(4, "Watch", "Accessories")
        };

        System.out.println("Linear Search Index: "
                + linearSearch(products, "Mobile"));

        System.out.println("Binary Search Index: "
                + binarySearch(products, "Mobile"));
    }
} 
