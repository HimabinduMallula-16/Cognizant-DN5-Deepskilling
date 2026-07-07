class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int id, String name, double price) {
        orderId = id;
        customerName = name;
        totalPrice = price;
    }
}

public class SortingCustomerOrders {

    static void bubbleSort(Order[] orders) {
        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static int partition(Order[] arr, int low, int high) {

        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].totalPrice < pivot) {

                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(Order[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void display(Order[] orders) {
        for (Order o : orders)
            System.out.println(o.orderId + " " + o.customerName + " " + o.totalPrice);
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(1, "Rahul", 5000),
                new Order(2, "Shanmukha", 12000),
                new Order(3, "Priya", 8000)
        };

        quickSort(orders, 0, orders.length - 1);

        System.out.println("Sorted Orders:");
        display(orders);
    }
}