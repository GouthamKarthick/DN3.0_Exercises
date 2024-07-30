package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

class InventoryManagement {
    private Map<String, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagement ims = new InventoryManagement();
        Product p1 = new Product("P001", "Product 1", 10, 100.0);
        Product p2 = new Product("P002", "Product 2", 5, 50.0);

        ims.addProduct(p1);
        ims.addProduct(p2);
        ims.displayInventory();

        ims.updateProduct("P001", 15, 120.0);
        ims.displayInventory();

        ims.deleteProduct("P002");
        ims.displayInventory();
    }
}