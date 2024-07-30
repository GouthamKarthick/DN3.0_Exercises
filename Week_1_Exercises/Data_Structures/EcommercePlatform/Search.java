package EcommercePlatform;

class Search {
    // Linear search algorithm
    public static int linearSearch(Product[] products, String targetProductName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(targetProductName)) {
                return i;
            }
        }
        return -1;
    }

    // Binary search algorithm
    public static int binarySearch(Product[] products, String targetProductName) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(targetProductName);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Smartphone", "Electronics"),
            new Product("3", "Tablet", "Electronics"),
            new Product("4", "Headphones", "Accessories"),
            new Product("5", "Charger", "Accessories")
        };

        java.util.Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));

        String searchTarget = "Tablet";
        int linearSearchResult = linearSearch(products, searchTarget);
        if (linearSearchResult != -1) {
            System.out.println("Linear Search: Found " + products[linearSearchResult]);
        } else {
            System.out.println("Linear Search: Product not found");
        }

        int binarySearchResult = binarySearch(products, searchTarget);
        if (binarySearchResult != -1) {
            System.out.println("Binary Search: Found " + products[binarySearchResult]);
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}