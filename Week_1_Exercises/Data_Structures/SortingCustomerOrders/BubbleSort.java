package SortingCustomerOrders;

public class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order.swap(orders[j], orders[j+1]);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
