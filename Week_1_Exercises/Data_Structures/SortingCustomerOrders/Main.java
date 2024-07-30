package SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O1", "Alice", 250.0),
                new Order("O2", "Bob", 150.0),
                new Order("O3", "Charlie", 300.0),
                new Order("O4", "David", 200.0),
                new Order("O5", "Eve", 100.0)
        };

        // Bubble Sort
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] orders2 = {
                new Order("O1", "Alice", 250.0),
                new Order("O2", "Bob", 150.0),
                new Order("O3", "Charlie", 300.0),
                new Order("O4", "David", 200.0),
                new Order("O5", "Eve", 100.0)
        };

        System.out.println("\nBefore Quick Sort:");
        for (Order order : orders2) {
            System.out.println(order);
        }

        QuickSort.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders2) {
            System.out.println(order);
        }
    }
}
